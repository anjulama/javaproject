package first_project_1;

public class Revisionhomework1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String 
				String firstName = "anju";
				System.out.println(firstName);
			
				String a =firstName.toUpperCase();
				System.out.println(a);
		// Method chaining
				int b = firstName.toUpperCase().toLowerCase().length();
				System.out.println(b);
    	// comparison relational operator
				int a1=2;
				int a2=4;
				System.out.println(a1 < a2); 
				System.out.println(a1 >a2); 
				System.out.println(a1 != a2); 
				System.out.println(a1 >= a2); 
				System.out.println(a1 <= a2); 
				System.out.println(a1 == a2); 
		// Logical operators
		// AND operation , OR, NOt Operator
			int b1 = 10;
			int b2 = 20;
			int b3 = 30;
					
			System.out.println(b1<b2 && b2< b3);
			System.out.println(b1<b2 && b2> b3);

			System.out.println(b1<b2 || b2> b3);	
		
			System.out.println(!(b1 >b2));
			
		// Conditional statements 

			int spend= 110;
				if(spend >= 50) {
					System.out.println(" 10 % discount");
				}
				if(spend>=75) {
					System.out.println("25 % discount");
				}
				if(spend >=100) {
					System.out.println("50 % discount");
				}
				
				
				if(spend >= 100) {
					System.out.println(" 50 % discount");
				}
				else if(spend>=75) {
					System.out.println("25 % discount");
				}
				else if(spend >=50) {
					System.out.println("10 % discount");
				}

		// Switch case
				int day = 2;
				switch (day) {
				  case 1:
				    System.out.println("Monday");
				    break;
				  case 2:
				    System.out.println("Tuesday");
				    break;
				  case 3:
				    System.out.println("Wednesday");
				    break;
				  case 4:
				    System.out.println("Thursday");
				    break;
				  case 5:
				    System.out.println("Friday");
				    break;
				  case 6:
				    System.out.println("Saturday");
				    break;
				  case 7:
				    System.out.println("Sunday");
				    break;
				}
		// Loops
				
				for (int i = 0; i<=10; i ++) {
					System.out.println(i);
				}
				
				for (int i = 0; i<=10; i ++) {
					System.out.println(i);
					if (i ==5) {
						break;
					}
				}
				for (int i = 0; i<=10; i ++) {
					if (i ==5) {
						continue;
					}
					System.out.println(i);
				}
			// while 

			int i2 = 10;
				while(i2 >=1) {
					System.out.println(i2);
					i2 --;
				}
				
				while(i2 >= 1) {
					System.out.println(i2);
					if(i2 == 5) {
						break;
					}
					i2--;
				}
				while(i2 >= 1) {
					if(i2 == 5) {
						i2--;
						continue;
					}
					System.out.println(i2);
					i2--;
				}

				int x = 10;
				int y = 5; 
			
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
			
			public static void additionA() {
			System.out.println(9+9);
			}
			
			
			public static void additionB(int x , int y) {
			System.out.println(x+y);
			}
		
			
			public static int additionC(int a , int b) {
			return a + b;
			}
			
			public static String Greet(String name) {
			return "welcome" + name ;
			}
	}







