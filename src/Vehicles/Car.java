package Vehicles;

import java.time.LocalDate;

public abstract class Car {
   private boolean engineIsActive;
   private String name;
   private int year;
   private boolean names;

    public Car(boolean engineIsActive, String name, int year) {
        this.engineIsActive = engineIsActive;
        this.name = name;
        this.year = year;
    }

    public boolean isEngineIsActive() {
        return engineIsActive;
    }

    public void setEngineIsActive(boolean engineIsActive) {
        this.engineIsActive = engineIsActive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        if (year < 1960 || year > LocalDate.now().getYear()){
            return LocalDate.now().getYear();
        }
        else{
            return year;
        }
    }

    public void setYear(int year) {
        if (year < 1900 || year > LocalDate.now().getYear()){
            System.out.println("year is invalid");
        }
        else{
            this.year = year;
        }
    }

    void runAndDrive() {
        if (engineIsActive) {
            System.out.println("im driving with active engine");
        }
        else {
            System.out.println("i cant driving");
        }
    }
    public static String lengthNames(Car car){
        if (car.getName().length() > 3){
            return "car name length bigger than 3";
        }
        return "car name length less than 3";
    }
}