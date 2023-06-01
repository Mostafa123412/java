package Assignments;

//1. Write a Java program to get a number from the user and print whether it is positive or negative.

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter the number");
        int number=scanner.nextInt();

        if (number>0){
            System.out.println("the number is positive");
        }else {
            System.out.println("number is negative ");
        }

    }

}
