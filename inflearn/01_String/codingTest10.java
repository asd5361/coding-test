package codingTest10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		char c = sc.next().charAt(0); //String 타입의 스캐너를 char 형태로 변환
		
		int cnt =1001; //카운터할 변수 선언
		
		int[] cntArr = new int[str.length()];

		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == c) {
				cnt = 0;
			}
			else {
				cnt ++;
			}
			cntArr[i] = cnt;
		}
		cnt = 1000;
		
		for (int i = str.length()-1; i >= 0 ; i--) {
			if(str.charAt(i) == c) {
				cnt = 0;
			}
			else {
				cnt ++;
				cntArr[i] = Math.min(cntArr[i], cnt);
			}
		}
		
		//값 출력문 넣기
		for (int i : cntArr) {
			System.out.print(i+" ");
		}
	}
	
}
/*
 * 가장 짧은 문자거리 
 * 설명
 * 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
 * 
 * 
 * 입력 첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
 * 문자열의 길이는 100을 넘지 않는다.
 * 
 * 
 * 출력 
 * 첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
 * 
 * 예시입력 fkdgkjdflkgjljslgjkfldjlkfdg f
 * teachermode e
 * 
 * 예시출력
 * 1 0 1 2 1 0 1 2 2 1 0
 */