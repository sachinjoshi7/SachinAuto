package javaquestions;

import java.util.HashSet;

public class Duplcateint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dup[]= {1,2,3,4,1};  
		int l=dup.length;
		System.out.println("the lenght of the araay is "+l);
		HashSet<Integer> s1=new HashSet();
		
		for(int i=0;i<l;i++)
		{
			
			int temp=dup[i];
			
			if(s1.add(temp)==false)
			{
				System.out.println("the duplicate number is "+temp);
			}
		}
		
		
	}

}
