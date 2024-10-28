package ObjectsClass;

public class learningClass {

    private int aNumber = 12;
    private int anotherNumber;
    static private CarClass ourCar = new CarClass();
    static private CarClass ourAnotherCar;
    static private CarClass thirdCar;

    public static void main(String[] args) {
        // String nameString = ourCar.manufacturerName;
        // String modelName;
        thirdCar = new CarClass("Marcedes", "S class", "asbcd", 2000, 20);

        ourAnotherCar = new CarClass("Ford", "Mustang", "qwerty", 1500, 30);
        System.out.println("---------------------------");
        System.out.println("------Another Car-------");
        System.out.println("Manufacturer: " + ourAnotherCar.manufacturerName);
        System.out.println("Model Name: " + ourAnotherCar.getModelName());
        System.out.println("Password Matched? : " + ourAnotherCar.matchCarKeyValue("qwerty"));
        System.out.println("1st Car name: " + ourCar.manufacturerName); // output is empty because we didnt input
                                                                        // anything on the variable
        System.out.println("1st car CC: " + ourCar.engineCC);
        System.out.println("2nd car CC: " + ourAnotherCar.engineCC);
        System.out.println("Amount of fuel: " + ourAnotherCar.presentAmountOfFuel() + 'L');
        ourAnotherCar.addFuel(2);
        System.out.println("After adding 2L fuel: " + ourAnotherCar.presentAmountOfFuel() + 'L');
        ourAnotherCar.runForSeconds(600);
        System.out.println("Amount of fuel after running for 60s: " + ourAnotherCar.presentAmountOfFuel() + 'L');
        System.out.println("---------------------------");
        System.out.println("---------Third Car--------");
        System.out.println("Manufacturer: " + thirdCar.manufacturerName);
        System.out.println("Model Name: " + thirdCar.getModelName());
        System.out.println("Password Matched? : " + thirdCar.matchCarKeyValue("qwerty"));
        System.out.println("1st Car name: " + ourCar.manufacturerName); // output is empty because we didnt input
                                                                        // anything on the variable
        System.out.println("1st car CC: " + ourCar.engineCC);
        System.out.println("2nd car CC: " + thirdCar.engineCC);
        System.out.println("Amount of fuel: " + thirdCar.presentAmountOfFuel() + 'L');
        thirdCar.addFuel(2);
        System.out.println("After adding 2L fuel: " + thirdCar.presentAmountOfFuel() + 'L');
        thirdCar.runForSeconds(600);
        System.out.println("Amount of fuel after running for 60s: " + thirdCar.presentAmountOfFuel() + 'L');
        System.out.println("---------------------------");

    }
}