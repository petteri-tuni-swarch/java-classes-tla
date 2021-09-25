package fi.ithou.javacore.classes.step3;

public class Car3 {

    private String model = null;

    public Car3() {
    }

    public Car3(String theModel) {
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