import java.io.* ;
import java.util.* ;

class Student{
	String name ;
	int marks ;
	Student(String name , int marks){
		this.name = name ;
		this.marks = marks ;
	} 
	public String toString(){
		return (name + " have " + marks + " marks") ;
	}
}

class SortByMarks implements Comparator<Student>{
	public int compare(Student a, Student b){
		return b.marks - a.marks ; //Sorted in decending order
	}
}

class StudentDemo {
	public static void main(String[] args) {
		TreeSet<Student> students = new TreeSet<Student>(new SortByMarks());

		Scanner s = new Scanner(System.in) ;
		for(int i=0 ; i<3 ; ++i) {
			System.out.print("Enter name of student>") ;
			String name = s.nextLine();
			System.out.print("Enter marks of student>") ;
			int marks = s.nextInt();
			students.add(new Student(name,marks)) ;
			s.nextLine();
		}

		Iterator i = students.iterator();
		while(i.hasNext()){
			System.out.println(i.next());

		}

	}
}