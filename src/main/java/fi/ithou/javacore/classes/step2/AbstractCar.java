package fi.ithou.javacore.classes.step2;

public abstract class AbstractCar {

    private String model = null;

    public AbstractCar() {}
    public AbstractCar(String theModel) {
        this.model = theModel;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    abstract public double getConsumption (String unit);
    abstract public String getUnit ();

    @Override
    public String toString() {
        String string = "Car object " + this.model + " # " +
                this.getConsumption(this.getUnit());
        return string;
    }
}
