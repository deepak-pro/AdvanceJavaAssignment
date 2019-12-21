import java.io.* ;
import java.util.* ;

class Student{
	String name ;
	int marks ;
	int age ;
	Student(String name , int marks, int age){
		this.name = name ;
		this.marks = marks ;
		this.age = age ;
	} 
	public String toString(){
		return (name + " have " + marks + " marks, age is" + age ) ;
	}
}

class SortByDetail implements Comparator<Student>{
	public int compare(Student a, Student b){
		if(!a.name.equals(b.name)){
			return a.name.compareTo(b.name) ;
		}else{
			return a.age - b.age ;
		}
	}
}

class StudentDetailDemo {
	public static void main(String[] args) {
		TreeSet<Student> students = new TreeSet<Student>(new SortByDetail());

		students.add(new Student("Name3",100 , 10)) ;
		students.add(new Student("Name1",90 , 12)) ;
		students.add(new Student("Name2",95 , 11)) ;
		students.add(new Student("Name5",92 , 11)) ;
		students.add(new Student("Name4",89 , 13)) ;
		students.add(new Student("Name4",90 , 12)) ;



		Iterator i = students.iterator();
		while(i.hasNext()){
			System.out.println(i.next());

		}

	}
}