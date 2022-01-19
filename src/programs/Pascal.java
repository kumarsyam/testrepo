package programs;
import java.util.Scanner;
public class Pascal {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int n,i,j,k;
		System.out.println("give the number of rows");
		n= sn.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n+2;j++)
			{
				if(i==1&&j==3)
				{
					System.out.print(""+i+"");
				}
				else
				{
					System.out.println(" ");
				}
			}
		}
		
		

	}

}
