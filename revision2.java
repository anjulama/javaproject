package first_project_1;

public class revision2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// what are functions?
		
				int a = 10;
				int b = 5; 
			
		   Calculator(12,6);
		  
		
		    additionA();
		
			additionB(12,13);
			
     	    int q1 = additionC(30,30);
			System.out.println(q1);
			System.out.println(q1+q1);
			System.out.println(q1-5);
		    System.out.println(q1 * 0.6);

				
		    String q2  =Greet("Anju");
			System.out.println(q2);
			}
			
			
			public static void Calculator(int x ,int y) {
				System.out.println(x+y);
				System.out.println(x-y);
				System.out.println(x*y);
				System.out.println(x/y);
				System.out.println(x%y);
				
			}
			
			// function without parameter and no return type 
			
			public static void additionA() {
			System.out.println(9+9);
			}
			
			// function with parameter and without return type
			
			public static void additionB(int x , int y) {
			System.out.println(x+y);
			}
			
			
			// function with parameter and with return type
			
			public static int additionC(int a , int b) {
			return a + b;
			}
			

			public static String Greet(String name) {
			return "welcome" + name ;
				
			}
			
			
			
			
			
		

}
