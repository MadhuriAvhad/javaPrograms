package javaPracticals;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("How much number you want to be in Fibonacci series : ");
		int a = sc.nextInt();
		int f = 0;
		int s = 1;
		int t = 0;
		System.out.print(f+" "+s+" ");
		for(int i = 2; i<a; i++)
		{
			t=f+s;
			System.out.print(" "+t+" ");
			f=s;
			s=t;
			
		}
	}

}
