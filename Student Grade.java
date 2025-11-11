/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter student’s grade from ‘A’ to ‘F’:");
		String Grade= sc.next().trim().toUpperCase();
		System.out.println("You have entered: "+ Grade + ".");
		
		switch (Grade) {
		    case "A":
		        System.out.println("You will need to score 90-100 to get an A in this class.");
		      break;
		    case "B":
		        System.out.println("You will need to score 80-89 to get an B in this class.");
		      break;
		    case "C":
		        System.out.println("You will need to score 70 - 79 to get an C in this class.");
		      break;
		    case "D":
		        System.out.println("You will need to score 65-69 to get an D in this class.");
		      break;
		    case "E":
		        System.out.println("You will need to score 60-64 to get an D in this class.");
		      break;
		    case "F":
		        System.out.println("Work harder next sem!.");
		      break;
		}

		sc.close();
	}
}