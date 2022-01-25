package Animals;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[10];
        dogs[0] = new Dog("Lucky", 5);
        dogs[1] = new Dog("Bazilio", 15);
        dogs[2] = new Dog("Johny", 3);
        dogs[3] = new Dog("Barsik", 4);
        dogs[4] = new Dog("Roc", 10);
        dogs[5] = new Dog("Bosyi", 11);
        dogs[6] = new Dog("Dunai", 12);
        dogs[7] = new Dog("Nika", 8);
        dogs[8] = new Dog("Borsuk", 14);
        dogs[9] = new Dog("Maliuk", 3);

        Dog[] oldDogs = new Dog[10];

//        for (int i = 0; i < dogs.length; i++) {
//            if (dogs[i].getYear() > 9) {
//                oldDogs[i] = dogs[i];
//            }
//        }
//        for (Dog dog : oldDogs) {
//            if (dog!= null){
//                System.out.println(dog);
//            }
//        }
        List<Dog> allDogs = new ArrayList<>();
        for (int i = 0; i < dogs.length; i++) {
            if (dogs[i].getYear() > 9) {
                allDogs.add(dogs[i]);
            }
        }
        allDogs.forEach(System.out::println);

        System.out.println("-------------------------------------------");
        for (Dog dog: allDogs) {
            if (dog.getName().startsWith("B")){
                System.out.println(dog);
            }
        }
        List<Dog> collect = allDogs.stream().filter(s -> s.getName().length() <= 5).collect(Collectors.toList());
        collect.forEach(System.out::println);

//        allDogs.stream().filter(s -> s.getName().startsWith("B")).forEach(System.out::println);
    }

}
