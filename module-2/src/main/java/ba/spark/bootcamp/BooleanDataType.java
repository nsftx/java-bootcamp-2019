package ba.spark.bootcamp;

public class BooleanDataType {

    public static void main(String[] args) {
        boolean isTrue = true;
        if (isTrue) {
            System.out.println(" It's true ");
        } else {
            System.out.println(" It's false ");
        }

        boolean newVariable = true;
        if (newVariable == true) {
            System.out.println(" User is true ");
        } else {
            System.out.println(" User is false ");
        }

        boolean variable = false;
        if (variable = true) {
            System.out.println(" Variable is true ");
        } else {
            System.out.println(" Variable is false ");
        }

        boolean newOne = true;
        if (!newOne) {
            System.out.println(" And final negation of new one is true. ");
        } else {
            System.out.println(" And final negation of new one is false. ");
        }
    }
}

