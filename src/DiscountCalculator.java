public class DiscountCalculator {
    public static void main(String[] args){
        double price = 1000.00;
        double discount = 0.15;
        double total = price - (price * discount);
        System.out.println("original price " + price);
        System.out.println("discount" + (discount*100)+"%");
        System.out.println("total after discount" + total);
    }
}
