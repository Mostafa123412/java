
//1- Write a function getSummition that takes array as parameter and returns
//summation of its elements

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {


        System.out.println("please enter the items of the array : ");
        Scanner scanner=new Scanner(System.in);

        int[] array = new int[5];
        for (int i = 0; i<array.length; i++){
            array[i]=scanner.nextInt();
        }
        System.out.println("the summition = "+getSummition(array));


    }

    public static int getSummition(int [] array){

        int sum=0;
        for (int i=0; i<array.length; i++){

            sum=sum+array[i];

        }
     return sum;
    }



}
