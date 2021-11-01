package collectDemo;

import java.util.List;

public interface Collector
{
    CollectingResult collect(List<Integer> ints);
}
