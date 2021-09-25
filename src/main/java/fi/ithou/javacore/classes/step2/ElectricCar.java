package fi.ithou.javacore.classes.step2;

public class ElectricCar extends AbstractCar {

    private double consumption;

    public ElectricCar(String model) {
        super(model);
    }

    @Override
    public double getConsumption(String unit) {
        if (unit.equals("kwh")) {
            return this.consumption;
        }
        return 0.0;
    }

    @Override
    public String getUnit() {
        return "kwh";
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

}
