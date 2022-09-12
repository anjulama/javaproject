package first_project_1;

public class arraypractice 
{

	public static void main (String[] args) 
{
		
		
	 int [] numbers =  {1,2,3,4}; 
   	 int sum_1 = 0;
   	  
   	 for (int i =0 ; i < numbers.length ; i ++) 
   	 {
   
   		 sum_1 = sum_1 + numbers[i];
   	 }
   	 
   	 System.out.println(sum_1);
   		 
	

	//or
	 for (int i:numbers) {
		 sum_1=sum_1+i;
	 }
	 System.out.println(sum_1);
	 
	 
	 
	 
	 int [] numbers1 = {10,20,30,40};
	 int sum = 0;
	 
	 for (int i = 0; i<numbers1.length;i++) {
		 sum = sum + numbers1[i];
	 }
	 System.out.println( sum/numbers1.length);
	 
	 
	 
	  String [] cities = { "ny", "tx", "al","nj"};
	 int a = cities.length; 
     System.out.println(a); 
	  System.out.println(cities[cities.length-1]);
	  System.out.println(cities[0]);
	  System.out.println(cities[3]);
	  System.out.println(cities[2]);
	  
	  for (String a2: cities){
		  System.out.println(a2);
	  }
	  
	  
	  int [] age = {22,33,44}; 
	   
	  for(int ag:age) { 
	   System.out.println(ag); 
	  } 
	   
	  String [] countries = {"India","Nepal","Bangladesh","Srilanka"}; 
	  for(String country:countries) { 
	   System.out.println(country); 
	  
	  } 
	  
	  
	  int [] array = {11,12,13,14};
	  System.out.println(array[3]);
	  System.out.println(array.length);
	  int a11 = array.length;
	  System.out.println(a11);
	  
	  
	  for (int i=0; i<array.length;i++) {
//		  System.out.println(i);
		  System.out.println(array[i]);
	  }
	   String [] colors = {"red","white", "pink"};
	   for (String c:colors) {
		   System.out.println(c);
	   }
	   //or
	   for (int i = 0; i<colors.length;i ++) {
		   System.out.println(colors[i]);
	   }
	   
	   
	   int [] numbers11 = {66,77,88,99};
	   int total = 0;
	   for (int a1:numbers11) {
		   total = total + a1;
	   }
	   System.out.println(total);
	     //or
	   for (int i=0; i<numbers11.length;i++) {
	    	 total=total+numbers11[i];
	     }
	   System.out.println(total);
	   
	   
	   System.out.println(total/numbers11.length);
}}
