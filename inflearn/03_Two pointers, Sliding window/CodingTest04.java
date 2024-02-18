package TowPointer;

import java.util.*;

public class CodingTest04 {
    public static void main(String[] args) {
        //4번 문제
        //입력받기
        Scanner scanner = new Scanner(System.in);
        int arrCnt = scanner.nextInt();
        int x = scanner.nextInt();
        int cnt=0;
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < arrCnt; i++) {
            arr.add(scanner.nextInt());
        }

        //투 포인트
        /*
            시작과 끝을 나타내는 start 변수와 end 변수를 선언 및 초기화
            값을 더해서 확인할 sum 변수 선언 및 초기화
         */
        int start =0;
        int end =0;
        int sum =0;
        // while 반복문을 통해 start 값이 end 값보다 작거나 같을 떄까지 반복
        while (start <= end){
            //sum값이 x(요구하는 합의 수) 보다 크거나 같을 때 sum 값에서 start+1 해준 위치의 arr배열 값을 빼준다.
            if(sum >= x){
                sum -= arr.get(start++);

            //end 값이 배열의 길이와 같을 떼 (배열을 다 돌았을 때) while문 나가기
            }else if(end==arrCnt){
                break;

            //위 조건이 아닐 때 sum 값에 arr배열 end+1 번째 값을 더한다.
            }else{
                sum += arr.get(end++);
            }

            //sum 값과 요구하는 합의 값과 같으면 cnt+1 추가한다.
            if(sum==x){
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}
/*4.연속 부분수열
설명
N개의 수로 이루어진 수열이 주어집니다.
이 수열에서 연속부분수열의 합이 특정숫자 M이 되는 경우가 몇 번 있는지 구하는 프로그램을 작성하세요.
만약 N=8, M=6이고 수열이 다음과 같다면
1 2 1 3 1 1 1 2
합이 6이 되는 연속부분수열은 {2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}로 총 3가지입니다.

입력
첫째 줄에 N(1≤N≤100,000), M(1≤M≤100,000,000)이 주어진다.
수열의 원소값은 1,000을 넘지 않는 자연수이다.

출력
첫째 줄에 경우의 수를 출력한다.

예시 입력 1
8 6
1 2 1 3 1 1 1 2

예시 출력 1
3
 */