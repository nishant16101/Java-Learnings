import java.util.*;
import java.util.stream.*;

class stream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9);

        
        List<Integer> squaredEvens = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println("Squared even numbers: " + squaredEvens);

        
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println("Sum of all numbers: " + sum);

        
        boolean hasEven = numbers.stream().anyMatch(n -> n % 2 == 0);
        System.out.println("Has even number? " + hasEven);

        
        List<Integer> sortedDesc = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("Sorted descending: " + sortedDesc);
    }
}
