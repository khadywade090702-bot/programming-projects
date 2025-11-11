/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main {
  static boolean[] seats = new boolean[10];

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int choice;

     do {
            System.out.println("\n--- Bus Seat Booking System ---");
            System.out.println("1. Book a Seat");
            System.out.println("2. Cancel a Booking");
            System.out.println("3. Show Seat Status");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
                choice = sc.nextInt();

          switch (choice) {
              case 1:
                bookSeat(sc);
               break;
              case 2:
                cancelSeat(sc);
               break;
              case 3:
                 displaySeats();
               break;
              case 4:
                 System.out.println("Thank you! Goodbye.");
                  break;
              default:
                 System.out.println("Invalid option. Please try again.");
     }
       } while (choice != 4);

       sc.close();
     }

     public static void bookSeat(Scanner sc) {
        System.out.print("Enter seat number to book (1–10): ");
         int seat = sc.nextInt();
        if (seat < 1 || seat > 10) {
           System.out.println("Invalid seat number.");
        } else if (seats[seat - 1]) {
           System.out.println("Seat " + seat + " is already booked.");
        } else {
        seats[seat - 1] = true;
           System.out.println("Seat " + seat + " has been booked successfully.");
       }
    }

    public static void cancelSeat(Scanner sc) {
     System.out.print("Enter seat number to cancel (1-10): ");
         int seat = sc.nextInt();
        if (seat < 1 || seat > 10) {
            System.out.println("Invalid seat number.");
      } else if (!seats[seat - 1]) {
            System.out.println("Seat " + seat + " is not currently booked.");
      } else {
            seats[seat - 1] = false;
             System.out.println("Booking for seat " + seat + " has been canceled.");
      }
    }

    public static void displaySeats() {
        System.out.print("Seat Status: ");
        for (int i = 0; i < seats.length; i++) {
             if (seats[i]) {
                System.out.print("[X] ");
            } else {
                System.out.print("[" + (i + 1) + "] ");
            }
    }
         System.out.println();
    }
}

