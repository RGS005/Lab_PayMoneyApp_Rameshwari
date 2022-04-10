package com.greatlearning.paymoney.transactions;

import java.util.Scanner;

public class Transactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,sizeofInputArray, transactions[], targetValue, sumOfValues=0;
		boolean flag=false;
		Scanner sc= new Scanner(System.in);
		
		//Get the size of the sizeofInputArray	
		System.out.println("Enter the Size of the Transaction Array: ");
		sizeofInputArray=sc.nextInt();
		transactions =new int[sizeofInputArray];
		
		//Get the items in the sizeofInputArray
		System.out.println("Enter transaction values : ");
				for (i=0; i<sizeofInputArray ; i++)
		{
			transactions[i]=sc.nextInt();
		}
		
		//Get the size of the sizeofInputArray
		System.out.println("Enter target values : ");
		targetValue=sc.nextInt();
		
		for (i=0; i<sizeofInputArray;i++)
		{
			sumOfValues+=transactions[i];
			if (sumOfValues>=targetValue) {
				flag=true;
				break;
			}
		}
		//Verifying the target it achieved with boolean value
		if(flag)
			System.out.println("Target was achieved after "+(i+1)+ " transactions");
		else
			System.out.println("Target was not achieved");
	}

}
