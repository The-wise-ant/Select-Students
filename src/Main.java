import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Prompt the user to enter the number of students
        System.out.println("Enter number of students");

        // Create a Scanner object to read input from the console
        Scanner scan = new Scanner(System.in);

        // Read the number of students provided by the user
        int numStudents = scan.nextInt();

        // Create arrays to store student names and ages
        String[] student = new String[numStudents];
        int[] age = new int[numStudents];

        // Create separate Scanner objects for reading names and ages
        Scanner scanName = new Scanner(System.in);
        Scanner scanAge = new Scanner(System.in);

        // Loop to input student names and ages
        for (int i = 0; i < numStudents; i++) {

            System.out.println("Enter name: ");
            // Read and store the student's name
            student[i] = scanName.nextLine();

            System.out.println("Enter age: ");
            // Read and store the student's age
            age[i] = scanAge.nextInt();
        }

        // Loop to check which students can receive a vaccine
        for (int i = 0; i < numStudents; i++) {

            // Check if the student's age is greater than or equal to 15
            if (age[i] >= 15) {
                System.out.println(student[i] + " can receive a vaccine.");
                System.out.println("The student is now " + age[i]);
            }
        }

        // Close the Scanner objects to release resources
        scan.close();
        scanName.close();
        scanAge.close();
    }
}
