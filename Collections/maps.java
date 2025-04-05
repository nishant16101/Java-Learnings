
import java.util.*;

public class maps{
    public static void main(String[] args) {
        Map<Integer,String> students = new HashMap<>();
        students.put(101,"Nishat");
        students.put(103,"Rahul");
        students.put(104,"John");
        System.out.println("Student 103"+students.get(103));

        for (Map.Entry<Integer,String>entry:students.entrySet()){
            System.out.println("ID"+entry.getKey()+"Name"+entry.getValue());
        }
    }
}