package com;

import java.util.Scanner;

public class Division 
{
	public int a;
	public int b;
	public int c;
	void Div()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter 1st No = ");
		a = scan.nextInt();
		do
		{
			System.out.println("Enter 2nd No = ");
		    b = scan.nextInt();
		    if(b==0)
				System.out.println("Divisible by 0 error");
		}while(b==0);	
		  
		  
		c = a/b;
		System.out.print("Division of No = "+c);
	}
}
