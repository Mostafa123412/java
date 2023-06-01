package Assignments;

//Write a Java program to print the area of a circle.

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter the radius of the circle ");
        float radius=scanner.nextFloat();

        float area= (float) (3.14*(radius*radius));
        System.out.println("Area = "+area);

    }

}
