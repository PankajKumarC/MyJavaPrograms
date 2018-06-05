import java.util.Scanner;

public class Fib
{
	public static void main(String[] args)
	{


		int a,i,f = 0,s = 1,n;
		Scanner x = new Scanner(System.in);
		n=x.nextInt();


		for(i = 0;i<n;i++)
		{
			System.out.println(f);
			a=f+s;
			f=s;
			s=a;
		}
	}
}						