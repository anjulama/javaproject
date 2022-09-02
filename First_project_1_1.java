package first_project_1;

public class First_project_1_1 {
	static void myMethod() {
		String city = "dallas";
        String state = "texas"; 
        String city1 = city.toUpperCase();
        String state1 = state.toLowerCase();
       String concate = city1.concat(state1);
        
        
       System.out.println(city1);
       System.out.println(state1);
       System.out.println(concate);
     
       
       
       String country = "nepal";
     
       System.out.println(country.toUpperCase());
       System.out.println(country.length());
       
      
       
      		
       
      		  
      		  
      		  
      		  

		  
//		  String vegetable = "tomato"; 
//		  System.out.println(vegetable); 
//		   
//		  String q66 = vegetable.toUpperCase(); 
//		  System.out.println(q66); 
//		   
//		  int q77 =  q66.length(); 
//		  System.out.println(q77); 
//		   
//		  int q88 = vegetable.toUpperCase().toLowerCase().length(); 
//		     //"TOMATO".toLowerCase().length() 
//		     // "tomato".length() 
//		     // 6 
//		  System.out.println(q88); 
//		  
//		  
//		  
//		  
//		  
//		  
//		  int a = 10; 
//		  int b = 5; 
//		  String c = "hello"; 
//		   
//		  System.out.println(a+b+c); 
//		  
//		  
//		 String aa = "10"; 
//		  String bb = "5"; 
//		  String cc = "hello"; 
//		   
//		  System.out.println(aa+bb+cc); 
//		  
//		  
//		  
//
//		  String first = "hello"; 
//		  String second = "hellos"; 
//		  boolean result = first.equals(second); 
//		  System.out.println(result); 
//		  
       
       String a = "1+1 is equal to 2";
       String b = "1+1 is equal to 3";
       boolean result = a.equals(b);
       System.out.println(result);
      		 
//		  
//		  
//		// contains  
//		   
//		  String jkl = "I am new to java learning"; 
//		  boolean result1 = jkl.contains("a"); 
//		  System.out.println(result1);
       
       String a1 = "i am anju";
       boolean result1 = a1.contains("anju");
       System.out.println(result1);
//		  
//		  
//
//		  // substring() city3.substring(startIndex , End index(not included)) 
//		  
		  String city3 = "chandrapur";             
//		   
//		  // 1 2 3 4 5 6 7 8 9 10
//		  // c h a n d r a p u r 
//		   
		  String result3 = city3.substring(2); 
	  System.out.println(result3); 
 		   
		  String result4 = city3.substring(2,7); 
		  System.out.println(result4); 
		   
		  String result5 = city3.substring(6,10); 
		  System.out.println(result5); 
//		  
		  
		  
		  String name = "Alexzander";
		   String result6 = name.substring(9);
		   System.out.println(result6);
		  
		   
		   // join() 
		   
		   String str1 = "I am"; 
		   String str2 = "learning"; 
		   String str3 = "javascript"; 
		    
		   String result7 = String.join(" ", str1,str2,str3); 
		   System.out.println(result7); 
		    
		    
		   String str = "amol"; 
		   String email = String.join("@", str,"gmail.com");  
		   System.out.println(email); 
		   
		   
		   // replace() - can work with character also 
		   
		   //"chinmay" , "i" "chinmay.replace('i','e') 
		   //"chinmay is new city , chinmay cooks his own food".replaceAll("chinmay","amol") 
		    
		    
		   String str5  = "I am learning javascript!"; 
		   String str6 = str5.replace("javascript", "java"); 
		   System.out.println(str6); 
		    
		    
		   String str7  = "I am learning javascript! and javascript is fun"; 
		   String str8 = str7.replace("i", "m"); 
		   System.out.println(str8); 
		   
		   
		  String str9 = "i just moved to newyork";
		  String str10 = str9.replace("newyork","dallas");
		  String str11 = str9.replace("o","8");
		  System.out.println(str10);
		  System.out.println(str11);
		  
		  String str12 = "she saw sea shells by the seashore";
		  String str13 = str12.replaceAll("sea", "river");
		  System.out.println(str13);
		  
		  String str14 = "I am new to javascript. javascript is fun";
		  String str15 = str14.replaceFirst("javascript","java");
		  System.out.println(str15);
		
		  // charAt() 
		   
		  String str16 = "punep"; 
		  // 0 1 2 3 4 
		  // p u n e p 
		  char result11 = str16.charAt(2); 
		  System.out.println(result11); 
		  
		  String str17 = "fantastic";
		  char result12 = str17.charAt(3);
		  System.out.println(result12);
		  
		  
		  //indexOf() 
		   
		  int result13 = str16.indexOf("p"); 
		  System.out.println(result13); 
		  
		  // trim() 
		   
		  String str18 = " pune "; 
		  System.out.println(str18.length()); 
		  String str19 = str18.trim(); 
		  System.out.println(str19.length()); 
		  
		  
		  
		// split() 
		   
		  String str20 = "chinmay-deshpande-7709192441"; 
		  String [] result10 = str20.split("-"); 
		  // chinmay-deshpande-7709192441 on "-" // ["chinmay","deshpande","7709192441"] 
		  System.out.println(result10[0]); 
		  System.out.println(result10[1]); 
		  System.out.println(result10[2]); 
		  
		  
		  String [] result18 = "chinmay-deshpande-7709192441".split("c"); 
		  // ["chinmay-deshpande-770919" ,"441"] 
		   
		  //System.out.println(result18[0]); 
		  //System.out.println(result18[1]); 
		 // System.out.println(result18[2]); 
		  
		  String str25 = "kathmandu";
		  String rev = "";
		   
		//  for (int i2=0; i2<str25.length(); i2++)
		  //{ 
			//  System.out.println(str25.charAt(i2));
		 // }
		  for (int i5= str25.length()-1;i5>=0; i5--)
		  { 
			  rev = str25.charAt(i5)+rev; 
		  }
		  System.out.println(rev);

		  
		  
		  
		//  for (int i4=10;i4>=1;i4--)
		//  {
		//	  System.out.println(i4);
		//  }
		  
		  
		  
		  String str111 = "newyork";
		  
		  for (int i6=0; i6<str111.length();i6++)
		  {
			  
		    System.out.println(str111.charAt(i6));
		  }
		  
		
		  
		  
		
		  for (int i4=10;i4>=1;i4--)
	   {
	   System.out.println(i4);
			 }
		
		  
		  for (int i5=1; i5<=10;i5++)
		{ System.out.println(i5);
		}
		
		 
		
		String str23 = "pune"; 
		  String rev3 = ""; 
		  // 0 1 2 3 
		  // p u n e  
		 for(int i = str23.length()-1 ; i >=0 ; i--)
		  { 
	  
		   rev3 = rev3 + str23.charAt(i);
		   }
		  System.out.println(rev3);
		  
		  
		  String str112 = "texas";
		  String rev2 = "";
		  for (int i8 =str112.length()-1; i8>=0; i8--)
		  { 
			  rev2 = str112.charAt(i8)+rev2;  
		  }
		  System.out.println(rev2);


		  String str113 = "fire";
		  String rev5 = "";
		  for(int i9=0;i9<str113.length();i9++)
        {
      	  rev5 =rev5+str113.charAt(i9);
        }
		  System.out.println(rev5);
		  
		  
		  
		  String str24 = "hello"; 
		  int counter = 0; 
		  //  0 1 2 3 4 
		  //  h e l l o 
		   
		  for(int i = 0 ; i < str24.length();i++) { 
		   char a9 = str24.charAt(i); 
		   if(a9 == 'l') { 
		    counter = counter + 1; 
		   } 
		      
		  } 
		   
		  System.out.println(counter); 
		  
		  
		  String str31 = "mississippi";
		  int cntr =0;
		  
		 for (int i19 =0;i19<str31.length();i19++) {
			 char a11 = str31.charAt(i19);
			 if(a11=='s') {
				 cntr = cntr+1; 
				 
			 }
		 }
		 System.out.println(cntr);
		 
		 String str32 = "aallama";
		 int cntr1 = 0;
		 for (int i40=0;i40<str32.length();i40++) 
		 {
			 char b1 = str32.charAt(i40);
			 if (b1=='a') {
				 cntr1=cntr1+1;
			 }
		 }
		 System.out.println(cntr1);
			 
		 
		//program 1 Print every char 
	  
	     String str41 = "apple"; 
	 for(int i = 0 ; i < str41.length();i++) { 
	//System.out.println(i); 
	 System.out.println(str41.charAt(i)); 
	 }
	    String str42 = "anju";
	    for (int i42=0;i42<str42.length();i42++)
{
	System.out.println(str42.charAt(i42));
}
    String str43 ="anju";
    String rev43 = "";
    for (int i43=0;i43<str43.length();i43++)
    {
  	  rev43 = str43.charAt(i43)+rev43 ;
    }
  	  System.out.println(rev43);
  	  
  	  
  	 String str44 = "I am learning javascript"; 
  	 int counter44 = 0; 
  	for(int i44 = 0 ; i44 < str44.length(); i44++) { 
  	 if(str44.charAt(i44) =='a'|| str44.charAt(i44) =='e' ||str44.charAt(i44) =='i' || str44.charAt(i44) =='o' || str44.charAt(i44) =='u') { 
	    counter44 = counter44 + 1; 
     }     
   } 
    System.out.println(counter44); 
    
    
    String str45 = "i love to learn new things";
    int cntr45= 0;
    for (int i45=0; i45<str45.length(); i45++)
    {
  	  if(str45.charAt(i45) == 'i' ||str45.charAt(i45) == 'l' || str45.charAt(i45) == 'o' )
  	  {
  		  cntr45 = cntr45+1;
  		  
  	  }
  		  
    }
    System.out.println(cntr45);
    
    
    
   
    
    // print every element of array 
     
    //                 0  1  2 3  4 
    int [] array  =  {11,22,33,44,55}; 
    System.out.println(array[0]); 
    System.out.println(array.length); 
     
    for(int i = 0 ; i < array.length ;i++) { 
  //   System.out.println(i); 
    System.out.println(array[i]); 
    } 
     
//    // program 
//     
    String [] names = {"chinmay","ram","sarika"};
    int [] array1 = {1,2,3};
    for(String element:names) { 
     System.out.println(element);  
   } 
     
    for(int element:array1) { 
     System.out.println(element); 
    } 
     
    for(int i = 0 ; i < names.length ; i++) { 
     System.out.println(names[i]); 
    }

    
    String [] colors = {"red","blue","pink"};
    for (String element:colors) {
  	  System.out.println(element);	 
	  }
	}

		static void myMethod2() {
		  	  System.out.println("element");	 
		}
			
	public static void main(String[] args) {
				myMethod();
		
      } 
	}
    	  
    	  
    	 
    	  
    	  
    	