package Assignments;

//2-SortingThreeFloatingNumbers
//Write a program that reads in three Floating-point numbers and sort them. For Example
//2.5
//9
//4
//Use only conditional statement
//Output
//2.5
//4
//9

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter the numbers");
        float num1=scanner.nextFloat();
        float num2=scanner.nextFloat();
        float num3=scanner.nextFloat();

        if (num1<num2 && num1<num3){
            System.out.println(num1);
            if (num2<num3){
                System.out.println(num2);
                System.out.println(num3);
            }else {
                System.out.println(num3);
                System.out.println(num2);
            }
        } else if (num2<num1 && num2<num3){
            System.out.println(num2);
            if (num1<num3){
                System.out.println(num1);
                System.out.println(num3);
            }else {
                System.out.println(num3);
                System.out.println(num1);
            }

        }else {
            System.out.println(num3);
            if (num1<num2){
                System.out.println(num1);
                System.out.println(num2);
            }else {
                System.out.println(num2);
                System.out.println(num1);
            }
        }

    }

}
