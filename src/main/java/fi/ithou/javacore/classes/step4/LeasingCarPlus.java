package fi.ithou.javacore.classes.step4;

// implementing multiple interfaces allowed
public class LeasingCarPlus implements LeasingInterface, CarInterface {

    private final String model;
    private final String contract;

    public LeasingCarPlus (String model, String leasing) {
        this.model = model;
        this.contract = leasing;
    }

    @Override
    public String getContract() {

        return contract;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        String string = "Car object " + this.model + " - Contract: " + this.contract;
        return string;
    }



}
