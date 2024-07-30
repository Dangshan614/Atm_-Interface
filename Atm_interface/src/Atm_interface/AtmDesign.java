package Atm_interface;
import java.util.Scanner;

 class bank_account {
		 private double balance ;
		 public bank_account(double initial_amount)
		 {
			balance = initial_amount;
		 }
		 public double getbalance() 
		 {
			 return balance;
		 }
		 public double withdraw(double withdraw)
		 {
			 return balance-withdraw;
		 }
		 public double deposit (double deposit)
		 {
			 return balance+deposit;
		 }
		}

	public class AtmDesign {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    bank_account account = new  bank_account(1000.00);
	    while(true) {
		System.out.println("1.Withdrawing ");
		System.out.println("2.Depositing");
		System.out.println("3.Checking bank balance");
		System.out.println("4.Exit");
		System.out.println("Enter the number corresponding to your need.");
		int need = scanner.nextInt();
		 
		switch (need)
		{
		case 1 :
			System.out.println("Enter your withdrwal amount");
			double Withdraw = scanner.nextDouble();
			if(Withdraw <= account.getbalance())
			{
				System.out.println(" Transaction success..");
				System.out.println("Your account balance is " + account.withdraw(Withdraw) );
			}
			else 
			{
				System.out.println("Sorry..insuficient account balance.");
			}
			break;
			
		case 2 :
			System.out.println("Enter your deposit amount ");
			double Deposit = scanner.nextDouble();
			if (Deposit >=0)
			{
				System.out.println(" Transaction success..");
				System.out.println("Your account balance is " + account.deposit(Deposit));
			}
			else 
			{
				System.out.println("Invalid amount..");
			}
			break;
		case 3 :
			System.out.println("Your account balance is " + account.getbalance());
			break;
		case 4 :
			System.out.println("Thanks for using ATM...");
			scanner.close();
			return;
			default:
				System.out.println("Invalid choice...Try again.");
				continue;
		}
	    }
	}
	}
		
		