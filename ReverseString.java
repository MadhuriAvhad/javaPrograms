package javaPracticals;

public class ReverseString {

	public static void main(String[] args) {
		String str ="avhad";
		System.out.println(reverse(str));
	}
	public static String reverse(String str)
	{
		char ch[] = str.toCharArray();
		String revStr = "";
		
		for(int i = ch.length-1; i>=0; i--)
		{
			revStr+=ch[i];
		}
		return revStr;
	}
}

