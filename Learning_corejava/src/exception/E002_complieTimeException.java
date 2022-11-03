package exception;

class Sample
{
	public void display() 
	{
			try {
				Class.forName("basic.Demo");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}

public class E002_complieTimeException {
	public static void main(String[] args) throws ClassNotFoundException {
		
		
			Class.forName("basic.Demo");
	}
}
