/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		
		double StandardAdult= 50;
		double ChildMembership= 25;
		double SeniorCitizen= 15;
		
		int choice;
		do {
		System.out.println("Health Club Membership Menu");
		System.out.println("1. Standard Adult Membership");
		System.out.println("2. Child Membership");
		System.out.println("3. Senior Citizen Membership");
		System.out.println("4. Quit the Program");
		System.out.println("Enter your choice:");
		 choice= sc.nextInt();
		
		if (choice >= 1 && choice <= 3) { 
		System.out.println("For how many months?");
		 int month= sc.nextInt();
		 double total= 0;
		 switch (choice) {
		     case 1:
		         total = month * StandardAdult;
		         break;
		      case 2:
		          total = month * ChildMembership;
		         break;
		       case 3:
		           total = month * SeniorCitizen;
		         break;
		 }
		System.out.println("The total charges are $" + total ); }
		else if (choice != 4) { System.out.println("Exit Menu");}
		}
		
		while (choice != 4);
		
		System.out.println("Thanks you for using Health Club Membership program");
		
		
		 sc.close();
	}
}