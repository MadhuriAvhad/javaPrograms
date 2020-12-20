package javaPracticals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckListOfOddNumber {

	public static void main(String[] args) {
		System.out.println("You have to write any 5 numbers : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		
		int countO = 0;
		int countE = 0;
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);
		list.add(e);
		
		for(int o : list)
		{
			if(o%2!=0)
			{
				countO++;
			}
			else
			{
				countE++;
			}
		}
		
		if(countO == 5)
		{
			System.out.println("List contains all Odd numbers.");
		}
		else if(countE == 5)
		{
			System.out.println("List contains all Even numbers.");
		}
		else
		{
			System.out.println("List contain both Even and Odd numbers.");
		}

	}

}
