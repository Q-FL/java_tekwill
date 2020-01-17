public class QuestionClass {
	QuestionClass(){}
	public String[] questionSelector(int questionNr) {
		String question,choice,answer,fifty,ask,phone;
		question = "nan";
		choice = "nan";
		answer = "nan";
		fifty = "nan";
		ask = "nan";
		phone = "nan";
		switch (questionNr) {
			default : System.out.println("ERROR: QUESTION NUMBER DOSEN'T EXIST."); break;
			case 1 : {
				question = "Which four options describe the correct default values for array elements of the types indicated ?\n1. int -> 0\n2. String -> 'null'\n3. Dog -> null\n4. char -> '\u0000'\n5. float -> 0.0\n6. boolean -> true";
				choice = "A. 1, 2, 3, 4\nB. 1, 3, 4, 5\nC. 2, 4, 5, 6\nD. 3, 4, 5, 6";
				answer = "B";
				fifty = "A. 1, 2, 3, 4\nB. 1, 3, 4, 5";
				ask = "A: 20%\nB: 60%\nC: 15%\nD: 5%";
				phone = "I dunno, maybe 'B'.";
				break;
			}
			case 2 : {
				question = "Which one of these lists contains only Java programming language keywords ?";
				choice = "A. class, if, void, long, Int, continue\nB. goto, instanceof, native, finally, default, throws\nC. try, virtual, throw, final, volatile, transient\nD. strictfp, constant, super, implements, do";
				answer = "B";
				fifty = "A. class, if, void, long, Int, continue\nB. goto, instanceof, native, finally, default, throws";
				ask = "A: 5%\nB: 55%\nC: 15%\nD: 25%";
				phone = "For sure it's 'B'.";
				break;
			}
			case 3 : {
				question = "Which will legally declare, construct, and initialize an array ?";
				choice = "A. int [] myList = {'1', '2', '3'};\nB. int [] myList = (5, 8, 2);\nC. int myList [] [] = {4,9,7,0};\nD. int myList [] = {4, 3, 7};";
				answer = "D";
				fifty = "C. int myList [] [] = {4,9,7,0};\nD. int myList [] = {4, 3, 7};";
				ask = "A: 20%\nB: 10%\nC: 15%\nD: 55%";
				phone = "really?...\nI'm just an newbie on learning Java Fundamentals at TekWill !\nSo you should know that the answer is 'D'.";
				break;
			}
			case 4 : {
				question = "Which is a reserved word in the Java programming language ?";
				choice = "A. method\nB. native\nC. subclasses\nD. reference";
				answer = "B";
				fifty = "B. native\nC. subclasses";
				ask = "A: 30%\nB: 40%\nC: 10%\nD: 20%";
				phone = "Uuu, that's a hard one...\nMaybe 'B'.";
				break;
			}
			case 5 : {
				question = "Which is a valid keyword in java ?";
				choice = "A. interface\nB. string\nC. Float\nD. unsigned";
				answer = "A";
				fifty = "A. interface\nB. string";
				ask = "A: 35%\nB: 15%\nC: 25%\nD: 25%";
				phone = "AAAAAAAAA !!!\nIt's 'A'...probably.";
				break;
			}
			case 6 : {
				question = "Which three are legal array declarations ?\n1. int [] myScores [];\n2. char [] myChars;\n3. int [6] myScores;\n4. Dog myDogs [];\n5. Dog myDogs [7];";
				choice = "A. 1, 2, 4\nB. 2, 4, 5\nC. 2, 3, 4\nD. All are correct.";
				answer = "A";
				fifty = "A. 1, 2, 4\nB. 2, 4, 5";
				ask = "A: 40%\nB: 20%\nC: 10%\nD: 30%";
				phone = "That's some basic sh**... 'A' totally !";
				break;
			}
			case 7 : {
				question = "Which one of the following will declare an array and initialize it with five numbers ?";
				choice = "A. Array a = new Array(5);\nB. int [] a = {23,22,21,20,19};\nC. int a [] = new int[5];\nD. int [5] array;";
				answer = "B";
				fifty = "A. Array a = new Array(5);\nB. int [] a = {23,22,21,20,19};";
				ask = "A: 20%\nB: 65%\nC: 10%\nD: 5%";
				phone = "Ok, ok...\nHmm...\nI will say 'B'.";
				break;
			}
			case 8 : {
				question = "Which is the valid declarations within an interface definition ?";
				choice = "A. public double methoda();\nB. public final double methoda();\nC. static void methoda(double d1);\nD. protected void methoda(double d1);";
				answer = "A";
				fifty = "A. public double methoda();\nB. public final double methoda();";
				ask = "A: 45%\nB: 15%\nC: 15%\nD: 25%";
				phone = "Well, the choice will be the 'first letter' from dudes that fly into space !";
				break;
			}
			case 9 : {
				question = "Which one is a valid declaration of a boolean ?";
				choice = "A. boolean b1 = 0;\nB. boolean b2 = 'false';\nC. boolean b3 = false;\nD. boolean b4 = Boolean.false();";
				answer = "C";
				fifty = "C. boolean b3 = false;\nD. boolean b4 = Boolean.false();";
				ask = "A: 15%\nB: 30%\nC: 35%\nD: 20%";
				phone = "Validate this boy with letter 'C'.";
				break;
			}
			case 10 : {
				question = "What is the numerical range of a char ?";
				choice = "A. -128 to 127\nB. -(215) to (215) - 1\nC. 0 to 32767\nD. 0 to 65535";
				answer = "D";
				fifty = "A. -128 to 127\nD. 0 to 65535";
				ask = "A: 15%\nB: 15%\nC: 30%\nD: 40%";
				phone = "Ouch...\nThat is a painful question, 'D' i think.";
				break;
			}
		}
		String[] array = new String[] {question,choice,answer,fifty,ask,phone};
		return array;
	}
}