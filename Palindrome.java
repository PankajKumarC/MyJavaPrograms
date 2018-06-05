import java.util.Scanner;
public class Palindrome
{
	public static void main(String[] args)
	{
		int n, i, r = 0, s = 0, temp;
		Scanner x = new Scanner(System.in);
		n = x.nextInt();
		temp = n;


		while(n != 0)
		{
			r = n%10;
			s = (s * 10) + r;
			n /= 10;		
		}


		if(s == temp)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}
		
										
												