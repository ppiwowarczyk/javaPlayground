package collectDemo;

import javaAnotation.Java12_Collectors;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.teeing;

@Java12_Collectors
public class CollectorSumAndAverage implements Collector
{
    @Override
    public CollectingResult collect(List<Integer> ints)
    {
        return Optional.ofNullable(ints).orElse(Collections.emptyList())
                .stream()
                .filter(s -> s % 2 == 0)
                .collect(
                        teeing(
                                Collectors.summingInt(number -> number),
                                Collectors.averagingDouble(number -> number),
                                CollectingResult::new
                        )
                );
    }
}
