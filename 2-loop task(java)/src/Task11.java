
//*11- Write java program to read an integer from user then print how many digit in
//this number

import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter the number");
        int number=scanner.nextInt();

        int count=1;
        while (true){

            if ((number/10)%10==0){
                break;
            }
            number=number/10;
            count++;

        }

        System.out.println("the number of digits = "+count);


    }

}
