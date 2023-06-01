package Assignments;

//3.write a program to calculate the sum of positive integers and sum of negative integers for 6 integers.

import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter the 6 numbers ");
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        int num3=scanner.nextInt();
        int num4=scanner.nextInt();
        int num5=scanner.nextInt();
        int num6=scanner.nextInt();

        int sumOfPositive =0;
        int sumOfNegative =0;

        if (num1>0){
            sumOfPositive=sumOfPositive+num1;
        }else {
            sumOfNegative=sumOfNegative+num1;
        }

        if (num2>0){
            sumOfPositive=sumOfPositive+num2;
        }else {
            sumOfNegative=sumOfNegative+num2;
        }

        if (num3>0){
            sumOfPositive=sumOfPositive+num3;
        }else {
            sumOfNegative=sumOfNegative+num3;
        }

        if (num4>0){
            sumOfPositive=sumOfPositive+num4;
        }else {
            sumOfNegative=sumOfNegative+num4;
        }

        if (num5>0){
            sumOfPositive=sumOfPositive+num5;
        }else {
            sumOfNegative=sumOfNegative+num5;
        }

        if (num6>0){
            sumOfPositive=sumOfPositive+num6;
        }else {
            sumOfNegative=sumOfNegative+num6;
        }


        System.out.println("sum of positive numbers = "+sumOfPositive);
        System.out.println("sum of negative numbers = "+sumOfNegative);


    }

}
