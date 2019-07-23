package javaquestions;

public class removespcl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//This is about writing reg expression[^a-zA-Z0-9]
		
		String a="AAAAAaaaaaaaaBBBBBB32432423432423";
		a=a.replaceAll("[^a-zA-Z]", "");
		System.out.println("The new string is "+a);
	}

}
