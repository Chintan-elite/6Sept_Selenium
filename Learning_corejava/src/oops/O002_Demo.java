package oops;

class Student
{
	int studentId;
	String studentName;
	String studentEmail;
	
	
	Student()
	{
		System.out.println("constructor calling...");
	}
	
	
	
	Student(int studentId, String studentName, String studentEmail)
	{
		this.studentId =studentId;
		this.studentName =studentName;
		this.studentEmail=studentEmail;
	}
	
	Student(int studentId)
	{
		this.studentId = studentId;
	}
	
	
	public void display()
	{
		System.out.println(studentId+" "+studentName+" "+studentEmail);
	}
}



public class O002_Demo {
	public static void main(String[] args) {
		
//		Student st = new Student();
//		st.studentId=10;
//		st.studentName = "Tops";
//		st.studentEmail="tops@gmail.com";
//		st.display();
		
		Student st1 = new Student(10,"tops","tops@gmail.com");
		st1.display();
		
		Student st2 = new Student(20,"nidhi","nidhi@gmail.com");
		st2.display();
		
		Student st3 = new Student(30);
		st3.display();
		
	}
}
