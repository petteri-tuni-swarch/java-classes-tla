package fi.ithou.javacore.classes.step3;

/*
Java classes example from
http://tutorials.jenkov.com/java/classes.html
 */

import fi.ithou.javacore.classes.step1.Car1;
import fi.ithou.javacore.classes.step2.AbstractCar;
import fi.ithou.javacore.classes.step2.AncientCar;
import fi.ithou.javacore.classes.step2.ElectricCar;

public class App3 {
    public static void main(String[] args) {
        System.out.println("Hello. This is " + App3.class.toString());

        System.out.println("Java Interface (class type) example");

        Car3 carA = new Car3();
        Car3 carB = new Car3("Ford Ka");

        System.out.println("Our garage:");
        System.out.println(carA.toString());
        System.out.println(carB.toString());


    }
}
