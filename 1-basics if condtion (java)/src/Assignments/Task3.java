package Assignments;

//The alphabets A, E, I, O and U (smallcase and uppercase) are known as Vowels and rest of the
//alphabets are known as consonants. Here we will write a java program that checks whether the
//input character is vowel or Consonant.

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter the character");
        char input=scanner.next().charAt(0);
        if(input=='A' ||input=='E' || input=='I' || input=='O' || input== 'U'||input=='a' ||input=='e' || input=='i' || input=='o' || input== 'u'){
            System.out.println("the character is Vowel");
        }else{
            System.out.println("the character is consonants");

        }

    }
}
