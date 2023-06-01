package Assignments;


import java.util.Scanner;

//input
//The first(and only)input line contains an integer number—the weight of the watermelon bought by the boys.
//Output
//PrintYES,if the boys can divide the water melon into two parts,each of them weighing even number of kilos;and
//NO in the opposite case.
//Sampletest(s)
//input
//8
//output
//YES
//Note
//For Example,the boys can divide the watermelon into two parts of 2and 6 kilo s respectively (another variant—two
//parts of 4 and 4 kilos).

public class Task7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int weight = scanner.nextInt();

        if (weight % 2 == 0 && weight > 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

}
