//* 9 - search about selection sort and implement it in function SelectionSort that
//takes array as a parameter and sort it using the algorithm

public class Task9 {

    public static void main(String[] args) {

        int[] array={8,12,6,4,3,1,0,55,45,48};
        selectionSort(array);
        displayArray(array);

    }

    static void selectionSort(int array[]){
        for (int j=0;j<array.length;j++) {
            int min = array[j];
            int minIndex=j;
            for (int i = j+1; i < array.length; i++) {
                if (array[i] < min) {
                    minIndex=i;
                    min = array[minIndex];
                    array[i]=array[j];
                    array[j] = min;

                }

            }

        }
    }

    static void displayArray(int array[]){
        System.out.println("the array : ");
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+"   ");
        }
    }

}
