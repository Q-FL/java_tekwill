public class QuestionClass {
	QuestionClass(){}
	public String[] questionSelector(int questionNr) {
		String question,choice,answer;
		question = "nan";
		choice = "nan";
		answer = "nan";
		switch (questionNr) {
			default : System.out.println("ERROR: QUESTION NUMBER DOSEN'T EXIST."); break;
			case 1 : {
				question = "Which four options describe the correct default values for array elements of the types indicated ?\n1. int -> 0\n2. String -> 'null'\n3. Dog -> null\n4. char -> '\u0000'\n5. float -> 0.0\n6. boolean -> true";
				choice = "A. 1, 2, 3, 4\nB. 1, 3, 4, 5\nC. 2, 4, 5, 6\nD. 3, 4, 5, 6";
				answer = "B";
				break;
			}
			case 2 : {
				question = "Which one of these lists contains only Java programming language keywords ?";
				choice = "A. class, if, void, long, Int, continue\nB. goto, instanceof, native, finally, default, throws\nC. try, virtual, throw, final, volatile, transient\nD. strictfp, constant, super, implements, do";
				answer = "B";
				break;
			}
			case 3 : {
				question = "Which will legally declare, construct, and initialize an array ?";
				choice = "A. int [] myList = {'1', '2', '3'};\nB. int [] myList = (5, 8, 2);\nC. int myList [] [] = {4,9,7,0};\nD. int myList [] = {4, 3, 7};";
				answer = "D";
				break;
			}
			case 4 : {
				question = "Which is a reserved word in the Java programming language ?";
				choice = "A. method\nB. native\nC. subclasses\nD. reference";
				answer = "B";
				break;
			}
			case 5 : {
				question = "Which is a valid keyword in java ?";
				choice = "A. interface\nB. string\nC. Float\nD. unsigned";
				answer = "A";
				break;
			}
			case 6 : {
				question = "";
				choice = "";
				answer = "";
				break;
			}
			case 7 : {
				question = "";
				choice = "";
				answer = "";
				break;
			}
			case 8 : {
				question = "";
				choice = "";
				answer = "";
				break;
			}
			case 9 : {
				question = "";
				choice = "";
				answer = "";
				break;
			}
			case 10 : {
				question = "";
				choice = "";
				answer = "";
				break;
			}
		}
		String[] array = new String[] {question,choice,answer};
		return array;
	}
}