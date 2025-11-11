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
		
		System.out.println("Enter initial bank balance:");
		 double BankBalance= sc.nextDouble();
		
		System.out.println("What are the estimated years you plan to maintain your initial balance: ");
		 int InitialBalanceYears= sc.nextInt();
		
		System.out.println("*** Bank Balance Interest Calculator *** ");
		 
		 double InterestRate = 0.1;
		
		 if (BankBalance < 30000) { InterestRate = 0.02; }
		   
		 else if (BankBalance < 50000) { InterestRate = 0.03; }
		   
		 else if (BankBalance < 80000) { InterestRate = 0.04; }
		   
		 else {InterestRate = 0.05; }
		 
		 for (int i = 1; i <= InitialBalanceYears; i++) {
		   
		 BankBalance += BankBalance * InterestRate;
		   
		 System.out.println(" After " + i + " years $ " + BankBalance + ", at an interest rate of " + InterestRate);  
		 }
		sc.close();
	}
}