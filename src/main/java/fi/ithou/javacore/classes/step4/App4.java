package fi.ithou.javacore.classes.step4;

/*
Java classes example from
http://tutorials.jenkov.com/java/classes.html
 */

public class App4 {
    public static void main(String[] args) {
        System.out.println("Hello. This is " + App4.class);

        System.out.println("Java Abstract Class example");

        LeasingCarPlus carA = new LeasingCarPlus("Ford Ka", "3 year leasing");

        LeasingCar carB = new LeasingCar ("Volvo S40");
        carB.setGasolineConsumption(7.8);

        System.out.println("Our garage:");
        System.out.println(carA.toString());
        System.out.println(carB.toString());
    }


}
