package oops;

abstract class Abs
{
	public abstract void disp();
	
	public void run()
	{
		System.out.println("running run method..");
	}
}

class AbsImpl extends Abs
{

	@Override
	public void disp() {
		
		System.out.println("running abs display");
	}
	
}

public class O010_abstractDemo {
	public static void main(String[] args) {
		
		//not possible
		//Abs abs = new Abs();
		
		AbsImpl abs = new AbsImpl();
		abs.disp();
		abs.run();
	}
}
