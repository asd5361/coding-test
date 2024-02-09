package codingTest01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//4. 단어 뒤집기
		//세팅 하기
		Scanner sc = new Scanner(System.in);
		
		//입력 받기
		int n = Integer.parseInt(sc.nextLine());
		
		String[] arr = new String[n];		
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextLine();
		}
		//arr[] 만큼 돌림
		for(int a=0; a<arr.length; a++) {
			String[] charArr = new String[arr[a].length()];
			
			//arr[i] 값 넣음 = 3개의 단어 생성
			for(int i=0; i<arr[a].length(); i++) {
				charArr[i] = Character.toString(arr[a].charAt(i));
			}
			//charArr[] 배열 거꾸로 출력
			for(int i=charArr.length-1; i>=0; i--) {
				System.out.print(charArr[i]);
			}
			System.out.println();
		}
		
		/*
		 * 4. 단어 뒤집기
		 * 
		 * 설명
		 * N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
		 * 
		 * 입력
		 * 첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
		 * 두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.
		 * 
		 * 출력
		 * N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.
		 * 
		 * 예시
		 * 3
		 * good
		 * Time
		 * Big
		 * 
		 * 출력
		 * doog
		 * emiT
		 * giB
		 * 
		 * 
		 */
	

	}


}
