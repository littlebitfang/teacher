import java.util.Scanner;

public class demo {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		
		student[] student1 = new student[n];
		for(int i = 0;i<student1.length;i++ ) {
			student1[i] = new student();
		}	
			
		
		for(int i = 0;i<student1.length;i++ ) {
			student1[i].midterm = kb.nextInt();
		}
	
		for(int i = 0;i<student1.length;i++ ) {
			student1[i].final1 = kb.nextInt();
		}
		for(int i = 0;i<student1.length;i++ ) {
			student1[i].name = kb.next();
		}
		for(int i = 0;i<student1.length;i++ ) {
			student1[i].printlnfo();
		}
	}

}
