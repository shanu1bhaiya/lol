package oopsPrj;

import java.util.Scanner;

public class Account 
{
	int acc_nmbr;
	String name;
	double amt_in_bnk;
	double amt_wthdrn;
	double amt_left;
	
	Account()
	{
		acc_nmbr = 0;
		name = null;
		amt_in_bnk = 0;
		amt_wthdrn = 0;
		amt_left = 0;
	}
	Account(int acc_nmbr, String name, double amt_in_bnk, double amt_wthdrn, double amt_left)
	{
		this.acc_nmbr = acc_nmbr;
		this.name = name;
		this.amt_in_bnk = amt_in_bnk;
		this.amt_wthdrn = amt_wthdrn;
	}
	Account(Account A)
	{
		acc_nmbr = A.acc_nmbr;
		name = A.name;
		amt_in_bnk = A.amt_in_bnk;
		amt_wthdrn = A.amt_wthdrn;
		amt_left = A.amt_left;
	}
	void readAcc()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter bank account number: ");
		acc_nmbr = sc.nextInt();
		System.out.println("enter the person's name: ");
		name = sc.next();
		sc.nextLine();
		System.out.println("enter the amount in the bank: ");
		amt_in_bnk = sc.nextDouble();
		System.out.println("enter the amount withdrawn");
		amt_wthdrn = sc.nextDouble();
		System.out.println();
		
//		if(amt_in_bnk > amt_wthdrn)
//		{
//			amt_left = amt_in_bnk - amt_wthdrn;
//		}
//		else
//		{
//			System.out.println("please enter a valid amount" + "\n" + "the entered amount is greater than the amount withdrawn");
//		}
	}
	void showAcc()
	{
		System.out.println("bank account number is " + acc_nmbr);
		System.out.println("name of the person holding bank account is " + name);
		System.out.println("amount in bank is " + amt_in_bnk);
		System.out.println("amount withdrawn from the bank is " + amt_wthdrn);
		if(amt_in_bnk > amt_wthdrn)
		{
			amt_left = amt_in_bnk - amt_wthdrn;
			System.out.println("amount left is " + amt_left);
		}
		else
		{
			System.out.println("please enter a valid amount" + "\n" + "the entered amount is greater than the amount withdrawn");
		}
		System.out.println();
	}
}
