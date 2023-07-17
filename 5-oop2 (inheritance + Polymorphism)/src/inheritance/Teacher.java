package inheritance;

public class Teacher extends Person{

    private int numCourses;
    private String[] courses;
    private final int coursesCapacity=10;

    public Teacher(String name, String address) {
        super(name, address);
        numCourses =0;
        courses=new String[coursesCapacity];
    }


    @Override
    public String toString() {
        System.out.println( getName()+"("+getAddress()+")");
        return "";
    }


    public boolean addCourses(String courseName){

        for (int i = 0; i< numCourses; i++){
            if (courseName.equals(courses[i])){
                System.out.println("course is already exist !");
                return false;
            }
        }

        courses[numCourses]=courseName;
        numCourses++;


        return true;
    }

    public boolean removeCourses(String courseName){

        for (int i = 0; i< numCourses; i++){
            if (courseName.equals(courses[i]))
            {
                for (int j = i; j< numCourses; j++)
                {
                   courses[j]=courses[j+1];
                }
                numCourses--;
                return true;
            }
        }
        System.out.println("course is not exist !");

        return false;
    }

    public void printCourses(){
        for (int i=0;i<numCourses;i++){
            System.out.println(courses[i]);
        }
    }



}
