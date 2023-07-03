
//6- Write a function count2 that takes array as parameter and counts
//occurrences of number 2
public class Task6 {

    public static void main(String[] args) {

        int[] array={1,2,8,4,2,2,3,5,2};
        System.out.println("number of occurrences of number 2 = "+count2(array));
    }


    static int count2(int array[]) {
        int count=0;
    for (int i=0;i<array.length;i++){

        if (array[i]==2){
            count++;
        }
    }

    return count;
    }
}
