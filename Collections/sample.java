
import java.util.*;

public class sample{
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Appke");
        System.out.println("List"+list);

        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple");
        System.out.println("Set"+set);

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Red");
        map.put(2,"Yelloe");
        map.put(1,"Blue");
        System.out.println("Map:"+map);

        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("First");
        deque.addLast("Last");
        System.out.println("Deque: " + deque);
    
    }
}