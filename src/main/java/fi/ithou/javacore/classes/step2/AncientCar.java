package fi.ithou.javacore.classes.step2;

public class AncientCar extends AbstractCar {

    private double consumption;

    public AncientCar(String model) {
        super(model);
    }

    @Override
    public double getConsumption(String unit) {
        if (unit.equals("liter")) {
            return this.consumption;
        }
        return 0.0;
    }

    @Override
    public String getUnit() {
        return "liter";
    }

    public void setGasolineConsumption(double consumption) {
        this.consumption = consumption;
    }
}
