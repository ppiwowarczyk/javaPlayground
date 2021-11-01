import org.junit.Test;
import javaAnotation.Java11_Optional_Empty;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@Java11_Optional_Empty
public class OptionalChangesTest
{
    @Test
    public void shouldUseEmptyCheckInOptional()
    {
        // given
        boolean option = Optional.ofNullable(null).isEmpty();

        // when

        //then
        assertThat(option).isTrue();
    }
}
