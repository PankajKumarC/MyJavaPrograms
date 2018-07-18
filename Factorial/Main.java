import java.util.Scanner;

public class Main {
		public static void main(String[] args) {

			int n,i,f = 1;
			Scanner s = new Scanner(System.in);
			n=s.nextInt();
      
			for(i = 1;i <= n;i++) {
				f*=i;
			}
      
			System.out.println(f);			
		}
}
