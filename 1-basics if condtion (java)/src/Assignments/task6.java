package Assignments;

//Write a program which calculates marks on basis of given grades in java using switch statement
//if Grade A then marks >=80
//if Grade B then marks >=60 and less than 80
//if Grade C then marks >=40 and less than 60
//if Grade F then marks <=40
//if any other grade is passed then print invalid grade

import java.util.Scanner;

public class task6 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println(" please enter your mark ");
        float mark=scanner.nextFloat();

        if ( mark >=80 && mark<=100){
            System.out.println("your mark is grade A");
        } else if ( mark >=60 && mark<80){
            System.out.println("your mark is grade B");
        }else if ( mark >=40 && mark<60){
            System.out.println("your mark is grade C ");
        } else if (mark >= 0 && mark<40) {
            System.out.println(" your mark is grade F ");

        }else {
            System.out.println("invalid grade ");
        }

    }

}
