package TowPointer;

import java.util.*;

public class CodingTest01 {
    public static void main(String[] args) {
        //1번 문제
        Scanner scanner = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        //첫번째 배열 개수
        int fCnt = scanner.nextInt();

        //첫 줄 배열
        for (int i = 0; i < fCnt; i++) {
            arr.add(scanner.nextInt());
        }

        //두번째 배열 개수
        int sCnt = scanner.nextInt();

        //두번째 줄 배열
        for (int i = 0; i < sCnt; i++) {
            arr.add(scanner.nextInt());
        }

        //두 배열 합치기 + 정렬
        Collections.sort(arr);

        for (Integer i : arr) {
            System.out.print(i+" ");
        }

    }
}
/*1.두 배열 합치기
오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.

입력
첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다.
두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.
세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다.
네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.
각 리스트의 원소는 int형 변수의 크기를 넘지 않습니다.

출력
오름차순으로 정렬된 배열을 출력합니다.

예시 입력1
3
1 3 5
5
2 3 6 7 9

예시 출력1
1 2 3 3 5 6 7 9
 */
