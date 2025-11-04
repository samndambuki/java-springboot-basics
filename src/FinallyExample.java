public class FinallyExample {
    public static void main(String[] args){
        try{
            int x = 5/1;
        }
        finally {
            System.out.println("this will always run");
        }
    }
}
