package first_project_1;

public class strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "harry";
		int a = name.length();
		System.out.println(a);

		String fname = "anju";
		String lname = "lama";
		String a1 = fname.concat(lname);
		System.out.println(a1);
		

		String vegetable = "tomato";
		System.out.println(vegetable);
		
		String q66 = vegetable.toUpperCase();
		System.out.println(q66);
		
		int q77 =  q66.length();
		System.out.println(q77);
		
		int q88 = vegetable.toUpperCase().toLowerCase().length();
		
		System.out.println(q88);
		
		
		
		String a11 = "colors";
		String a22 = "colours";
		boolean b = a11.equals(a22);
			System.out.println(b);
		
			
		String a33 = "i love to rollerskate";
		boolean a44 = a33.contains("skate");
		System.out.println(a44);
		
		
		String city = "kathmandu";
		String city1 = city.substring(4);
		System.out.println(city1);
		
		String city2 = city.substring(2,5);
		System.out.println(city2);
		
		
		String b1 = "i";
		String b2 = "Love";
		String b3 = "you";
		String joinedstring = String .join(" ",b1,b2,b3);
		System.out.println(joinedstring);
		
		String a55 = "I am learning javascript! and javascript is fun";
		String a66 = a55.replace("learning", "working");
		System.out.println(a66);
		
		String a77 = a55.replaceAll("a","b");
		System.out.println(a77);
		
		String a88 = a55.replaceFirst("java", "python");
		System.out.println(a88);
		
		
		String country = "nepal";
		char a99 = country.charAt(3);
		System.out.println(a99);
		
		int b4= country.indexOf(2);
		System.out.println(b4);
		
		
	}

}
