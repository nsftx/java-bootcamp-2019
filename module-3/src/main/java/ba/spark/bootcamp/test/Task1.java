package ba.spark.bootcamp.test;

public class Task1 {
    public static void main(String[] args) {

        int[] niz = new int[11];
        int j=0;
        for(int i=0; i<=500; i=i+50){
            niz[j]=i;
            j++;
        }

        for(int element: niz){
            System.out.print(element + " ");
        }
    }
}
