
//4- You take two number from the user , base and power The output: Base ^ power

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter the base and the power ");
        float base=scanner.nextFloat();
        float power=scanner.nextFloat();

        float result=1;
        for (int i=1 ;i<=power;i++){

            result=result*base;

        }

        System.out.println(base+"^"+power+"="+result);


    }

}
