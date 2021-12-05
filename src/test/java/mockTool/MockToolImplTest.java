package mockTool;

import org.junit.Test;

import static mockTool.MockProvider.ONLY_RECORDED_MOCK_ID;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class MockToolImplTest {

    @Test
    public void shouldReturnMock() {
        // given
        RequestId requestId = new RequestId(ONLY_RECORDED_MOCK_ID);

        // when
        MockTool mockTool = new MockToolImpl(new MockProvider());
        String mock = mockTool.mock(requestId);

        // then
        assertThat(mock).isNotNull();
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