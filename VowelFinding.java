package javaPracticals;

import java.util.Scanner;

public class VowelFinding {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write something which comes in your mind :");
		String str = sc.nextLine();
		char ch[] = str.toCharArray();
		int count = 0;
		
		for (int i = 0 ; i<str.length();i++)
		{
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u' || 
					ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U')
			{
				System.out.println(ch[i]);
				count++;
			}
		}
		System.out.println("Number of vowels in your sentence is : "+count);

	}

}
