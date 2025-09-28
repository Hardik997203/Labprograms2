package banksys;
import java.util.*;

public class BankDemo {

	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	       
	        Account acc = new Account(001, "Hardik", 4500);

	        while (true) {
	            System.out.println("\n=== Banking Menu ===");
	            System.out.println("1. Deposit");
	            System.out.println("2. Withdraw");
	            System.out.println("3. Show Balance");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");

	            try {
	                int choice = sc.nextInt();
	                switch (choice) {
	                    case 1:
	                        System.out.print("Enter deposit amount: ");
	                        double dAmt = sc.nextDouble();
	                        acc.deposit(dAmt);
	                        break;

	                    case 2:
	                        System.out.print("Enter withdraw amount: ");
	                        double wAmt = sc.nextDouble();
	                        try {
	                            acc.withdraw(wAmt);
	                        } catch (InsufficientBalanceException e) {
	                            System.out.println("Error: " + e.getMessage());
	                        }
	                        break;

	                    case 3:
	                        acc.showBalance();
	                        break;

	                    case 4:
	                        System.out.println("Exiting... Thank you!");
	                        System.exit(0);

	                    default:
	                        System.out.println("Invalid choice! Try again.");
	                }
	            }
	            catch (InputMismatchException e) {
	                System.out.println("Invalid input! Please enter a number.");
	                sc.nextLine();
	            }
	            catch (ArithmeticException e) {
	                System.out.println("Error: " + e.getMessage());
	            }
	        }
	    }
	}