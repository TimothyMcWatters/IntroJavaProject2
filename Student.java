import java.util.Scanner;

/**
This program:
Reads input from the keyboard using a Scanner Object and its methods.
Displays information to the user in various formats, including formatting numbers
Manipulates String objects using various String methods.  

@author Timothy McWatters
@version 1.0

COP2253    Project 2
File Name: Project2.java
*/

public class Student 
{
   
	public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      // Variable Declarations
	   String firstName1;
      String firstName1Formatted;
      int numberOfCourses1; 
      double costPerCourse1;
      double totalCost1;
      
      String firstName2;
      String firstName2Formatted;
      int numberOfCourses2; 
      double costPerCourse2;
      double totalCost2;
      
      System.out.println("Enter info for the first student.");
      System.out.printf("Name: ");
	   firstName1 = keyboard.next();
      firstName1Formatted = firstName1.substring(0,1).toUpperCase() + firstName1.substring(1).toLowerCase();
      System.out.printf("Number of courses: ");
      numberOfCourses1 = keyboard.nextInt(); 
      System.out.printf("Cost per course: ");
      costPerCourse1 = keyboard.nextDouble();
      totalCost1 = costPerCourse1 * numberOfCourses1;
      
      System.out.printf("%nEnter info for the second student.");
      System.out.printf("%nName: ");
      firstName2 = keyboard.next();
      firstName2Formatted = firstName2.substring(0,1).toUpperCase() + firstName2.substring(1).toLowerCase();
      System.out.printf("Number of courses: ");
      numberOfCourses2 = keyboard.nextInt(); 
      System.out.printf("Cost per course: ");
      costPerCourse2 = keyboard.nextDouble();
      totalCost2 = costPerCourse2 * numberOfCourses2;
      
      System.out.println("---------------------------------------");
      System.out.println("|Name       |Courses |Cost    |Tuition |");
      System.out.println("---------------------------------------");
      System.out.printf("|%-11s|%8d|%8.2f|%8.2f|", firstName1Formatted, numberOfCourses1, costPerCourse1, totalCost1);
      System.out.println();
      System.out.printf("|%-11s|%8d|%8.2f|%8.2f|", firstName2Formatted, numberOfCourses2, costPerCourse2, totalCost2);
      System.out.println();
      System.out.println("---------------------------------------");
   }
}