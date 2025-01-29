import java.util.List;

import static java.lang.Math.abs;

class Task1 {

    public long findTotalDistance(List<Long> list1, List<Long> list2) {

        record Pair(long a, long b) {};
        var sorted2 = list2.stream().sorted().iterator();


        return list1.stream().sorted()
            .map(l1 -> new Pair(l1, sorted2.next()))
            .mapToLong(pair -> abs(pair.a() - pair.b()))
            .sum();

    }

}
