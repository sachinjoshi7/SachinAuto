package javaquestions;

public class minarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {3,1,2,4,7,0};
		int min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
	System.out.println("the min is "+min);
	}

}
