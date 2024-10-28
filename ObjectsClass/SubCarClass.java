package ObjectsClass;

public class SubCarClass extends CarClass {
    private float chargeInBattery;
    private String colorString;

    public SubCarClass() {
        super();
    }

    public SubCarClass(String manu, String model, String key, int engineCC, float fuel, float charge, String color) {
        super(manu, model, key, engineCC, fuel);
        chargeInBattery = charge;
        colorString = color;
    }

    public float getChargeInBattery() {
        return chargeInBattery;
    }

    public void setChargeInBattery(float chargeInBattery) {
        this.chargeInBattery = chargeInBattery;
    }

    public String getColorString() {
        return colorString;
    }

    public void setColorString(String colorString) {
        this.colorString = colorString;
    }
}
