//7- Modify the above function to be CountGeneral that takes array as
//parameter and count occurrences of every number in the array and print it

public class Task7 {

    public static void main(String[] args) {

        int[] array={3,2,8,4,2,2,3,5,2};
        count(array);

    }

    static void count(int array[]) {


        for (int i=0;i<array.length;i++){
            int count=0;

            for (int j=0;j<array.length;j++) {

                if (array[j] == array[i]) {
                    count++;
                }

            }
            System.out.println("number of occurrences of number " +array[i]+ " = "+count );


        }
    }

}
