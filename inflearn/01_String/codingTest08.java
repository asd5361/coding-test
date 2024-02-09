package codingTest01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//8. 유효한 팰린드롬
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] arr = str.toLowerCase().toCharArray();
		
		StringBuilder cStr = new StringBuilder();
		for(int i=0; i<arr.length; i++) {
			if(Character.isLetter(arr[i])) {
				cStr.append(arr[i]);
			}
		}
		if(cStr.length() == 0) {
			System.out.println("NO");
		}
		
		for(int i=0; i<cStr.length() /2; i++) {
			if(cStr.charAt(i) != cStr.charAt(cStr.length()-1-i)) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");

		/*8. 유효한 팰린드롬
		 * 
		 * 설명
		 * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다
		 * 
		 * 문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.
		 * 
		 * 단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.
		 * 알파벳 이외의 문자들의 무시합니다.
		 * 
		 * 입력
		 * 첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.
		 * 
		 * 출력
		 * 첫 번째 줄에 팰린드롬인지의 결과를 YES 또는 NO로 출력합니다.
		 * 
		 * 입력
		 * found7, time: study; Yduts; emit, 7Dnuof
		 * 
		 * 출력
		 * YES
		 */

	}


}
