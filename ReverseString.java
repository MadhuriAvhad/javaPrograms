package javaPracticals;
import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("To check Palindrome");
		System.out.print("Enter a String : ");
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		String str = string.toLowerCase();
		System.out.println("String is Palindrome : " + palindrome(str));

	}
	public static boolean palindrome(String str)
	{
		char c[] = str.toCharArray();
		String revStr = "";
		for (int i=c.length-1; i>=0;i--)
		{
			revStr+=c[i];
		}
		if(str.equals(revStr))
		{
			return true;
		}
		else
		return false;
		
	}

}
