//student selection project:
//1-Determine who are above 15 years old to recieve vaccine
//2-Enter number of student
//3-Input student names and ages
//use array
import java.util.Scanner;//importing scanner package
import java.util.Arrays;

public class StudentProject {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner scannerName = new Scanner(System.in);
        Scanner scannerAge = new Scanner(System.in);
        // Asking for the number of students
        System.out.print("How many students do we have? ");
        int inputNumber = scanner.nextInt();
       

        String[] names = new String[inputNumber];
        int[] ages = new int[inputNumber];
        
        
        for(int i=0; i<inputNumber; i++){

            System.out.println("Input the name of student: ");
            names[i] = scannerName.nextLine();
             
            System.out.println("input the age of the student: ");
            ages[i] = scannerAge.nextInt();
            scanner.nextLine(); 
            
        }

        // Display students eligible for the vaccine
        System.out.println("Students eligible for the vaccine (Age > 15):");
        for (int i=0; i<inputNumber; i++){
            if(ages[i]>15){
              System.out.println(names[i] + " (Age: " + ages[i] + ")");
            }
        }
        scanner.close();
        scannerName.close();
        scannerAge.close();
    }
    }