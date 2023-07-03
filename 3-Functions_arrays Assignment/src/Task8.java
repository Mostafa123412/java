//*8-Write function binary search that takes array and sorts it hint -> search about
//binary search

public class Task8 {

    public static void main(String[] args) {

        int[] array={8,12,6,4,3,1,0,55,45,48};

        System.out.println( binarySearch(array,45));
        displayArray(array);





    }

    static int binarySearch(int array[],int value){

        bubbleSort(array);
        int start=0;
        int end=array.length-1;
        int mid=(start+end)/2;
        for (int i=start; i<end; i++){
            if (value==array[mid]){
                System.out.println("the value "+value+" is in the index : ");
                return mid;
            }
            else if (value<array[mid]){
                end=mid-1;
                mid=(start+end)/2;
            }
            else {
                start=mid+1;
                mid=(start+end)/2;
            }
        }

    return -1;
    }

    static void bubbleSort(int array[]){

        for (int i=1; i<array.length; i++){

            for (int j=0; j<i; j++){

                if (array[j]>array[i]){
                    int temp=array[j];
                    array[j]=array[i];
                    array[i]=temp;
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

