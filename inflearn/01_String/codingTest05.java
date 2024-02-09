package codingTest01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//5. 특정 문자 뒤집기
		//세팅 하기
		Scanner sc = new Scanner(System.in);
		
		//입력 받기
		String str = sc.nextLine();
//		String str = "a#b!GE*T@S";
		char[] arr = str.toCharArray();
		StringBuilder cStr = new StringBuilder();
		for(int i=0; i<arr.length; i++) {
			if(Character.isLetter(arr[i])) {
				cStr.append(arr[i]);
				arr[i] = '0';
			}
		}
		cStr.reverse();
		int cStrIndex=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == '0') {
				arr[i] = cStr.charAt(cStrIndex++);
			}
		}
		for (char c : arr) {
			System.out.print(c);
		}
		/* 	
		 * 5.특정 문자 뒤집기
		 * 
		 * 설명
		 * 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
		 * 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
		 * 
		 * 입력
		 * 첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
		 * 
		 * 출력
		 * 첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
		 * 
		 * 입력
		 * a#b!GE*T@S
		 * 
		 * 출력
		 * S#T!EG*b@a
		 */
	

	}


}
