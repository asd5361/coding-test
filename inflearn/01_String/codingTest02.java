package codingTest01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//2번
		//세팅 하기
		Scanner sc = new Scanner(System.in);
		
		//입력 받기
		String str = sc.nextLine();
		String str2 = "";
		
		//대소문자로 변경
		for(int i=0; i<str.length(); i++) {
			
			char c = str.charAt(i);
			if((65 <=c)&&(c <=90)) {
				str2 += str.substring(i,i+1).toLowerCase();
			}else {
				str2 += str.substring(i,i+1).toUpperCase();
			}
		}
		System.out.println(str2);
			
				
		/*
		 * 설명
		 * 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
		 * 
		 * 입력
		 * 첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
		 * 문자열은 영어 알파벳으로만 구성되어 있습니다.
		 * 
		 * 출력
		 * 첫 줄에 대문자는 소문자로, 소문자는 대문자로 변한된 문자열을 출력합니다.
		 * 
		 * 예시
		 * StuDY-> sTUdy
		 */
	

	}


}
