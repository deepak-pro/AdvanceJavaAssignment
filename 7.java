import java.io.* ;
import java.util.* ;

class Customer{
	String name;
	int balance;
	String contact ;

	Customer(String name, int balance , String contact){
		this.name = name ;
		this.balance = balance ;
		this.contact = contact ;
	}

	public String toString(){
		return name + " " + balance + " " + contact ;
	}


}

class BankCustomerDemo{
	public static void main(String[] args) {
		Customer c = new Customer("Deepak",9999,"+919999999999") ;

		HashMap<Integer,Customer> details = new HashMap<Integer,Customer>();

		Scanner s = new Scanner(System.in) ;

		for(int i=0 ; i<3 ; ++i){
			int accountNumber ;
			String name ;
			int balance ;
			String contact ;

			System.out.print("Enter name>") ;
			name = s.nextLine();
			System.out.print("Enter phone number>");
			contact = s.nextLine();
			System.out.print("Enter balance>") ;
			balance = s.nextInt();
			s.nextLine();
			Customer newCustomer = new Customer(name,balance,contact) ;

			System.out.print("Enter the accountNumber>") ;
			accountNumber = s.nextInt();
			s.nextLine();

			details.put(accountNumber,newCustomer) ;
		}

		details.forEach((key,value) -> System.out.println(key + "=" +value));



	}
}
