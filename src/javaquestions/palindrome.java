package javaquestions;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a ="sachin";
char [] t=a.toCharArray();
int k=t.length;
System.out.println("the length is "+k);
String rev="";
for(int i=k-1;i>=0;i--)
{
	rev=rev+t[i];
}
	System.out.println("the reverse is "+rev);
	if(a.equals(rev))
	{
		System.out.println("its a palindrome");
	}
	else
	{
		System.out.println("Not a palindrome");
	}
	}

}
