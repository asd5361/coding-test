package TowPointer;

import java.util.*;

public class CodingTest03 {
    public static void main(String[] args) {
        //3번 문제
        //입력받기
        Scanner scanner = new Scanner(System.in);
        int arrCnt = scanner.nextInt();
        int maxCnt = scanner.nextInt();

        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < arrCnt; i++) {
            arr.add(scanner.nextInt());
        }

        int max = Integer.MIN_VALUE;
        //maxCnt 수만큼 앞에서 반복문 시작
        for (int i = maxCnt-1; i < arrCnt; i++) {
            int sum=0;
            //n가 만큼 연속으로 for문 돌리기
            for (int j =i; j > (i-maxCnt); j--) {
                sum += arr.get(j);
            }
            // 최댓값이 더한 값보다 작으면 값 대입하기
            if(max < sum){
                max = sum;
            }
        }

        //출력
        System.out.println(max);

    }
}
/*3.최대 매출
설명
현수의 아빠는 제과점을 운영합니다. 현수 아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 최대 매출액이 얼마인지 구하라고 했습니다.
만약 N=10이고 10일 간의 매출기록이 아래와 같습니다. 이때 K=3이면
12 15 11 20 25 10 20 19 13 15
연속된 3일간의 최대 매출액은 11+20+25=56만원입니다.
여러분이 현수를 도와주세요.

입력
첫 줄에 N(5<=N<=100,000)과 K(2<=K<=N)가 주어집니다.
두 번째 줄에 N개의 숫자열이 주어집니다. 각 숫자는 500이하의 음이 아닌 정수입니다.

출력
첫 줄에 최대 매출액을 출력합니다.

예시 입력1
10 3
12 15 11 20 25 10 20 19 13 15
예시 출력1
56
 */