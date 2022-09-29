package array;

public class A001_ArrayDemo {
	public static void main(String[] args) {

		// int a = 10;

		int b[] = new int[7];
		b[0] = 10;
		b[1] = 20;
		b[2] = 30;

		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

		System.out.println("***************");

		int[] k = { 10, 20, 30, 40, 50, 60 };

//		for(int i=0;i<k.length;i++)
//		{
//			System.out.println(k[i]);
//		}

		for (int vishava : k) {
			System.out.println(vishava);
		}

		System.out.println("***************");

		String sub[] = { "java", "php", "pythone" };

//		for (int i = 0; i < sub.length; i++) {
//			System.out.println(sub[i]);
//		}

		for (String s : sub) {
			System.out.println(s);
		}

	}
}
