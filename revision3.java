package first_project_1;

public class revision3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  String firstName = "harry";
		  String  lastName = "styles";
		  String upperCasefirstName = firstName.toUpperCase(); // toUpperCase() 
		  String lowerCasefirstName = firstName.toLowerCase();   // toLowerCase()  
		  System.out.println(upperCasefirstName); 
		  System.out.println(lowerCasefirstName); 
		  System.out.println(firstName.length());                //length() 
		  
		  // or 
		   int a = lastName.length();                        //length()
		   System.out.println(a);
				   
		   System.out.println(firstName.concat(lastName));    //concat() join two string
		
	 
		  // compare two string in java 
		   
		  String first = "i am learning java"; 
		  String second = "I am learning javascript"; 
		  String third = "i am learning Python";
		 
		   
		  boolean matchA = first.equals(second);  
		  System.out.println(matchA); 
		  boolean matchB = first.equals(third); 
		  System.out.println(matchB); 
	
		  // Escape sequence in String  
		   
		  String fourth = "i a gonna put a double quotes \"here\"" ;
		  String fifth = "this is a backslash \\ random";
		  System.out.println(fourth); 
		  System.out.println(fifth); 
		  
		  
		   
		  // contains() 
		   
		  String five = "I am learning java and selenium"; 
		  boolean found = five.contains("java"); 
		  boolean found1 = five.contains("python");
		  System.out.println(found); 
		  System.out.println(found1); 

		  String colors = "red black white green blue"; 
		  String myfavcolor = "black"; 
		   
		  if(colors.contains(myfavcolor)){ 
		   System.out.println("yes"); 
		  } 
		  else { 
		   System.out.println("i want my fav color"); 
		  } 
		   
		 
		   
		  // program 6 
		   
		  // join() 
		   
		  String str1 = "red"; 
		  String str2 = "black"; 
		  String str3 = "blue"; 
		   
		  String str4 = String.join("-", str1,str2,str3); 
		  System.out.println(str4); 
		   
		  String str5 = String.join(" ", str1,str2,str3); 
		  System.out.println(str5); 
		   
		 
		  // replace  
		  String str7 = "I am learning javascript and only javascript";  
		  String str8 = str7.replace("j", "a"); 
		  System.out.println(str8); 
		   
		  // replaceAll 
		  System.out.println(str7.replaceAll("javascript", "java")); 
		  
		  // indexOf()
		   

		   
		  int q11 = firstName.indexOf("r"); 
		  System.out.println(q11); 
		   
		  int q12 = firstName.indexOf("-1"); 
		  System.out.println(q12); 
		   
		   
		  String fruits = "apple mango banana grapes chikoo papaya"; 
		  int q14 = fruits.indexOf("grapes"); 
		  System.out.println(q14); 
		   
		  // Program 7  
		   
		  // startsWith() 
		  // endsWith() 
		   
		  String q15 = "learning java is easy"; 
		  boolean q16 = q15.startsWith("l"); 
		  System.out.println(q16); 
		   
		  boolean q17 = q15.startsWith("learning"); 
		  System.out.println(q17); 
		   
		  boolean q18 = q15.endsWith("y"); 
		  System.out.println(q18); 
		   
		  boolean q19 = q15.endsWith("Easy"); 
		  System.out.println(q19); 
		   
		     
		  //isEmpty 
		   
		  String q20 =""; 
		  boolean q21 = q20.isEmpty(); 
		  System.out.println(q21); 
		  if(q21) { 
		   System.out.println("Email is mandatory"); 
		  } 
		   
		  // program9 
		   
		  // trim  
		   
		  String q23 = " Harry "; 
		  System.out.println(q23.length()); 
		  String q24 = q23.trim(); 
		  System.out.println(q24.length()); 
		   
	
	}

}
