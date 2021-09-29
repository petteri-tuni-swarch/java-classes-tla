package fi.ithou.javacore.classes.step2;

/*
=== Java Class ===
http://tutorials.jenkov.com/java/abstract-classes.html
 */

public class App2 {
    public static void main(String[] args) {
        System.out.println("Hello. This is " + App2.class.toString());
        System.out.println("Java Abstract Class example");

        AncientCar carA = new AncientCar("Ford Granada");
        carA.setGasolineConsumption(9.7);

        ElectricCar carB = new ElectricCar("BMW i3");
        carB.setElectricConsumption(13.5);

        AbstractCar carC = new ElectricCar("T-Ford");

        System.out.println("Our garage:");
        System.out.println(carA.toString());
        System.out.println(carB.toString());
        System.out.println(carC.toString());
    }
}
