import java.util.*;

public class ListExample {
    public static void main(String[] args){
        List<String> fruits = new ArrayList();
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("orange");

        for(String f : fruits){
            System.out.println(f);
        }
    }
}
