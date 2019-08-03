package com.Logical.CollectionOfPrograms;
import java.util.Scanner;

public class Palindrome
{
	

	public static void main(String[] args) 
	{
		int rev=0; 
		System.out.println("Enter any Number");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int temp=i;
		while(i!=0)
		{
			rev=rev*10+i%10;
			i=i/10;
		}
		System.out.println(rev);
		
		if(rev==temp)
		{
			System.out.println("Number is Palindrom");
		}
		else
		{
			System.out.println("Number is not Palindrom");
		}
			
	}
}
