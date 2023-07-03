
//5- Wirte a function CalculateEven that takes array as parameter and calculate
//the sum of even numbers and how many even numbers
public class Task5 {

    public static void main(String[] args) {

        int[] array={1,2,8,4,6,0,3,5,2};
        calculateEven(array);

    }


    static void calculateEven(int array[]){

        int sum=0;
        int count=0;
        for (int i=0 ;i<array.length;i++){
            if (array[i]%2==0){
                sum=sum+array[i];
                count++;
            }
        }
        System.out.println(" the sum of the even numbers = "+sum + "\n and the number of even numbers = "+count);

    }

}
