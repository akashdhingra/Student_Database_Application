import java.util.Scanner;

public class Student {
    private String FirstName;
    private String LastName;
    private String graduateYear;
    private int StudentID;
    private String courses;
    private int Balance = 0;
    private int course_cost = 600;

    // Constructor to ask user to enter name of student and graduate year
    public Student()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First Name");
        this.FirstName = sc.nextLine();
        System.out.println("Enter your Last Name");
        this.LastName = sc.nextLine();
        System.out.println("Name is "+this.FirstName +" " + this.LastName );

    }

    // Generate an student ID

    // Enroll for courses

    // View balance

    // Pay tuition

    // Show status


}
