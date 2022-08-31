package first_project_1;

public class loops {

			  public static void main(String[] args) { 
			  // TODO Auto-generated method stub 
//			  // for loop  
//			   		  
//			  //print 1-6
//			  
		  for (int i =1;i<6;i++) {
				  System.out.println(i);
			 // System.out.println("Anju");
			  }
			   
			   			  // print 1 - 10 
			  for(int i = 1 ; i < 11 ; i++) { 
           System.out.println(i); 
			  } 
		  //OR
		  for (int i=1;i<=10;i++) {
			  System.out.println(i);
			  }			   
		  // print 10 -1 		   
			  
		  for (int i = 10; i>=1; i--) {
			  System.out.println(i);			  }
			   
			  // print table of 2
		  for (int i = 2; i <=20; i = i + 2) {
				  System.out.println(i);
			  }
			   
			  for (int i = 20; i>=2;i = i-2) {
				  System.out.println(i);
			  }			  		   
			  // break statement with for loop 		   
		    
		  for (int i = 0; i<5; i ++) {
				  if (i == 2){			break;
			  }
				  System.out.println(i);
		  }
			
			  for(int i = 0 ; i < 5 ; i++) {  //1 // 2 
			   System.out.println(i); // 0 ,1 ,2 
			   if(i == 2) { 
			    break; 
			   } 
 }  
			  // continue  			   
			  for(int i = 0 ; i < 5 ; i++) { //1 //2 //3 // 4 //5 
			    if(i == 2) { 
			     continue; 
			   } 
			    System.out.println(i); // 0 ,1 ,3 ,4 
			  }  
			   
//			   while loop 	   		
		  
	   int t7 = 1;
	   while(t7<10) {
		System.out.println(t7);
			t7++;
		  }
			 int t8  =0;
			 while (t8<5) {
				 if (t8==3) {
					 t8++;
					 continue;
				 } 
				 System.out.println(t8);
				 t8++;
			 }
			 int t9 = 10;
					 while (t9>=1) {
						 System.out.println( t9);
						 t9--;
					 }
					 int t10 = 1;
					 while (t10<=10) {
						 System.out.println( t10);
						 t10++;
					 }
					 
					 
					 for (int i = 0;i<=10;i++) {
						 System.out.println(i);
					 }
					 
					 for (int i = 10; i>=1; i--) {
					 System.out.println(i);
					 }
					  
					 
					 for (int  i = 3; i<=30; i = i+3) {
						 System.out.println(i);
					 }
					  for (int i = 30; i>=1; i=i-3) {
						  System.out.println(i);
					  }
					 
					 for (int i = 1;i <=10;i ++) {
						 if(i == 3) {
							 break;
						 }
						 System.out.println(i);
					 }
					  for (int i = 0; i <=10; i ++) {
						  System.out.println(i);
						  if (i==5) {
							  break;
						  }
						  
					  }
					  for (int i = 10; i>=1; i--) {
						  if(i == 6) {
							  continue;
						  }
						  System.out.println(i);
					  }
					  
					  
					  int b = 1;
							  while (b<=10) {
								  System.out.println(b);
								  b++;
							  }
					  int b1 = 10;
							  while (b1>=1) {
								  System.out.println(b1);
								  b1--;
							  }
							  
				
					int b2=2;
					while(b2<=20) {
						System.out.println(b2);
						b2= b2+2;
					}
					
					int b3 = 0;
					while (b3<=10){
						System.out.println(b3);
						b3++;
						if(b3 == 3) {
							break;
							}
						
					}
					int b4= 0;
					while (b4<=10) {
						if (b4==3){
						b4++;
							continue;
						}
						System.out.println(b4);
						b4++;
					}
					
					  
							  
		
							 
 } }


