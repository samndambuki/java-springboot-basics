import java.util.*;

public class SetExample {
    public static void main(String[] args){
        Set<String> names = new HashSet<>();
        names.add("alice");
        names.add("bob");
        names.add("alice");

        //duplicate ignored
        System.out.println(names);
    }
}
