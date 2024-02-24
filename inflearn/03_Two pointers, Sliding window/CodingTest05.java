package TowPointer;

import java.util.Scanner;

public class CodingTest05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int pointer = 1;
        //경우의 수를 담을 변수
        int cnt =0;

        //늘리는 수가 n보다 작을 때만 반복
        while (pointer < n){
            //합친 값을 담을 변수
            int sum =0;
            //연속적으로 수를 더함
            for (int i = pointer; i < n; i++) {
                sum += i;
                //더한 수와 입력값이 같으면 cnt+1
                if(sum == n){
                    cnt++;
                }
                //크거나 같으면 연속수 +1
                if(sum >= n){
                    break;
                }
            }
            pointer++;

        }
        // 포인터 숫자 늘리기;
        System.out.println(cnt);
    }
}
/*
5. 연속된 자연수의 합
N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성하세요.
만약 N=15이면
7+8=15
4+5+6=15
1+2+3+4+5=15
와 같이 총 3가지의 경우가 존재한다.

입력
첫 번째 줄에 양의 정수 N(7<=N<1000)이 주어집니다.

출력
첫 줄에 총 경우수를 출력합니다.

예시 입력1
15
예시 출력1
3
 */

