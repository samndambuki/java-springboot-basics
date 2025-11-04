public class Multicatch {
    public static void main(String[] args){
        try{
         int[] nums = {1,2,3};
         System.out.println(nums[3]);
        }catch(ArithmeticException e){
            System.out.println("math error!!");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("index error");
        }
    }
}
