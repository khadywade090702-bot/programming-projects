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
		System.out.println("*** Nj Tax Bracket determiner by income for Single or Head of Household****");
		
		System.out.println("Please enter your full name: ");
		String name= sc.nextLine();
		
		System.out.println("Hello " + name + "! What is your annual income: ");
		double Income= sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Please enter your filing status ((S) for Single or (H or h) for Head of household: ");
		String household= sc.nextLine();
		 
		 
		 double TaxRate= 0.0;
		 
		 if ( household.equalsIgnoreCase("S")) { 
		   if (Income <= 11000) TaxRate = 0.10;
		   else if (Income <= 44725) TaxRate = 0.12;
		   else if (Income <= 95375)  TaxRate = 0.22;
		   else if (Income <= 182100) TaxRate = 0.24;
		   else if (Income <= 231250) TaxRate = 0.32;
		   else if (Income <= 578125) TaxRate = 0.35;
		   else if (Income > 578125) TaxRate = 0.37; }
		   
		else if ( household.equalsIgnoreCase("H")) { 
		   if (Income <= 15700) TaxRate = 0.10;
		   else if (Income <= 59850) TaxRate = 0.12;
		   else if (Income <= 95350)  TaxRate = 0.22;
		   else if (Income <= 182100) TaxRate = 0.24;
		   else if (Income <= 231250) TaxRate = 0.32;
		   else if (Income <= 578100) TaxRate = 0.35;
		   else if (Income > 578100) TaxRate = 0.37; }
		   
		 double Tax= Income * TaxRate;
		 double Taxbracket= TaxRate * 100;
		 System.out.println("Your Income tax bracket: ");
		 System.out.println("Tax bracket: " + Taxbracket + "%");
		 System.out.println("Income tax (aprox): $" + Tax);
		 
		 sc.close();
	}
}