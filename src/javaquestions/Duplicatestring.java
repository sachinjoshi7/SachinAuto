package javaquestions;

import java.util.HashSet;

public class Duplicatestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name[]= {"sachin","joshi","joshi"};
		HashSet<String> s1=new HashSet();
		int k=name.length;
		for(int i=0;i<k;i++)
		{
			String temp=name[i];
			if(s1.add(temp)==false)
			{
				System.out.println("the duplicate element is "+temp);
			}
		}
		
	}

}
