package first_project_1;

public class Revisionhomework2 {
public static void main(String[] args) {
		
		Cats c = new Cats (2,"simran","golden");
		System.out.println(c.age);
		System.out.println(c.fullName);
		System.out.println(c.color);
		c.eat();
		c.walk(); 
}}
	class Cats {
		int age;
		String fullName;
		String color;

		public Cats(int ag , String fn, String C){
			this.age = ag;
			this.fullName = fn;
			this.color= C;		
		}
		public void eat () {
			System.out.println("I eat catnip");	
		}
		public void walk() {
			System.out.println("i do cat walking");
		
	}}

	      

