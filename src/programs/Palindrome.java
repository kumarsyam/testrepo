package programs;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int temp,r,n,sum=0;
		System.out.println("give a number");
		n=sn.nextInt();
		temp=n;
		while(n<0)
		{
		r=n%10;
		sum=(sum*10)+r;
        System.out.println(""+sum+"");
        n=n/10;
	}

}
}
