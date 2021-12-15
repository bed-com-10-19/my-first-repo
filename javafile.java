// importing a scanner
import java.util.Scanner;

// Main method
public class javafile{
public static void main(String[] args){

  // We want to print the word "The area will be shown"  
 System.out.println("The area will be shown here");

 // Create a Scanner object
 Scanner input = new Scanner(System.in);

 // Allow the user to enter length 
 System.out.print("Enter the Length: ");
 double Leng = input.nextDouble();

//Allow the user to enter breadth
 System.out.print("Enter the Breadth: ");
 double Brea = input.nextDouble();

// Creating and object
Area area1 = new Area();

// set the values of length and breadth
area1.setArea(Leng,Brea);

// printing the output to the console
System.out.println("The area of a rectangle is " + area1.getArea());

}
} 