import javax.swing.text.View;
import java.util.Scanner;

public class Student {
    private String FirstName;
    private String LastName;
    private String graduateYear;
    private String StudentID;
    private String courses = "";
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
        ViewBalance();
        PayFee();
        System.out.println("Record Updated!!!");
    }

    // Generate an student ID

    public void setStudentID()
    {
        id++;
        StudentID = id + graduateYear;
    }

    // Enroll for courses
    public void addCourses()
    {
        do {
            System.out.println("Please enter the course you want enroll [Press 'Q' to exit]: ");
            Scanner sc  = new Scanner(System.in);
            String new_course = sc.nextLine();
            if(!new_course.equals("Q"))
            {
                courses = courses + "\n    " + new_course ;
                Balance = Balance + course_cost;
            }
            else
                break;
        }
        while(1!=0);

    }

    // View balance
    public void ViewBalance()
    {
        System.out.println("Balance : " + Balance);
    }


    // Pay tuition
    public void PayFee()
    {
        System.out.println("Please enter the amount you want to pay: ");
        Scanner sc = new Scanner(System.in);
        int pay = sc.nextInt();
        Balance = Balance - pay;
    }


    // Show status
    public void showInfo()
    {
        System.out.println("\nName "+FirstName + " " + LastName +
                "\nGraduation Level : " + graduateYear +
                "\nStudentID : "+ StudentID +
                "\nEnrolled courses: "+ courses+
                "\nBalance : " + Balance);
    }

}
