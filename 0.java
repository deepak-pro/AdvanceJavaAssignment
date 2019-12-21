import java.util.* ;
import java.io.* ;

class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(4);

		list.remove(2) ;
		list.add(4,1) ;

		if(list.contains(5))
			System.out.println("List contains 5") ;

		Iterator i = list.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
	}
}