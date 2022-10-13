package oops;

public class O006_Encaptulation {
	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.setId(10);
		e.setName("tech");
		System.out.println(e.getId()+" "+e.getName());
		
	}
}
