package first_project_1;

public class oops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		
		
	   Car mycar = new Car();
       System.out.println(mycar.year);
       System.out.println(mycar.make);
       
	    mycar.drive();
	    
	    
	    Bank anju = new Bank ( "anju", 123, 500);
	    System.out.println(anju.accName);
	    System.out.println(anju.accNo);
	    System.out.println(anju.bal);
	    
	    int updatedBal = anju.deposit(1000);
	    System.out.println(updatedBal);

	    
	    int updatedBal2 = anju.withdrawl(500);
	    System.out.println(updatedBal2);
	  
	    int currentBal = anju.withdrawl(1500);
	    System.out.println(currentBal);
		 } 
	       
}
	

	class Car{
		 int year = 2020;
		 String make = "toyota";
	
	public void drive() {
		System.out.println("i am driving");
	}
	}
	  
	 
	 class Bank{ 
		 String accName;
		 int accNo;
		 int bal;
		 
		 
		 Bank(String aN, int acN, int bal){
			 this.accName=aN;
			 this.accNo=acN;
			 this.bal=bal;
		 }
		 
		 public int deposit(int amount) {
			 this.bal=this.bal +amount;
			 System.out.println(this.bal);
			 return this.bal;
		 }
		 public int withdrawl(int amount) {
			 if (this.bal>amount) {
				 this.bal=this.bal - amount;
				 System.out.println(this.bal);
				 }
			 else {
				 System.out.println("insufficient Balance");
			 }
			 return this.bal;
			 
		 }}
 
	 