package ObjectsClass;

public class CarClass {
    public String manufacturerName;
    private String modelName;
    private String carKeyValue;
    public int engineCC;
    private float fuelAmount;
    final private double amountOfFuelConsumedPerSecond = 0.02;

    public CarClass() {
        manufacturerName = new String();
        modelName = new String();
        engineCC = 1200;
        fuelAmount = 0;
    }

    public CarClass(String carName) {
        manufacturerName = new String(carName);
        modelName = new String();
        engineCC = 0;
        fuelAmount = 0;
    }

    public CarClass(String manu, String model, String key, int engineCC, float fuel) {
        manufacturerName = manu;
        carKeyValue = key;
        modelName = model;
        this.engineCC = engineCC; // using this to refer the engineCC only in this class
        fuelAmount = fuel;

    }

    // methods
    public float presentAmountOfFuel() {
        return fuelAmount;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public String getModelName() {
        return modelName;
    }

    public boolean matchCarKeyValue(String userInput) {
        return userInput.equals(carKeyValue);
    }

    public void addFuel(float fuelAmount) {
        this.fuelAmount += fuelAmount;
    }

    public void runForSeconds(int timeInSecond) {
        double usedFuel = timeInSecond * amountOfFuelConsumedPerSecond;
        fuelAmount -= usedFuel;
    }
}
