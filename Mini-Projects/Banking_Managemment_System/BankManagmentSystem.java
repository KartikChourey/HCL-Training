package AdvanceBankManagmentSystem;
import java.util.*;

//Main Class 
public class BankManagmentSystem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account Number : ");
		int AccountNumber = sc.nextInt();
		
		System.out.println("Enter User Name : ");
		String UserName = sc.next();
		
		System.out.println("Enter Mobile Number : ");
		String MobileNumber = sc.next();
		
		int Balance = 0;
		BankAccount Acc = new BankAccount(AccountNumber,UserName,MobileNumber,Balance);
		
		System.out.println();
		
		int choice;
		
		do {
			
			System.out.println();
			System.out.println("Press 1 for Deposit Money : ");
			System.out.println("Press 2 for Withdraw Money : ");
			System.out.println("Press 3 for Check Bank Balance : ");
			System.out.println("Press 4 for Update User Name : ");
			System.out.println("Press 5 for Update Mobile Number : ");
			System.out.println("Press 6 for Check User Detail : ");
			System.out.println("press 7 for Exit //  : ");
			
			System.out.println();
			System.out.println("Enter Your Choice : ");
			choice = sc.nextInt();
			
			switch(choice) {
			
				case 1:
					System.out.println("\nEnter the Amount for deposit ");
					double DAmount = sc.nextDouble();
					Acc.Deposit(DAmount);
					break;
					
				case 2:
					System.out.println("\nEnter the Amount for Withdraw ");
					double WAmount = sc.nextDouble();
					Acc.Withdraw(WAmount);
					break;
					
				case 3:
					
					double balance = Acc.CheckBalance();
					System.out.println("\nYour Balance : "+balance);
					break;
					
				case 4:
					System.out.println("\nEnter the New User name for Update : ");
					String username = sc.next();
					Acc.UpdateuserName(username);
					break;
					
				case 5:
					System.out.println("\nEnter the New Mobile Number for Update ");
					String mobileno = sc.next();
					Acc.UpdateMobileNumber(mobileno);
					break;
					
				case 6:
					Acc.CustomerDetail();
					break;
			}
			
		}while(choice != 7);
		
		
		System.out.println("...........Thank You For Using Our System ..............");
		sc.close();
	}

}
