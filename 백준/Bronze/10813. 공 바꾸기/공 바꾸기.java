import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] arr = new int[N+1];
		
		for(int a=1;a<=N;a++) {
			arr[a] = a;
		}
		
		for(int b = 0;b<M;b++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		for(int c = 1;c<=N;c++) {
			if(c == arr.length-1) {
				System.out.print(arr[c]);
			}
			else{
				System.out.print(arr[c] + " ");
			}
		}
	}

}
