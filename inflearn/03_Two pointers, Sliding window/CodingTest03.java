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

        //슬라이드 윈도우
        int sum =0;
        int max = 0;
        boolean flag = false;

        for (int i = 0; i < arrCnt; i++) {
            //i 가 더해야하는 수의 두번쨰까지의 수와 같을 때 flag을 참으로 바꿈
            if(i == maxCnt-1){
                flag =true;
            }
            // i 가 더해야하는 수보다 크거나 같을 때 총합에서 (i-더해야하는 수) 위치의 배열 값을 빼준다.
            if(i >= maxCnt){
                sum -= arr.get(i-maxCnt);
            }
            // 총합에 i번째 배열의 값을 더해준다.
            sum += arr.get(i);

            //합한 수가 max 수보다 크고 flag가 참일 때 max값에 합한 수를 대입한다.
            if(sum > max && flag){
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