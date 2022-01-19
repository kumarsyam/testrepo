package programs;
import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("give a number");
		int n=sn.nextInt();
		if(n==0|n==1)
		{
			System.out.println("given number is neither a prime nor a composite");
		}
		else if(n%2==0&&n!=2)
		{
			System.out.println("given number is not a prime");
		}
		else if(sqrt(n)>2)
		{
			System.out.println("given number is not a prime");
		}
		else
		{
			System.out.println("given number is a prime");
		}

	}

}
