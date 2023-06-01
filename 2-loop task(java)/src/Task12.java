
//12- Given a number, print how many times can we divide it by 2?

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter the number");
        int number=scanner.nextInt();

        int count=0;
        while (true){

            if (number % 2 != 0){
                break;
            }
            number=number/2;
            count++;
        }
        System.out.println("you can divide this number by 2 : "+count+" times");

    }

}
