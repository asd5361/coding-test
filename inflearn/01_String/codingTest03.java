package codingTest01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//3번
		//세팅 하기
		Scanner sc = new Scanner(System.in);
		
		//입력 받기
		String str = sc.nextLine();
//		String str = "jddgshsgskjkdj dijglolkdwoig dkjkljglkd gksjlkjgls gkjldkjgla";
		//전체 대문자로 변경
		String[] arr = str.split(" ");

		String lastArr= arr[arr.length-1];
		
		for(int i=arr.length-2; i >= 0; i--) {
			if(lastArr.length() <= arr[i].length()) {
				lastArr = arr[i];
			}
		}
		System.out.println(lastArr);
		
		/*
		 * 설명
		 * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
		 * 문장속의 각 단어는 공백으로 구분됩니다.
		 * 
		 * 입력
		 * 첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.
		 * 
		 * 출력
		 * 첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한 단어를 답으로 합니다.
		 * 
		 * 예시
		 * it is time to study -> study
		 */
		
		/*
		 * 입력값
		 * jddgshsgskjkdj dijglolkdwoig dkjkljglkd gksjlkjgls gkjldkjgla
		 * 
		 * 정답값
		 * jddgshsgskjkdj
		 */
	

	}


}
