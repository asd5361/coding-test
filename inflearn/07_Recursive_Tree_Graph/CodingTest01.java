package Recursive_Tree_Graph;

import java.util.Scanner;

public class CodingTest01 {
    public static void recursion(int n){
        if(n == 0) return;
        else{
            recursion(n-1);
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recursion(n);
    }
}
/*1.재귀함수
설명
자연수 N이 입력되면 재귀함수를 이용하여 1부터 N까지를 출력하는 프로그램을 작성하세요.
입력
첫 번째 줄은 점수 N(3<=N<=10)이 입력된다.

출력
첫째 줄에 출력한다.

예시 입력1
3
예시 출력1
1 2 3
*/