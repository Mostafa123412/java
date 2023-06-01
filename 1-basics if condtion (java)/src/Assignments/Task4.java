package Assignments;

//In this Program we are making a simple calculator that performs addition, subtraction, multiplication
//and division based on the user input. The program takes the value of both the numbers (entered by
//user) and then user is asked to enter the operation (+, -, * and /), based on the input program
//performs the selected operation on the entered numbers

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("please enter the first numbers");
        int num1=scanner.nextInt();
        System.out.println("please enter the second numbers");
        int num2=scanner.nextInt();

        System.out.println("please enter the operator ( + or - or * or / )");
        char operator =scanner.next().charAt(0);

        int result=0;
        if(operator=='+'){
             result = num1+num2;
        } else if (operator == '-') {
            if (num1>num2){
                result=num1-num2;
            }else {
                result=num2-num1;
            }
        } else if (operator == '*') {
             result= num1*num2;
        } else if (operator == '/') {
            if (num1>num2){
             result=num1/num2;
            }else {
                result=num2/num1;
            }
        }
        System.out.println("result = "+result);


    }
}
