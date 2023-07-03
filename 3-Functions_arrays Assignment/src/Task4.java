
//4- Write a function getMin that takes array as parameter and returns the min
//value in the array

public class Task4 {

    public static void main(String[] args) {

        int[] array={4,5,6,10,2,5,7};
        System.out.println("the max of the array = "+getMin(array));

    }

    static int getMin(int array[]){

        int min=array[0];

        for (int i=0;i<array.length;i++){

            if (array[i]<min){
                min=array[i];
            }
        }
        return min;
    }


}
