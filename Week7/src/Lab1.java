
public class Lab1 {
	/** Main method */
	public static void main(String[] args) {
		// Students' answers to the questions
		char[][] answers = {
				{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
				{'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
				{'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
				{'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
		// Key to the questions 
		char[] key = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'}; 
		
		
		grade(answers, key);
	}
	public static void grade(char[][] answers, char[] key) {	

		// Grade all answers 
		for (int i = 0; i < answers.length; i++) {
			// Grade one student 
			int correctCount = 0;
			for (int j = 0; j < answers[i].length; j++) {
				if (answers[i][j] == key[j])
					correctCount++;
			}

			System.out.println("Student " + i + "'s correct count is " +
					correctCount);
		}
	}
}
