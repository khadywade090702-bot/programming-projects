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
		
		int bill = 1;
		
		while (true) 
		{
		    System.out.println("*** Bill" + bill + "***");
		    
		    System.out.println("Welcome to the shopping cart program! ");
		    double totalCost = 0.0;
		    int itemNumber = 1;
		    
		    while (true) 
		    { 
		        System.out.print("Enter the cost of each item (enter 0 to finish): $");
		        double EachCost=sc.nextDouble();
		    
		        if (EachCost == 0) 
		        {
		            break;
		        }
    		    totalCost += EachCost;
    		    itemNumber++;
		    }
		    double discount = 0;
		    if (totalCost > 100) { discount = 0.05; }
		    if (totalCost > 150) { discount = 0.07; }
		    if (totalCost > 200) { discount = 0.1; }
		    
		    String HasCoupon= sc.nextLine();
		    System.out.print("Do you have a coupon code? (y/n): ");
		    HasCoupon= sc.nextLine();
		    String coupon="";
    		double Coupondiscount = 0;
		    if (HasCoupon.equalsIgnoreCase("y")) 
		    { 
    		    System.out.println("Please enter your coupon code:");
    		    coupon = sc.nextLine();
		    
    		    switch (coupon.toLowerCase()) 
    		    {
    		        case "online":
    		            Coupondiscount = 0.05;
    		            break;
    		        case "Pickup":
    		            Coupondiscount = 0.1;
    		            break;
    		        default:
    		            Coupondiscount = 0;
    		    }
		    }
		    double totalDiscount = totalCost*(discount + Coupondiscount);
		    double finalCost = totalCost - totalDiscount;
		    
		    
		    System.out.println("$ Total cost:" + totalCost);
		    
		    System.out.println("Discount:" + discount*100 + "%" );
		    
		    System.out.println("Coupon Code Discount: " + Coupondiscount*100 + "%");
		    
		    System.out.println("Total discount: $" + totalDiscount);
		    
		    System.out.println("Final cost: $" + finalCost);
		    
		    System.out.println("Would you like to calculate another bill? (y/n):");
	
		    String Continue = sc.nextLine();
		    
		    if (Continue.equalsIgnoreCase("y")) { }
		    else {
    		    System.out.println("Thank you for using the shopping cart program!");
    		    break;
		    }
		    bill++;
		}
		 
		 sc.close();
		
}
}