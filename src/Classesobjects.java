public class Classesobjects {
    public static void main(String[] args){
        //object
        Car myCar = new Car();
        myCar.color = "red";
        myCar.year = 2021;
        myCar.drive();


        System.out.println("color" + myCar.color);
        System.out.println("year" + myCar.year);
    }
}
