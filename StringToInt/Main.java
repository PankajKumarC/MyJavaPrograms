import java.util.*;
public class Main {

	public static void main(String[] args) {
			
		int i, temp, n = 0;
		String str = new String();
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		sc.close();
		str.toCharArray();

		for(i=0; i<str.length(); i++) {
				
			temp =str.charAt(i) - 48;
			n += temp;
			n *= 10;
		}

		System.out.println(n/10);
	}

}
