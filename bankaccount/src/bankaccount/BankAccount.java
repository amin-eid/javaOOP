package bankaccount;
import java.util.Random;
public class BankAccount {

	String accountNumber;
	double checkingbalance;
	double savingsbalance;
	static int counter=0;
	static double totalAmount;
	
	public BankAccount() {
		// TODO Auto-generated constructor stub
		counter++;
		randNum();
	}

	public static int howMany() {
		return counter;
	}
	
	
	private String randNum(){
	    String numbers = "0123456789";
	    String newAccountNumber = "";

	    Random rand = new Random();

	    for (int i = 0; i < 5; i++){
	        int numb = numbers.charAt(rand.nextInt(10));
	        newAccountNumber += numb; 
	    }
	    
	    accountNumber = newAccountNumber; 

	    return newAccountNumber;
	}

	public double getCheckingbalance() {
		return this.checkingbalance;
	}


	public double getSavingsbalance() {
		return this.savingsbalance;
	}

	public double totalAmount(){
	    totalAmount = checkingbalance + savingsbalance;
	    return totalAmount;
	}

	public void setCheckingbalance(double checkingbalance) {
		this.checkingbalance = checkingbalance;
	}

	public void setSavingsbalance(double savingsbalance) {
		this.savingsbalance = savingsbalance;
	}
	
	public void depositChecking(double checkingBalance){
	    this.setCheckingbalance(checkingBalance);
	    totalAmount += checkingBalance;
	}
	
	public void depositSavings(double savingsBalance){
	    this.setSavingsbalance(savingsBalance);
	    totalAmount += savingsBalance;
	}
	
	
	
	
	public void withdrawChecking(int money){
	    if (getCheckingbalance() < Double.valueOf(money)){
	        System.out.println("You don't have enought money to take out more money.");
	    } 
	    else{
	        setCheckingbalance(getCheckingbalance() - Double.valueOf(money));

	    }
	}

	public void withdrawSavings(int money){
	    if (getSavingsbalance() < Double.valueOf(money)){
	        System.out.println("You don't have enought money to take out more money.");
	    } 
	    else{
	        this.setSavingsbalance(this.getSavingsbalance() - Double.valueOf(money));
	    }

	}
	
	
	
	

}
