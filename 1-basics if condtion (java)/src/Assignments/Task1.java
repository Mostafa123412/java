package Assignments;

//Write a java program that read a number of the month And then print the name of it

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter the number of the month");
        int monthNum= scanner.nextInt();

        if (monthNum==1) {System.out.println("January");}
        else if (monthNum==2) {System.out.println(" February");}
        else if (monthNum==3) {System.out.println("march");}
        else if (monthNum==4) {System.out.println("April");}
        else if (monthNum==5) {System.out.println("May");}
        else if (monthNum==6) {System.out.println("june");}
        else if (monthNum==7) {System.out.println("July");}
        else if (monthNum==8) {System.out.println("August");}
        else if (monthNum==9) {System.out.println("September");}
        else if (monthNum==10){System.out.println("October");}
        else if (monthNum==11){System.out.println("November");}
        else if(monthNum==12){System.out.println("December");}


        }


    }


