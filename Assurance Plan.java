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
	    int SylverPlan= 150;
	    int GoldPlan= 250;
	    int PlatinumPlan= 350;
	    
	    System.out.println("What plan do you want to buy ? (Sylver, gold or platinum) ");
	    String Plan= sc.nextLine().trim().toLowerCase();
	    
	    double plan_value= 0;
	    if (Plan.equals("sylver")); { plan_value = SylverPlan; }
	    if (Plan.equals("gold")); { plan_value = GoldPlan; }
	    if ( Plan.equals("Platinum")); { plan_value = PlatinumPlan; }
	    
	    System.out.println("Have you ever had an accident ?");
	    String accident= sc.nextLine().trim().toLowerCase();
	    
	    System.out.println("Are you a Student ? ");
	    String currentStudent= sc.next().trim().toLowerCase();
	    
	    System.out.println("Enter your age:");
		int age= sc.nextInt();
		
		System.out.println("Are you currently working in the state or federal government ?");
		String Working= sc.next().trim().toLowerCase();
		
		System.out.println("Enter your number of accidents:");
		int numAccidents= sc.nextInt();
		
		System.out.println("Enter the type of car owned:");
	    String CarType= sc.next().trim().toLowerCase();
		
		if (age<25 && currentStudent.equals("yes") && accident.equals("no")) { plan_value -= plan_value*0.1; }
		else if (age>25 && Working.equals ("yes") && accident.equals ("no")) { plan_value -= plan_value*0.05; }
		else {System.out.println ("No discount is applied: " + plan_value); }
		
		if ( currentStudent.equals ("yes") && numAccidents>2) { plan_value += plan_value*0.15; }
		
		else if (numAccidents>2) { plan_value += plan_value*0.12; }
		
	    if (CarType.equals("Luxury")) { plan_value += plan_value*0.25; }
	    if (CarType.equals("EV")) { plan_value -= plan_value*0.07; }
		
		System.out.println("Final insurance prenium:" + plan_value + ".");
	     
	     sc.close();
	}
}