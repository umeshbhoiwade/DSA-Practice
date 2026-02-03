package DSA;
import java.util.Scanner;
public class inwords {

	static String digitvalue(char a) {
		switch(a) {
		case '0':
			return "Zero";
			
		case '1':
			return "One";
			
		case '2':
			return "Two";
			
		case '3':
			return "Three";
			
		case '4':
			return "Four";
			
		case '5':
			return "Five";
			
		case '6':
			return "Six";
			
		case '7':
			return "Seven";
			
		case '8':
			return "Eight";
			
		case '9':
			return "Nine";
		default:
			return "Invalid";
		}
		
		
	}
	
	 static String result(String str) {
		String ans=""; 
		for(int i=0;i<str.length();i++) {
			 ans=ans.concat(digitvalue(str.charAt(i)));
		}
		return ans;
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Numaric String");
		String str=sc.nextLine();
		System.out.println(result(str));
		
		

	}

}
