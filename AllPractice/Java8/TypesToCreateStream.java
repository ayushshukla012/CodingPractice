package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TypesToCreateStream {
    public static void main(String[] args) {
        List<String> localList = Arrays.asList("apple","bananan","mango");
        Stream<String> localStream = localList.stream();

        Integer[] localArray = {1,2,3,4,5};
        Stream<Integer> localArrayStream = Arrays.stream(localArray);

        Stream<Integer> localStreamOf = Stream.of(1,2,3,4,5);

        Stream<Integer> localStreamIterate = Stream.iterate(0, n-> n+1).limit(100);

        Stream<Integer> localStreamGenerate = Stream.generate(() -> (int)Math.random()*100).limit(100);
    }
}
