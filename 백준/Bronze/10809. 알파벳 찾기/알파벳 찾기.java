import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[26];
		String s = sc.next();
		
		for(int i = 0;i<arr.length;i++) { //배열 초기화
			arr[i] = -1;
		}
		
		for(int j = 0;j<s.length();j++) {
			char c = s.charAt(j); //char타입 변수c에 문자열s의 문자를 추출하여 저장
			
			if(arr[c-'a'] == -1) { //-1인경우에만 대입하며 중복되는 문자 제외
				arr[c-'a'] = j;
			}
		}
		for(int k:arr) {
			System.out.print(k +" ");
		}
	}
}