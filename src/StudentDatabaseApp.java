import java.util.Scanner;

public class StudentDatabaseApp {

    public static void main(String[] args) {
        int no_of_students;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of students you want to enroll: ");
        no_of_students = sc.nextInt();
        Student[] students = new Student[no_of_students];
        for(int i=0; i<no_of_students; i++)
        {
            students[i] = new Student();
        }

        for(int i=0; i<no_of_students; i++)
        {
            students[i].showInfo();
        }

    }
}