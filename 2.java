import java.io.*; 
import java.util.* ;

class Employee {
	int code ;
	String name ;
	int salary ;
	String Designation ;

	Employee(int code, String name , int salary , String Designation){
		this.code = code ; 
		this.name = name ;
		this.salary = salary ;
		this.Designation = Designation ;
	}

	public String toString(){
		String detail = "Code is " + this.code + "\nName is " + this.name + "\nSalary is " + this.salary + "\nDesignation is " + this.Designation ;
		return detail ;
	}

	Boolean increaseSalary(){
		try{
			this.salary = this.salary + (int)(this.salary * 0.1) ;
			return true ;
		}catch(Exception ex){
			System.out.println("Error " + ex);
			return false ;
		}
	}

	int getId(){
		return this.code ;
	}
}


class DemoEmployee {
	public static void main(String[] args) {

		//Take input from user
		ArrayList<Employee> list = new ArrayList<Employee>();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of records you want to enter>");
		int n = scan.nextInt() ;
		for(int i=0 ; i<n ; ++i) {
			System.out.println("Enter detail of record number " + (i+1));
			System.out.print("Enter code>");
			int code = Integer.parseInt(scan.nextLine());
			//scan.nextLine();
			System.out.print("Enter name>");
			String name = scan.nextLine();
			System.out.print("Enter the salary>");
			int salary = Integer.parseInt(scan.nextLine());
			//scan.nextLine();
			System.out.print("Enter Designation>");
			String Designation = scan.nextLine();

			Employee newEmployee = new Employee(code,name,salary,Designation) ;
			
			list.add(newEmployee) ;

		}

		//Show All records
		System.out.println("Do you want to show all records?[yes/no]") ;
		String answer = scan.nextLine();
		if(answer.equals("yes")) {
			Iterator itr = list.iterator();
			System.out.println("Printing all records") ;
			while(itr.hasNext()){
				System.out.println(itr.next()) ;
			}
		}

		//Search for a record
		System.out.print("Enter the code is you want to search>") ;
		int searchCode = scan.nextInt();
		System.out.println("Searching for " + searchCode) ;
		
		Boolean found = false ;
		Iterator itr = list.iterator();
		while(itr.hasNext()){
			Employee currentEmployee = (Employee) itr.next();
			if(currentEmployee.code == searchCode){
				System.out.println("Record found!") ;
				System.out.println(currentEmployee) ;
				found = true ;
			}
		}

		if(found == false){
			System.out.println("Record not found") ;
		}

		//Increase Salary
		for(Employee e : list){
			if (e.increaseSalary()) {
				System.out.println("Salary Increased for Employee " + e.name);
				System.out.println("New Data is \n" + e) ;
			}else{
				System.out.println("There was an error while updating salary.") ;
			}
		}
	}
}
