package Recursive_Tree_Graph;

import java.util.Scanner;

public class CodingTest02 {
    static StringBuffer sb = new StringBuffer();
    public void recursive(int n){
        if(n == 0){ //몫이 0이라면
            return;
        }else{
            recursive(n/2);
            sb.append(n % 2); //이어 붙이기
        }
    }
    public static void main(String[] args) {
        CodingTest02 t = new CodingTest02();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        t.recursive(n);
        System.out.println(sb.toString());
    }
}
/*2.재귀함수를 이용한 이진수 출력
설명
10진수 N이 입력되면 2진수로 변환하여 출력하는 프로그램을 작성하세요. 단 재귀함수를 이용해서 출력해야 합니다.

입력
첫 번째 줄에 10진수 N(1<=N<=1,000)이 주어집니다.

출력
첫 번째 줄에 이진수를 출력하세요.

예시 입력1
11
예시 출력1
1011
 */