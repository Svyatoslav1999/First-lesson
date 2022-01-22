package Vehicles;

public class Volvo extends Car{
    public Volvo(boolean engineIsActive, String name, int year) {
        super(engineIsActive, name, year);
    }

    @Override
    void runAndDrive() {
        if (isEngineIsActive()){
            System.out.println("Volvo drive");
        }
        else {
            System.out.println("Volvo stop");
        }
    }

}
