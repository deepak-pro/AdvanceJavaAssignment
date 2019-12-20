import java.io.* ;
import java.util.* ;

class Question{
	String question = "Answer the question" ;
	List<String> options = new ArrayList<String>();
	int correctAnswer = 1 ;
	Question(){
		options.add("1: Option1");
		options.add("2: Option2");
		options.add("3: Option3");
		options.add("4: Option4");
	}

	public String toString(){
		String string = "Question : " + this.question + "\n";
		Iterator i = options.iterator();
		while(i.hasNext()){
			string = string + i.next() + "\n" ;
		}
		return string ;
	}
}

class McqDemo{
	public static void main(String[] args) {
		System.out.println("MCQ test") ;
		Question q = new Question() ;
		System.out.println(q);

		ArrayList<String> winners = new ArrayList<String>();
		Scanner s = new Scanner(System.in);
		int userAnswer ;
		String userName ;
		do {
			System.out.print("Enter your name>") ;
			userName = s.nextLine();
			if(userName.equals(""))
				break;
			System.out.print("Enter answer option>") ;
			userAnswer = s.nextInt();
			s.nextLine();

			if(userAnswer == q.correctAnswer){
				winners.add(userName) ;
			}

		}while(true) ;

		System.out.println("Three lucky winners are");
		Random rand = new Random();
		for(int i=0 ; i<3 && winners.size() != 0; ++i){
			System.out.println(winners.remove(rand.nextInt(winners.size()))) ;
		}

	}
}