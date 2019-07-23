package javaquestions;

public class maxinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {4,2,3,6,1};
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
	System.out.println("the max is "+max);
	}

}
