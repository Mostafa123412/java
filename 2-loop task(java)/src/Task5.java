import java.util.Scanner;

//5- You will take number from the user Write a java program to print its factorial.
public class Task5 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter the number ");
        int number=scanner.nextInt();

        int factorial=1;
        for (int i=number;i>1;i--){

            factorial = factorial*i ;

        }

        System.out.println("factorial of "+number+" = "+factorial);


    }

}
