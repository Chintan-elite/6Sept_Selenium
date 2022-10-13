package oops;

class A
{
	public void sample()
	{
		System.out.println("running class A Sample method");
	}
}

class B extends A
{
	public void sample()
	{
		System.out.println("running class B Sample method");
		super.sample();
	}
}

public class O009_MethodOverriding {
	public static void main(String[] args) {
		B b = new B();
		b.sample();
	}
}
