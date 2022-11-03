package thread;

class Demo
{
	
}
class T1  extends Demo implements Runnable
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Th1 : "+i);
		}
	}
}

class T2 implements Runnable
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Th2 : "+i);
		}
	}
}


public class T001_ThreadDemo2 {
	public static void main(String[] args) {
		
		T1 t1 = new T1();
		T2 t2 = new T2();
		
		
		Thread th1 = new Thread(t1);
		Thread th2 = new Thread(t2);
		
		th1.start();
		th2.start();
		
		
		
		
	}
}
