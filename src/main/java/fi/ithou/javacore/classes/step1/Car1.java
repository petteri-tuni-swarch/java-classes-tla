package fi.ithou.javacore.classes.step1;

public class Car1 {

    private String model = null;

    public Car1() {
    }

    public Car1(String theModel) {
        this.model = theModel;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        String string = "Car object " + this.model;
        return string;
    }
}