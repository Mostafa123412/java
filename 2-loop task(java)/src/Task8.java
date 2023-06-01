
//8- Write an application that calculates the product of the odd integers from 1 to 15.

public class Task8 {

    public static void main(String[] args) {

        int result=1;
        for (int i=1;i<=15;i+=2){

          result=result*i;

        }
        System.out.println(result);


    }

}
