
//9- Write a java program that read positive numbers from user Until read a negative
//number ... then calculate and print The average of these numbers.

import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter the numbers");


        int result=0;
        int count=0;
        int sum=0;
        while (true){


            int number=scanner.nextInt();
            if (number>0) {
                sum = sum + number;
                count++;
            }else {
                break;
            }

        }

        result=sum/count;
        System.out.println("the average of numbers = "+result);

    }

}
