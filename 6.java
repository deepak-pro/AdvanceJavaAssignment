import java.io.* ;
import java.util.* ;

class Customer{
	int accountNumber ;
	String name ;
	Customer(int accountNumber, String name){
		this.accountNumber = accountNumber ;
		this.name = name ;
	}

	public String toString(){
		return name + " have account number " + accountNumber ;
	}

	@Override
	public int hashCode(){
		return this.accountNumber ;
	}

	@Override
	public boolean equals(Object c1){
		Customer c = (Customer) c1 ;
		if(this.accountNumber == c.accountNumber){
			return true ;
		}else{
			return false ;
		}
	}
}

class BankDetailDemo{
	public static void main(String[] args) {

		HashSet<Customer> customers = new HashSet<Customer>();

		System.out.println("Enter details of customer") ;
		Scanner s = new Scanner(System.in) ;
		for(int i=0 ; i<20 ; ++i){
			int accountNumber ;
			String name ;
			System.out.print("Enter customer name>");
			name = s.nextLine();
			System.out.print("Enter customer account number>");
			accountNumber = s.nextInt();
			customers.add(new Customer(accountNumber,name)) ;
			s.nextLine();
		}

		Iterator i = customers.iterator();
		while(i.hasNext()){
			System.out.println(i.next()) ;
		}
	}
}