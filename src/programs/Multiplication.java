package programs;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		int i;
		Scanner sn = new Scanner(System.in);
		System.out.println("enter a value");
		int n=sn.nextInt();
		for(i=1;i<=10;i++)
		{
		   System.out.println(""+n+"*"+i+"="+(n*i));
	    }
	}
}
