package ba.spark.bootcamp;

public class ArrayIntro {

    public static void main(String[] args) {

        int intArrayFirst[] = new int[55];
        System.out.println(" Empty array: " + intArrayFirst.length);

        int[] intArray2 = new int[3];

        intArray2[0] = 23;
        intArray2[1] = 22;
        intArray2[2] = 553;
        System.out.println(" Array 2: " + intArray2[0]);

        String[] animals = {"dog", "cat"};

        System.out.println(" On 1st place is: " + animals[0]);
        System.out.println(" On 2st place is: " + animals[1]);

        int intArray[][] = {{1, 2, 3}, {4, 5}};

        int cloneArray[][] = intArray.clone();

        System.out.println(intArray == cloneArray);

        System.out.println(intArray[0] == cloneArray[0]);
        System.out.println(intArray[1] == cloneArray[1]);
    }

}
