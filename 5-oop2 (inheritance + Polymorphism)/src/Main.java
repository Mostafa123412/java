import Polymorphism.Rectangle;
import Polymorphism.Shape;
import Polymorphism.Triangle;
import inheritance.Person;
import inheritance.Student;
import inheritance.Teacher;

public class Main {
    public static void main(String[] args) {

        System.out.println("----------{ inheritance }--------");

        Person person=new Person("Mohamed","Alex");
        person.toString();
        System.out.println();

        Teacher t1=new Teacher("Mostafa","new Cairo");
        t1.toString();
        t1.addCourses("Android");
        t1.addCourses("Flutter");
        t1.addCourses("English");
        t1.addCourses("English");
        t1.addCourses("Android");
        t1.printCourses();
        System.out.println("------------------");
        t1.removeCourses("Android");
        System.out.println("After remove process :");
        t1.printCourses();
        System.out.println();

        Student student=new Student("Ahmed","Giza");
        student.addCourses("Android");
        student.addCourses("C++");
        student.addCourseGrade("Android",90);
        student.addCourseGrade("C++",95);
        student.addCourseGrade("English",98);
        student.getAverageGrade();
        student.printGrades();
        student.toString();
        System.out.println();

        System.out.println("----------{ Polymorphism }--------");

        Triangle triangle=new Triangle("red",10,5);
        triangle.toString();
        System.out.println("the area of triangle = "+triangle.getArea());
        System.out.println();

        Rectangle rectangle =new Rectangle("red",6,8);
        rectangle.toString();
        System.out.println("the area of rectangle = "+rectangle.getArea());
        System.out.println();



    }
}