package codingTest01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//6. 중복문자제거
		//세팅 하기
		Scanner sc = new Scanner(System.in);
		
		//입력 받기
		String str = sc.nextLine();
		
		String [] arr = str.split("");
		String cStr = "";
		
		for(int i = 0; i < arr.length; i++) {
			for(int a = i+1; a < arr.length; a++) {
				if(arr[a].equals(arr[i]) ) {
					arr[a] = "";
				}
			}
			cStr+=arr[i];
		}
		System.out.println(cStr);

		/*
		 * 6. 중복문자제거
		 * 
		 * 설명
		 * 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
		 * 중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
		 * 
		 * 입력
		 * 첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.
		 * 
		 * 출력
		 * 첫 줄에 중복문자가 제거된 문자열을 출력합니다.
		 * 
		 * 입력
		 * ksekkset
		 * 
		 * 출력
		 * kset
		 */
	

	}


}
