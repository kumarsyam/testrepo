package programs;

import java.util.Scanner;
public class SumOfNaturals {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int sum=0,i;
		System.out.println("give a number");
		int n=sn.nextInt();
		for(i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println(""+sum+"");

	}

}
