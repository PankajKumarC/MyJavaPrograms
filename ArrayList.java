    import java.util.*;
	
	class Customer {
	    
		public String firstName;
	    public String lastName;
	    public String email;
	    public String address;
	    public String mobileNumber;
	    
	    public Customer(String firstName, String lastName, String email, String address, String mobileNumber) {
	    	this.firstName = firstName;
	    	this.lastName = lastName;
	    	this.email = email;
	    	this.address = address;
	    	this.mobileNumber = mobileNumber;
	    }
	    
	    public String getfirstName() {
	    	return this.firstName;
	    }
	    public String getlastName() {
	    	return this.lastName;
	    }
	    public String getemail() {
	    	return this.email;
	    }
	    public String getaddress() {
	    	return this.address;
	    }
	    public String getmobileNumber() {
	    	return this.mobileNumber;
	    }
	}	    
	public class Main {
		public static void main(String[] args) {
			
			int n;
			System.out.println("Enter the number of customers");
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
            if(n == -1) 
                System.out.println("Invalid Input");
            else {
    			ArrayList<Customer> ar = new ArrayList<Customer>(n);
    			
    			for(int i=1; i<=n; i++) {
    				System.out.println("Enter the customer "+i+" details");
    				System.out.println("Enter the firstname");
    				String fName = sc.next();
    				System.out.println("Enter the lastname");
    				String lName = sc.next();
    				System.out.println("Enter the email");
    				String email = sc.next();
    				System.out.println("Enter the address");
    				String add = sc.next();
    				System.out.println("Enter the mobile number");
    				String mob = sc.next();
    				
    				Customer temp = new Customer(fName,lName,email,add,mob);
    				ar.add(temp);
    			}
    			
    			sc.close();
    			
    			Iterator<Customer> itr = ar.iterator();
    			System.out.format("%-20s %-20s %-20s %-30s %-20s","Firstname","Lastname","Email","Address","Mobile Number");
    			System.out.println();
    			while(itr.hasNext()) {
    				Customer c = itr.next();
    				System.out.format("%-20s %-20s %-20s %-30s %-20s",c.getfirstName(),c.getlastName(),c.getemail(),c.getaddress(),c.getmobileNumber());
    				System.out.println();
    			}
            }		
    	}
    }
