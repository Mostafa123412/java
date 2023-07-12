
//1) The Java class called Holiday is started below. An object of class Holiday
//represents a
//holiday during the year. This class has three instance variables:
//● name, which is a String representing the name of the holiday
//● day, which is an int representing the day of the month of the holiday
//● month, which is a String representing the month the holiday is in
//public class Holiday {
//private String name;
//private int day;
//private String month;
//// your code goes here
//}
//a) Write a constructor for the class Holiday, which takes a String representing the
//name, an int representing the day, and a String representing the month as its
//arguments, and sets the
//class variables to these values.
//b) Write a method inSameMonth, which compares two instances of the class
//Holiday, and
//returns the Boolean value true if they have the same month, and false if they do
//not.
//c) Write a method avgDate which takes an array of base type Holiday as its
//argument, and
//returns a double that is the average of the day variables in the Holiday instances in
//the
//array. You may assume that the array is full (i.e. does not have any null entries).
//d) Write a piece of code that creates a Holiday instance with the name “Independence
//Day”,
//with the day “4”, and with the month “July”.

public class Task2 {
    public static void main(String[] args) {

        Holiday holiday1=new Holiday("Independence Day",4,"july");
        Holiday holiday2=new Holiday("rest holiday",3,"May");
        Holiday[] holiday={holiday1,holiday2};

        System.out.println("the avgDate = "+holiday1.avgData(holiday));
        System.out.println("is the same month ? "+Holiday.isSameMonth(holiday1,holiday2));




    }
}
