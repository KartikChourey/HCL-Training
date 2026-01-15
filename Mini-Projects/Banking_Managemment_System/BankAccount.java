package AdvanceBankManagmentSystem;
import java.util.*;

//Account Creation
public class BankAccount implements BankingOperations,CustomerOperations {
	Scanner sc = new Scanner(System.in);
	
	//Customer detail required
	int AccountNumber;
	String UserName;
	double Balance ;
	String MobileNumber;
	
	//Initialize using construction
	BankAccount(int AccountNumber, String UserName, String MobileNumber, double Balance){
		this.AccountNumber = AccountNumber;
		this.UserName = UserName;
		this.MobileNumber = MobileNumber;
		this.Balance = Balance;
		
	}
	
	//Deposit Money
	public void Deposit(double Amount) {
		if (Amount>0){
			Balance += Amount;
			System.out.println("Deposit Successful");
		}
		else{
			System.out.println("Deposit Unsuccessful : Invalid amount");
		}
		
	}
	
	//Withdraw money
	public void Withdraw(double Amount) {
		
		if (Amount<=Balance){
			Balance -= Amount;
			System.out.println("Withdraw Successful");
		}
		else{
			System.out.println("Withdraw Unsuccessful : Invalid Withdraw amount");
		}
	}
	
	// Check your Balance
	public double CheckBalance() {
		
		return Balance;
	}
	
	//Update user name
	public void UpdateuserName(String UserName) {
		
		 this.UserName = UserName;
		 System.out.println("User Name Update Successful");
	}
	
	// update Mobile Number
	public void UpdateMobileNumber(String MobileNumber) {
		
		 this.MobileNumber = MobileNumber;
		 System.out.println("Mobile Number Update Successful");
	}
	
	//Print All user Detail
	public void CustomerDetail() {
		
		System.out.println("Account Number :: "+AccountNumber);
		System.out.println("UserName :: "+UserName);
		System.out.println("Mobile Number :: "+MobileNumber);
		
	}
	
}
