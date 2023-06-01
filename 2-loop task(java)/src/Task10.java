
//*10- Write java program to read integer from user then print sum of digit means add
//all the digits of any number for example if user enter 123 .output is 6 because 1 +2
//+3 = 6 an so on

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter the number");
        int number=scanner.nextInt();
        int digit1=number%10;
        int sum=digit1;
        while (true) {
            if ((number / 10 )%10==0){
                break;
            }
            sum=sum+((number / 10 )%10);
            number=number/10;

        }
        System.out.println("sum="+sum);
    }

}
