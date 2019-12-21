import java.io.* ;
import java.util.* ;

class Student{
	String name ;
	int marks ;
	int age ;
	int rollno;
	Student(String name , int marks, int age, int rollno){
		this.name = name ;
		this.marks = marks ;
		this.age = age ;
		this.rollno = rollno;
	} 
	public String toString(){
		return (name + " rollno. " + rollno + " have " + marks + " marks, age is" + age ) ;
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

		students.add(new Student("Name3",100 , 10, 01)) ;
		students.add(new Student("Name1",90 , 12, 02)) ;
		students.add(new Student("Name2",95 , 11, 03)) ;
		students.add(new Student("Name5",92 , 11, 04)) ;
		students.add(new Student("Name4",89 , 13, 05)) ;
		students.add(new Student("Name4",90 , 12, 06)) ;



		Iterator i = students.iterator();
		while(i.hasNext()){
			System.out.println(i.next());

		}

	}
}
