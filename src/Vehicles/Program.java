package Vehicles;

public class Program {
    public static void main(String[] args) {
        Car volvo = new Volvo(true, "volvo", 7);
        Car kia = new Volvo(true, "kia", 7);
        Car mazda = new Volvo(true, "mazda", 7);
        Car mercedes = new Volvo(true, "mercedes", 7);
        Car bmw = new Volvo(true, "bmw", 7);
        String s = volvo.lengthNames(volvo);
        Car samochody[] = new Car[5];
        samochody[0] = new Volvo(true, "kia", 7);
        samochody[1] = new Volvo(true, "volvo", 7);
        samochody[2] = new Volvo(true, "mazda", 7);
        samochody[3] = new Volvo(true, "mercedes", 7);
        samochody[4] = new Volvo(true, "bmw", 7);
        for (int i = 0;i< samochody.length ;i++){
            String x = Car.lengthNames(samochody[i]);
            System.out.println(x);
        }
    }
}
