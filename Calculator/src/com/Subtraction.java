package com;

import java.util.Scanner;

public class Subtraction 
{
	public int a;
	public int b;
	public int c;
	void sub()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter 1st No = ");
		a = scan.nextInt();
		
		System.out.println("Enter 2nd No = ");
		b = scan.nextInt();
		c = a-b;
		System.out.print("Subtraction of No = "+c);
	}
}
