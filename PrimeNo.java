package javaPracticals;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check weather its Prime or Not : ");
		int a = sc.nextInt();
		for (int i = 2; i<a;i++)
		{
			if(a%i==0)
				count++;
				
		}
		if(count==0)
			System.out.println(a+ " is a Prime Number.");
		else
			System.out.println(a+ " is NOT a Prime Number.");
	}

}
