package fi.ithou.javacore.classes.step1;

/*
Java classes example from
http://tutorials.jenkov.com/java/classes.html
 */

public class App1 {
    public static void main(String[] args) {
        System.out.println("Hello. This is " + App1.class);

        Car1 carA = new Car1();
        Car1 carB = new Car1("Ford Ka");

        System.out.println("Our garage:");
        System.out.println(carA.toString());
        System.out.println(carB.toString());
    }
}
