package first_project_1;

public class practice {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// oops practice
		
		
		Car3 mycar2 = new Car3(2000, "honda");
		System.out.println(mycar2.year);
		System.out.println(mycar2.make);
			
			
	    Car3 mycar21 = new Car3(2001, "gti");
	    System.out.println(mycar21.year);
	    System.out.println(mycar21.make);
	    System.out.println(mycar21.country);
	   
	    mycar21. drive();
	}
}

class Car3{
	  int year;
	  String make;
	  String country= "india";
	  
	  
	  Car3(int a, String b){
		  this.year = a;
		  this.make = b;
	  }
		  
 public void drive() {
		 System.out.println("i am driving");
			}
}