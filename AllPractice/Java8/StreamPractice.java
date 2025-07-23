package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {
public static void main(String[] args) {
    List<Integer> listExample = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13);

    //filter
    List<Integer> filteredList = listExample.stream().filter(x->x%2==0).collect(Collectors.toList());
    System.out.println(filteredList);

    //map
    List<Integer> filteredMap = filteredList.stream().map(x->x/2).collect(Collectors.toList());
    System.out.println(filteredMap);
    
    //distinct
    List<Integer> distinctList = filteredMap.stream().distinct().collect(Collectors.toList());
    System.out.println(distinctList);

    //sorted
    //ascending order
    List<Integer> sortedList = distinctList.stream().sorted().collect(Collectors.toList());
    System.out.println(sortedList);

    //descending order
    List<Integer> sortedListDesc = distinctList.stream().sorted((a, b) -> b - a).collect(Collectors.toList());
    System.out.println(sortedListDesc);

}
}
