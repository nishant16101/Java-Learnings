import java.lang.*;
import java.util.*;


public class iterators{
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Nishant","Ajay","Rahul","David"));
        System.out.println("Using Iterator on list");
        Iterator<String> listIterator = names.iterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        System.out.println("Using iterator for backward and forward Traversal");
        ListIterator<String> bidirectional = names.listIterator();
        System.out.println("Forward Traversal");
        while(bidirectional.hasNext()){
            System.out.println(bidirectional.next());

        }
        while(bidirectional.hasPrevious()){
            System.out.println(bidirectional.previous());

        }
        
        Set<Integer> numbers = new HashSet<>(Arrays.asList(10, 20, 30, 40, 50));
        System.out.println("\n🔹 Using Iterator on Set:");
        Iterator<Integer> setIterator = numbers.iterator();
        while (setIterator.hasNext()) {
            System.out.println(setIterator.next());
        }
        Map<Integer,String> map= new HashMap<>();
        map.put(1,"Apple");
        map.put(2,"Banana");
        map.put(3,"Cheery");
        System.out.println("\n🔹 Using Iterator on Map:");
        Iterator<Map.Entry<Integer, String>> mapIterator = map.entrySet().iterator();
        while (mapIterator.hasNext()) {
            Map.Entry<Integer, String> entry = mapIterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        
    }

}