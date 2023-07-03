
//3- Write a function getMax that takes array as parameter and returns the max
//value in the array

public class Task3 {

    public static void main(String[] args) {

        int[] array={4,5,6,10,2,5,7};
        System.out.println("the max of the array = "+getMax(array));

    }

    static int getMax(int array[]){

        int max=array[0];

        for (int i=0;i<array.length;i++){

            if (array[i]>max){
                max=array[i];
            }
        }
        return max;
    }

}
