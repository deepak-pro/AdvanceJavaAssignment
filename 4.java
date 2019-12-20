import java.util.* ;
import java.io.* ;

class StudentNameDemo {
	public static void main(String[] args) {
		HashSet<String> names = new HashSet<String>();
		System.out.println("Enter names of students") ;
		Scanner s = new Scanner(System.in) ;

		while(true){
			String name = s.nextLine();
			if(name.equals("")){
				break ;
			}else{
				names.add(name) ;
			}
		}

		System.out.println("You Entered") ;
		Iterator i = names.iterator();
		while(i.hasNext()){
			System.out.println(i.next()) ;
		}

		List<String> list = new ArrayList<String>(names);
		Collections.sort(list) ;

		System.out.println("Sorted list is") ;
		Iterator it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next()) ;
		}

	}
}