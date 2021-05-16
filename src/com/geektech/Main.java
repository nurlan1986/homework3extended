package com.geektech;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double[] array = {1.1,1.2,2.4,-5.5,10.3,-15.6,10.1,10.9,-15.3,-30.4,5.3,6.9,12.3,18.4,18.2,};

        System.out.println("Первое отрицательное число ="+ SearchNegativNum(array));


        double sum = 0;
        double counter =0;
        for (int i = 3;i<array.length;i++){
            if(array[i]>0){
                sum +=array[i];
                System.out.println("Среднее значение положительных чисел после первого отрицательного ="+sum/7);
                counter++;
                System.out.println(counter);
            }
        }


        int[] array1 = {6,5,4,3,2,1};
        for (int j = 0; j<array1.length;j++){
            System.out.println(array1[j]);
        }
        System.out.println("Отсортирован!");

        bubbleSort(array1);

        System.out.println(Arrays.toString(array1));
    }


    public static double
    SearchNegativNum(double[]array){


        double n = array.length;
        for (int i=0; i<n;i++){
            if(array[i]<0)
                return array[i];


        }
        return-1;
    }public static void bubbleSort(int array[]){
        int size=array.length;
        for(int i=0;i<size-1;i++){
            for (int j=0;j<size-i-1;j++){
                if (array[j]>array[j+1]){
                    int temp=array[j];
                    array[j+1]=temp;
                }
            }
        }
    }
}
