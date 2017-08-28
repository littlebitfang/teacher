import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		
		teacher[]  n1 = new teacher[n];
		
		for(int i = 0; i<n1.length;i++) {
			n1 [i] =new teacher();
		}
		for(int i = 0; i<n1.length;i++) {
			n1[i].name =kb.next();
			n1[i].majors =kb.next();
			n1[i].minor =kb.next();

	}
		String majors1 = kb.next();
		
		for(int i = 0; i<n1.length;i++) {
			n1[i].teacher1(majors1);
	}
	}
}
