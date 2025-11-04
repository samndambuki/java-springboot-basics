import java.util.*;

public class MapExample {
    public static void main(String[] args) {
//        Map<Integer,String> students = new HashMap<>();
//        students.put(1,"alice");
//        students.put(2,"bob");
//        students.put(3,"charlie");
//
//        //access by key
//        System.out.println(students.get(2));

        List<String> names = Arrays.asList("alice", "john", "bob");
        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
