
public class Methodoverloading {


	public static void main(String[] args) {
		Polymorphism polymorphism=new Polymorphism();
		
		System.out.println(polymorphism.add(10,20));
		
		System.out.println(polymorphism.add(3.5,3.5));
		
		System.out.println(polymorphism.multiply(5, 10));
		
		System.out.println(polymorphism.multiply(3.5,2.0));
		
		System.out.println(polymorphism.add(5,2.1,2));
		
      System.out.println(polymorphism.add("Brinda","Siva"));
	}

}
