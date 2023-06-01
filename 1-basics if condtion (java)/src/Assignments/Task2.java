package Assignments;

//Write a java program that read a number of the month and print the month is in Summer, spring,
//winter or autumn.

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter the number of the month");
        int monthNum= scanner.nextInt();

        if(monthNum==1 || monthNum==2 || monthNum==3  ){

            System.out.println("month " +monthNum + " is spring");

        } else if (monthNum ==4 || monthNum == 5 || monthNum == 6) {

            System.out.println("month " +monthNum + " is Autumn");

        } else if (monthNum == 7 || monthNum == 8 || monthNum == 9) {

            System.out.println("month " +monthNum + " is Summer");

        } else if (monthNum == 10 || monthNum == 11 || monthNum == 12) {

        System.out.println("month " +monthNum + " is Winter");

    }

    }

}
