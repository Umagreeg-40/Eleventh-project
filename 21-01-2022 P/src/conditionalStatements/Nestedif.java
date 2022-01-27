package conditionalStatements;

import java.util.Scanner;

public class Nestedif
{

	public static void main(String[] args) 
	{
		int num;
		
		Scanner s= new Scanner(System.in);
		System.out.println(("Enter any number(except zero): "));
		num = s.nextInt();
		
		if(num>0)
		{
			if(num%2 == 0)
			{
				System.out.println("The given number is an odd");
			}
			else
			{
				System.out.println("The given number is an odd");
			}
		}
		else
		{
			System.out.println("The given number is negative");
		}
		
		s.close();

	}

}
