package javaquestions;

public class stringswap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="sachin";
		String b="test";
		a=a+b;
		System.out.println("the added up string is "+a);
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		System.out.println("The 1st string  is "+a);
		System.out.println("the 2ndstring is "+b);
		
	}

}
