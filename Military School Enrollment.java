/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("What is your name ?");
        String name= scanner.nextLine();
        System.out.println("What is your gender ? (Male / Female)");
        String gender= scanner.nextLine().trim().toLowerCase();
        System.out.println("What is your age ?");
        String UScitizen= "no";
        int age= scanner.nextInt();
        scanner.nextLine();
        boolean isEligible = false;
		
		if (gender.equalsIgnoreCase("Male") && age >= 18 && age <= 30) 
		{ 
		    isEligible = true; 
		}
		else if (gender.equalsIgnoreCase("Female") && age >= 18 && age <= 34) 
		{
		    isEligible = true; 
		    
		}
		else 
		{
		     System.out.println("You are currently ineligible to enroll in military school."); 
		}
		     
	    if (isEligible)
	    {
	        System.out.println("Are you an US Citizen ? (Yes/No):");
		    UScitizen= scanner.nextLine().trim().toLowerCase();
	    
    		if (UScitizen.equalsIgnoreCase("yes")) { 
    		     System.out.println("You are eligible to enroll in Military School.");
    		 }
		     else {
		         System.out.println("You are ineligible to apply due to non-US citizen.");
		     }
	    }
		 scanner.close();
	}
    
}