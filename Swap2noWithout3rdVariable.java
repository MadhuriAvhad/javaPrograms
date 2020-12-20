package javaPracticals;

import java.util.Scanner;

public class Swap2noWithout3rdVariable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Before Swapping----->");
		System.out.println("Enter value for a : ");
		int a =sc.nextInt();
		System.out.println("Enter value for b : ");
		int b =sc.nextInt();
		a+=b;
		b=a-b;
		a-=b;
		System.out.println("After Swapping------>");
		System.out.println("Enter value for a : " + a);
		System.out.println("Enter value for b : " + b);
	}

}
