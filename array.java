package first_project_1;

public class array {

	public static void main(String[] args) {
		
		
		 // Program 1 
		   
		  String [] names = new String[3]; 
		  // Array stores the value by index 
		  names[0] = "chinmay"; 
		  names[1]= "poorva"; 
		  names[2] = "sarika"; 
		   
		  // Another way to initialize array  
		  //                    0          1          2 
		  String [] names2 = {"chinmay","poorva","sarika"};  
		   
		   
		  // Program 2 (Array of integers) 
		   
		   
		  int [] numbers = new int[3]; 
		  numbers[0] = 11; 
		  numbers[1] = 22; 
		  numbers[2] = 33; 
		   
		  int [] numbers2 = {11,22,33}; 
		   
 
		   
		   
		  // How to access the element from array  
		  //                    0         1         2          3         
		  String [] cities = {"pune","banglore","kolkalta","jaipur"}; 
		  System.out.println(cities[0]); 
		  System.out.println(cities[2]); 
		  
		  
		  
		  String [] countries = {"USA", "japan", "austria"};
		  System.out.println(countries[1]); 
		  int a = countries.length;
		  System.out.println(a);
		  System.out.println(countries[countries.length-1]);
		  System.out.println(countries[2]);
		  
		  
		  for (int i=0;i<countries.length;i++) {
			  System.out.println(i);
		  }
		  
		 for (int i=0;i<countries.length;i++) {
			  System.out.println(countries[i]);
	}
		 //or
		 for (String country:countries) {
			 System.out.println(country);
		 }
		   
		  // Total number of elements in array 
		   
		  int a = cities.length; 
		  System.out.println(a); 
		  System.out.println(cities[cities.length-1]); 
		   
//		   
//		  // program 4 (print every element of array) 
//		   
//		  //                    0        1         2       3 
//		  String [] fruits = {"apple","mango", "banana","chikoo"}; 
//		  //System.out.println(fruits[3]); 
//		   
//		  for(int i = 0 ; i < 3 ; i++) {   
//		   System.out.println(i);  
//		  } 
//		   
//		  for(int i = 0 ; i < fruits.length ; i++) { 
//		   System.out.println(fruits[i]); 
 
//		  } 
//		  //                 0  1  2  3  4 
//		  int [] numbers3 = {11,22,33,44,55}; 
//		   
//		  for(int i = 0 ; i < numbers3.length ; i++) { 
//		   //System.out.println(i); 
//		   System.out.println(numbers3[i]); 
//		  } 
//		   
//		  // print all the values of array in reverse  
//		    //                         0         1         2        3 
		  String [] vegetables = {"Tomato","Potato","Brinjal","Cabbage"}; 
		   
		  for(int i = vegetables.length-1 ; i >= 0; i--) {
		   System.out.println(i); 
		   //System.out.println(vegetables[i]); 
		  } 
//		   
		 
		  // Using for each loop 
		   
		  int [] age = {22,33,44}; 
		   
		  for(int ag:age) { 
		   System.out.println(ag); 
		  } 
		   
		  String [] countries1 = {"India","Nepal","Bangladesh","Srilanka"}; 
		  for(String country:countries1) { 
		   System.out.println(country); 
		  } 
		   
		
		   
		  int [] numbers4 = {11,22,33}; 
		  int sum = 0;  // 66 
		   
		  for(int i = 0 ; i <numbers4.length ; i++) { 
		   //System.out.println(numbers4[i]); 
		   sum = sum + numbers4[i]; 
		     
		  } 
		   
		  System.out.println(sum); 
		   
		   
		
		   
		  // Average of all elements of array 
		   
		  int [] ages2 = {22,24,26,28,30}; 
		  int total = 0; 
		 
		  for(int i = 0 ; i < ages2.length ; i++) { 
		   //System.out.println(i); 
		   total = total + ages2[i]; 
		    
		  } 
		  System.out.println(total/ages2.length); 
		  
 
			 int [] numbers_1 =  {1,2,3,4}; 
		   	 int sum_1 = 0;
		   	  
		   	 for (int i =0 ; i < numbers_1.length ; i ++) 
		   	 {
		   
		   		 sum_1 = sum_1 + numbers_1[i];
		   	 }
		   	 
		   	 System.out.println(sum_1);
		   	 
		   	 
		   	 
		   	 
		   
		        
		   
	
	}}


