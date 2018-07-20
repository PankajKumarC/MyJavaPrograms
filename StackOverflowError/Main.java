class Demo {
	
	public void function1() {
		Demo d = new Demo();
		d.function2();
	}
	
	public void function2() {
		Demo d = new Demo();
		try {
			d.function1();
		}catch(StackOverflowError s) {System.out.println("StackOverflowError");}
	}
}


public class Main {
	
	public static void main(String[] args) {
		
		Demo d = new Demo();
		d.function1();
	}
}
