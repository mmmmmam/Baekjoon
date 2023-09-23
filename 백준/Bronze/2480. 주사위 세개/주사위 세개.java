import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int max1 = Math.max(A, B);
		int max2 = Math.max(max1, C);
		
		
		if (A != B && B != C && A != C) {
			System.out.println(max2 * 100);
		}
		else if (A == B && A == C) {
			System.out.println(10000 + A * 1000);
		}
		else if(A == B || A == C) {
			System.out.println(1000 + A * 100);
		}
		else {
			System.out.println(1000 + B * 100);
		
		sc.close();

		}

	}
	
}