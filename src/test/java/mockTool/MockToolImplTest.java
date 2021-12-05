package mockTool;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javaAnotation.Java14_Records;
import org.junit.Test;

import java.io.IOException;

import static mockTool.MockProvider.ONLY_RECORDED_MOCK_ID;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

@Java14_Records
public class MockToolImplTest {

    @Test
    public void shouldReturnMock() throws IOException {

        // given
        RequestId requestId = new RequestId(ONLY_RECORDED_MOCK_ID);

        // when
        MockTool mockTool = new MockToolImpl(new MockProvider());
        String mock = mockTool.mock(requestId);

        // then
        assertThat(mock).isNotNull();

        UserRecord user = new ObjectMapperSupplier().get().readValue(mock, UserRecord.class);
        assertThat(user).isNotNull();
        assertThat(user.id()).isEqualTo(1);
        assertThat(user.user_name()).isEqualTo("gregavola");
    }

    @Test
    public void shouldThrowExceptionForNullId() {

        // given
        RequestId requestId = null;

        // when
        MockTool mockTool = new MockToolImpl(new MockProvider());

        // then
        assertThatThrownBy(() ->  mockTool.mock(requestId))
                .isInstanceOf(MockNotExistsException.class);
    }

    @Test
    public void shouldThrowExceptionForNotRecordedMock() {

        // given
        RequestId requestId = new RequestId("not_existing_id");

        // when
        MockTool mockTool = new MockToolImpl(new MockProvider());

        // then
        assertThatThrownBy(() ->  mockTool.mock(requestId))
                .isInstanceOf(MockNotExistsException.class);
    }
}