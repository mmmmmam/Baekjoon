import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		int cnt = 0;
		
		for(int i = 0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int f = sc.nextInt();
		
		for(int j=0; j<arr.length; j++) {
			if(f == arr[j]) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}