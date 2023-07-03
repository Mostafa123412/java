
//2- Write a function getNumOfElements that takes array as parameter and
//returns the number of its elements
public class Task2 {

    public static void main(String[] args) {

        int arrry[]={0,1,2,3,4,5};
        System.out.println("number of array items = "+getNumOfElements(arrry));

    }


    public static int getNumOfElements(int array[]){

        return array.length;
    }

}
