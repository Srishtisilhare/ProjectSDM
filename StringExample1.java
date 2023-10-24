package day2;
import java.lang.String;
//String predefined class inside lang package
//string is alphanumeric 
//String are immutable 
//java has auto garbage collection 
//System.gc() --> calling garbage collector 
//when literal are assigned to strings then they 
//are stored in string common pool area under heap memory  
public class StringExample1 {

	public static void main(String[] args) {
		
		//two ways to initilaize strings in java 
		
//		String e="welcome";
//		String e1= new String ("welcome");
//		
		
		
		String p="India";//literals
		String p1="India";
		
	
		if(p==p1)//if(p.equals(p1))
			System.out.println("strings are equal");
		else
			System.out.println("strings are not equal");
		
		System.gc();
		

	}

}
