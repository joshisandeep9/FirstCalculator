package com;

import java.util.Scanner;

public class Calci 
{	
	public int a;
    public int b;
    static int choice;
	private static Scanner scan;
	public static void main(String[] args) 
	{
		do
		{	
			System.out.println("\n1. ADDITION " );
			System.out.println("2. SUBTRACTION ");
			System.out.println("3. MULTIPLICATION ");
			System.out.println("4. DIVISION ");
			System.out.println("5. EXIT ");
			System.out.print("\nEnter your Choice... ");
			scan = new Scanner(System.in);
			choice = scan.nextInt();
			
			switch (choice) {
			case 1: Add a = new Add();
					a.add();
		            break;
			
			case 2: Subtraction s = new Subtraction();
					s.sub();
					break;
				
			case 3: Multiplication m = new Multiplication();
					m.mul();
					break;
					
			case 4: Division d = new Division();
					d.Div();
					break;
					
			case 5: System.out.println("\nThank u for using Joshi Calculator...");
					System.exit(0);
			

			default: System.out.println("\n\nEnter a valid choice...");
					break;
			}
		}while(choice <=5);
	}
}