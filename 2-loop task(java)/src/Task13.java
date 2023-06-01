
//*13-Write a program that displays all the numbers from 100 to
//200, ten per line, that are divisible by 5 or 6, but not both.
//Numbers are separated by exactly one space

public class Task13 {

    public static void main(String[] args) {

        int count=1;
        for (int i=100;i<=200;i++){

                if (i % 5 == 0 || i % 6 == 0) {

                    if (i % 5 == 0 && i % 6 == 0) {
                        continue;
                    }
                    System.out.print(i + " ");
                    if (count % 10==0){
                        System.out.println();
                    }
                    count++;

                }


        }

    }

}
