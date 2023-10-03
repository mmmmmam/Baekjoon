import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		String[] S = new String[t];
		
		for(int i = 0;i<t;i++) {
			String str = sc.next();
			S[i] = str.substring(0,1) + str.substring(str.length()-1, str.length());
		}
		
		sc.close();
		
		for(int i=0;i<t;i++) {
			System.out.println(S[i]);
		}
	}
}