package com.LogicalCoding;
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number");
		int i=sc.nextInt();
		
		 boolean IsPrime = false;
	        for(int j = 2; j <= i/2; ++j)
	        {
	            
	            if(i % j == 0)
	            {
	                IsPrime = true;
	                break;
	            }
	        }
	        if (!IsPrime)
	            System.out.println(i + " is a prime number.");
	        else
	            System.out.println(i + " is not a prime number.");
	    }
	}
