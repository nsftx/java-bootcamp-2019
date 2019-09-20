package ba.spark.bootcamp;

public class ForLoop {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("The value of i is: " + i);
        }

        int intArray[] = {1, 2, 3};
        for(int element: intArray){
            System.out.println(element);
        }

    }
}
