package javaquestions;

import java.util.HashMap;

public class HashmapisSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("My out"+getcredentails());
		
	}

//This method is for storing the credentails
public static HashMap<String,String> getcredentails()
{
	HashMap<String,String> cred=new HashMap<String,String>();
	cred.put("Customeruser","Sachin:sachin123");
	cred.put("Adminuser","Ashwat:Ass123");
	cred.put("Vendoruser", "Vendoe:vendor123");
	return cred;
}
}
