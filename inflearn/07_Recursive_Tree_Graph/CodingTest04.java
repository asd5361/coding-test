package Recursive_Tree_Graph;

import java.util.Scanner;

public class CodingTest04 {
    public static int[] recursion(int n){
        int[] fibo = new int[n];

        //초기값 설정
        fibo[0]=1;
        fibo[1]=1;

        //현재 원소 값 = 앞의 두 원소 값의 합
        for (int i = 2; i < n; i++) {
            fibo[i] = fibo[i-2] + fibo[i-1];
        }

        return fibo;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int x : recursion(n)){
            System.out.print(x + " ");
        }
    }
}
/*4.피보나치 수열
설명
1) 피보나치 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.


입력
첫 줄에 총 함수 N(3<=N<=45)이 입력된다.

출력
첫 줄에 피보나치 수열을 출력합니다.

예시 입력1
10
예시 출력1
1 1 2 3 5 8 13 21 34 55
 */
