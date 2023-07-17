package inheritance;

public class Student extends Person{

    private int numCourses;
    private String[] courses;
    private final int coursesCapacity=10;
    private int[] grades;

    public Student(String name, String address) {
        super(name, address);
        courses=new String[coursesCapacity];
        numCourses =0;
        grades=new int[coursesCapacity];
    }

    @Override
    public String toString() {
        System.out.println( getName()+"("+getAddress()+")");
        return "";
    }

    public boolean addCourseGrade(String courseName,int grade){

            for (int i = 0; i < numCourses; i++)
            {
                if (courseName.equals(courses[i]))
                {
                    grades[i] = grade;
                    return true;
                }

            }
            courses[numCourses] = courseName;
            grades[numCourses] = grade;
            numCourses++;
            return true;

    }

    public void printGrades(){
        for (int i = 0; i < numCourses; i++)
        {
            System.out.println("course : "+courses[i]+" ---> "+grades[i]);
        }
    }

    public double getAverageGrade(){

        double sum=0;
        if (numCourses !=0)
        {
            for (int i = 0; i < numCourses; i++) {
                sum = sum + grades[i];
                System.out.println("the average grade : ");
                return sum / numCourses;

            }
        }else {
            System.out.println("there are no courses !!");
        }
        return -1;
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


}
