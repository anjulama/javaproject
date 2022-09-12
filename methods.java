package first_project_1;

public class methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		calculator(3,6);
		add();
		addition(4,8);
		int a = additionA(3,3);
		 System.out.println(a);
		String c = greet("anju");
		System.out.println(c);
		boolean d= ismarried(true);
		System.out.println(d);
		
	}
		public static void calculator(int x, int y) {
		System.out.println(x+y);
		}
		
       public static void add() {
       System.out.println(2+2);
       }
       
       public static void addition(int a, int b) {
    	   System.out.println(a+b);
       }
       
       public static int additionA (int x, int y) {
    	  // System.out.println(x+y);
    	  return x+y;
       }
       
	  public static String greet(String d) {
		  return "hi"  + " " + d;
	  }
	  public static boolean ismarried(boolean d) {
		  return d;
	  }
	
}

