public class Foorloop {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i+=5) { // i++ == i = 1+1
            System.out.println("Hello " + i);
        }

//
//        System.out.println("While loop");
//        int i = 0;
//
//        while (i<=10){
//            System.out.println("Hello" + i);
//            i+=5;
//        }

        int a = 2;
        Integer a1 = 3;
        String b = "3";
       Integer max = Integer.max(2, 5);

        System.out.println(max);

        // Виведіть парні числа 2 4 6 8 10

        int[] arr = {1,2 ,3 , 4 ,5 ,6 ,7 ,8 ,9 , 10};

        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 1){
                System.out.println(arr[i]);
            }
        }
    }
}
