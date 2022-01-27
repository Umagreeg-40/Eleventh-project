package conditionalStatements;

import java.util.Scanner;

public class IfElseLadder 
{

	public static void main(String[] args) 
	{
		int marks;
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter your marks(Out of 100): ");
		marks= s.nextInt();
		
		if(marks<=100 && marks>=80)
		{
			System.out.println("Distinction");
		}
		else if(marks<80 && marks>=60)
		{
			System.out.println("First Class");
		}
		else if(marks<60 && marks>=50)
		{
			System.out.println("Second Class");
		}
		else if(marks<50 && marks>=40)
		{
			System.out.println("Third Class");
		}
		else if(marks==35)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		s.close();

	}

}
