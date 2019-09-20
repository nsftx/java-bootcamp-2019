package ba.spark.bootcamp;

public class MultidimensionalArrays {

    public static void main(String[] args) {
        int multiDimArray[][] = {{2, 7, 9}, {3, 6, 1}, {7, 4, 2}};

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.println(" na poziciji " + i + ", " + j+ " se nalazi element: " + multiDimArray[i][j]);
            }
        }

    }
}
