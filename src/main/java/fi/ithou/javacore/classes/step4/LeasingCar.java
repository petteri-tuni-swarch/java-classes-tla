package fi.ithou.javacore.classes.step4;

/* NOT ALLOWED:
public class LeasingCar extends CarType, LeasingType {
 */
public class LeasingCar extends CarType {

    private double consumption;

    public LeasingCar(String model) {
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

    /* NOT ALLOWED
    @Override
    public void getContract() {
    */
}

