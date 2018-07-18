public class Main {

	public static void main(String[] args) {
			String str  = new String();
			String temp  = new String();
			str = "Welcome to my country";
			String str1[] = str.split("\\s");
			
			for(int i=0; i<str1.length; i++) {
				str1[i].toCharArray();
				
				for(int j=str1[i].length()-1; j>=0; j--) {
					temp += str1[i].charAt(j);
				}
				
				temp += " ";
			}
			
			System.out.println(temp);
			
	}

}
