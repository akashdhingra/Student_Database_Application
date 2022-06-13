import java.util.Scanner;

public class Student {
    private String FirstName;
    private String LastName;
    private String graduateYear;
    private String StudentID;
    private String courses;
    private int Balance = 0;
    private int course_cost = 600;
    private int id = 1000;

    // Constructor to ask user to enter name of student and graduate year
    public Student()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First Name");
        this.FirstName = sc.nextLine();
        System.out.println("Enter your Last Name");
        this.LastName = sc.nextLine();
        System.out.println("Name is "+this.FirstName +" " + this.LastName );
        System.out.println("Please select your graduation year:\n1: Junior\n2: Mid level\n3: Senior" );
        this.graduateYear = sc.nextLine();
        setStudentID();
        addCourses();
        showInfo();
    }

    // Generate an student ID

    public void setStudentID()
    {
        id++;
        this.StudentID = id + graduateYear;
    }

    // Enroll for courses
    public void addCourses()
    {
        System.out.println("Please enter the course you want enroll: ");
        Scanner sc  = new Scanner(System.in);
        String new_course = sc.nextLine();
        this.courses = new_course + this.courses ;
    }

    // View balance

    // Pay tuition

    // Show status
    public void showInfo()
    {
        System.out.println("Name "+this.FirstName + " " + this.LastName +
                "\nGraduation Level : " + this.graduateYear +
                "\nStudentID : "+ this.StudentID +
                "\nEnrolled courses: "+this.courses);
    }

}
