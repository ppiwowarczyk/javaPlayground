package collectDemo;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CollectorSumAndAverageTest {
    @Test
    public void shouldNotCollectZerosFOrNullList() {
        // given
        List<Integer> integers = null;

        // when
        CollectorSumAndAverage collectorSumAndAverage = new CollectorSumAndAverage();
        CollectingResult collect = collectorSumAndAverage.collect(integers);

        // then
        assertThat(collect.getSum()).isEqualTo(0);
        assertThat(collect.getAverage()).isEqualTo(0);
    }

    @Test
    public void shouldNotCollectZerosFOrEmptyList() {
        // given
        List<Integer> integers = Arrays.asList();

        // when
        CollectorSumAndAverage collectorSumAndAverage = new CollectorSumAndAverage();
        CollectingResult collect = collectorSumAndAverage.collect(integers);

        // then
        assertThat(collect.getSum()).isEqualTo(0);
        assertThat(collect.getAverage()).isEqualTo(0);
    }

    @Test
    public void shouldCollectSumAndAvarage() {
        // given
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6);

        // when
        CollectorSumAndAverage collectorSumAndAverage = new CollectorSumAndAverage();
        CollectingResult collect = collectorSumAndAverage.collect(integers);

        // then
        assertThat(collect.getSum()).isEqualTo(12);
        assertThat(collect.getAverage()).isEqualTo(4);
    }
}