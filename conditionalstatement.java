package first_project_1;

public class conditionalstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		if(a >= 10) {
			System.out.println("A is 10");
		}
		
		int a1 = -10;
		if (a1>0) {
			System.out.println("it is a positibe number");
		}
		else {
			System.out.println("it is a negative number");
		}
		
		
        int numberOfTicket = 11;
		
		if(numberOfTicket > 0 && numberOfTicket <= 5) {
			System.out.println("5 % discount");
		}
		
		if(numberOfTicket > 5 && numberOfTicket <= 10) {
			System.out.println("10 % discount");
		}
		
		if(numberOfTicket > 10) {
			System.out.println("30 % discount");
		}
		
		
       int  numberOfTicket1 = -10;
		
		if(numberOfTicket1 > 0 && numberOfTicket1 <= 5) {
			System.out.println("5 % discount");
		}
		else if(numberOfTicket1 > 5 && numberOfTicket1 <= 10) {
			System.out.println("10 % discount");
		}
		else if(numberOfTicket1 > 10) {
			System.out.println("30 % disocunt");
		}
		else {
			System.out.println("Incorrect input");
		}
		
		String password = "abc";
		if (password!="abc") {
			System.out.println("incorrect password");
			}
		else {
			System.out.println("log in");
		}
	}

}
