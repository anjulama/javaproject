package first_project_1;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stubswitch(expression) {
		
		
		
		
		// not using break statement
		
		String city = "Udaipur";
		
		switch(city) {
		
		case "Pune":
			System.out.println("Maharashtra");
		
		case "Bhopal":
			System.out.println("Madhya Pradesh");
			
		case "Banglore":
			System.out.println("Karnataka");

		case "Jaipur":
			System.out.println("Rajasthan");
		default:
			System.out.println("Incorrect city");
			
		
		}
		// Program 2 (switch with break)

				int weight = 70;
				
				switch(weight) {
				case 50:
					System.out.println("light weight");
					break;
				case 70:
					System.out.println("normal weight");
					break;
				
				case 80:
					System.out.println("heavy weight");
					break;
				default:
					System.out.println("no case match");
				
				}
				
				// Program 3 
				
				
				String citi = "bhopal";
				
				switch(citi) {
				
				case "pune":
				case "nagpur":
					System.out.println("Maharastra");
					System.out.println("Centre state");
					break;
				
				case "bhopal":
				case "indore":
					System.out.println("Madhya Pradesh");
					break;
				case "jaipur":
				case "udaipur":
					System.out.println("Rajasthan");
					break;
					
				default:
					System.out.println("city does not match");
					
				
				}
				
				
				int grade = 50;
				 switch (grade){ 
				 case 90:
				 System.out.println("gradeA ");
				 break;
				 
				 case 80:
				 System.out.println("gradeB" );
				 break;
				 
				 case 70:
				 System.out.println("gradeC");
				 break;
				 
				 default:
				 System.out.println("Fail");
				 
				
				 
				 }
	

}}
