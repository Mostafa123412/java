package Assignments;

//3-min and max
//How Can Find The Minimum/maximum of three numbers using conditional operator. for example
//3
//1
//5
//Max=5
//Min=1

import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter the three numbers ");
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        int num3=scanner.nextInt();

        if (num1>num2 && num1>num3){
            System.out.println("the maximum number = "+num1);
            if (num2>num3){
                System.out.println("the minimum number = "+num3);
            }else {
                System.out.println("the minimum number = "+num2);
            }
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("the maximum number = "+num2);
            if (num1>num3){
                System.out.println("the minimum number = "+num3);
            }else {
                System.out.println("the minimum number = "+num1);
            }
        }else {
            System.out.println("the maximum number = "+num3);
            if (num1>num2){
                System.out.println("the minimum number = "+num2);
            }else {
                System.out.println("the minimum number = "+num1);
            }
        }

    }

}
