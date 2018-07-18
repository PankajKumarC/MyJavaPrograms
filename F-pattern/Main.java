import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int h, l1, l2, i, j;
		Scanner x = new Scanner(System.in);
		System.out.println("Enter height : ");
		h = x.nextInt();
		System.out.println("Enter length : ");
		l1 = x.nextInt();
		l2 = l1/2;
		
		for(i=0; i<h-1; i++) {
			if(i == 0) {
				for(j=0; j<l1; j++) {
					System.out.print("# ");
				}
			}
			System.out.println("");
		
			if(i == (h/2)-1) {
				for(j=0; j<l2; j++) {
				System.out.print("# ");
				}
			}
			
			else {
				System.out.print("#");
			}
		}
		x.close();
	}

}
