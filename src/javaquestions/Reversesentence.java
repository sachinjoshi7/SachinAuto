package javaquestions;

public class Reversesentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String rev1="";
String rev2="";
		String a="hello_sachin_java";
		//take it into a array
		String s1[]=a.split("_");
	int k=s1.length;
		System.out.println("lenth of first array is"+k);
	for(int i=0;i<k;i++)
	{
		String temp=s1[i];
	int y=	temp.length();
	for(int j=y-1;j>=0;j--)
	{
		rev1=rev1+temp.charAt(j);
	}
	rev2=rev2+rev1;
	}
	System.out.println("the reverse is "+rev2);	
	}

}
