
package countsingledigits;

// imports
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class CountSingleDigits {

 
    public static void main(String[] args) {
        // create instance of random class
        Random random = new Random();
        
        // generate a stream of random numbers w/ 100 elements starting at 0 and ending at 9
        int[] randomNums = random.ints(100, 0, 10).toArray();
        
        // use Instream.of method to create an int stream of the random num array
        // convert IntStream with boxed method to get Stream<Integer>
        // use collect method to collect stream elements and put in Map, keys are #s and their occurrences
        // then use counting method to count occurrences
        Map<Integer, Long> occurrences = IntStream.of(randomNums).boxed().collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        
        // display the results using foreach method
        System.out.println("Count of each number: ");
        occurrences.forEach((number, count) -> System.out.println(number + " found " + count + "x"));
    }
    
}
