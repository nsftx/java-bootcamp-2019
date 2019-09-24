package ba.spark.bootcamp.homework;

public class Task4 {
    public static void main(String[] args) {
        int[] niz = new int[50];
        int stotice =0;
        int desetice =0;
        int jedinice =0;
        int suma =0;
        int j=0;

        for(int i=1; i<100; i++){
            stotice = i/100;
            desetice = (i%100)/10;
            jedinice = i%10;
            suma = stotice + desetice + jedinice;
            if(suma %2 ==0){
                niz[j] =i;
                j++;
            }
        }

        for(int element: niz){
            System.out.print(element + " ");
        }
    }
}
