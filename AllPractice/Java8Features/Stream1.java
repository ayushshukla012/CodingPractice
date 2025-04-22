
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream1 {
    public static void main(String[] args) {
        List<Integer> list1= Arrays.asList(2312,6,3,2,4,2,55,441,123,643,77,2,466,65);
        List<Integer> streamList = list1.stream()
                                .filter(x->x%2==0) //filtering even numbers
                                .map(x->x/2) //dividing by 2
                                .distinct() //removing duplicates
                                .sorted((a,b)->b-a) //sorting in descending order
                                .limit(4) //limiting to 4 elements
                                .skip(1) //skipping the first element
                                .collect(Collectors.toList()); //collecting the elements to a list

        System.out.println(streamList);            
        
        List<Integer> oddList = list1.stream()
                                .filter(x->x%2!=0) //filtering odd numbers
                                .sorted((a,b)->b-a) //sorting in descending order
                                .peek(action->System.out.println("Peeked element: "+action)) //peeking the elements
                                .distinct() //removing duplicates
                                .limit(4) //limiting to 4 elements
                                .skip(1) //skipping the first element
                                .collect(Collectors.toList()); //collecting the elements to a list

        System.out.println(oddList);

        //Use stream to print duplicate elements in an array
        Integer[] arr = {1,2,32,3,32,1,3,32,43,2};
        List<Integer> duplicateList = Arrays.asList(arr).stream()
                                        .collect(Collectors.groupingBy(x->x)) //grouping by element occurrence[{1=[1,1], 2=[2,2], 3=[3,3], 32=[32,32,32], 43=[43]}]
                                        .entrySet().stream() //converting map to stream
                                        .peek(action->System.out.println("Peeked element: "+action))
                                        .filter(x->x.getValue().size()>1) //filtering elements with size greater than 1
                                        .map(x->x.getKey()) //getting the key of duplicate elements
                                        .collect(Collectors.toList());
                                    
        System.out.println(duplicateList);
    }
}
