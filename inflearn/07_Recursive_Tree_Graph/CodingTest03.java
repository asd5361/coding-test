package Recursive_Tree_Graph;

import java.util.Scanner;

public class CodingTest03 {
    public static int recursion(int n){
        if(n == 0) return 1;
        else {
            return n * recursion(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(recursion(n));
    }
}
/*3.팩토리얼
설명
자연수 N이 입력되면 N를 구하는 프로그램을 작성하세요.
예를 들어 51 = 5*4*3*2*1=120입니다.

입력
첫 번째 줄에 자연수 N(1<=N<=100)이 주어집니다.
출력
첫 번째 줄에 N팩토리얼 값을 출력합니다.
예시 입력1
5
예시 출력1
120
 */
