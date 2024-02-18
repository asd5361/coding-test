package TowPointer;

import java.util.*;

public class CodingTest02 {
    public static void main(String[] args) {
        //2번 문제
        Scanner scanner = new Scanner(System.in);

        //첫번째 배열 개수
        int fCnt = scanner.nextInt();

        //첫 줄 배열
        List<Integer> fArr = new ArrayList<>();
        for (int i = 0; i < fCnt; i++) {
            fArr.add(scanner.nextInt());
        }

        //두번째 배열 개수
        int sCnt = scanner.nextInt();

        //두번째 줄 배열
        List<Integer> sArr = new ArrayList<>();
        for (int i = 0; i < sCnt; i++) {
            sArr.add(scanner.nextInt());
        }

        //두 배열 정렬
        Collections.sort(fArr);
        Collections.sort(sArr);

        //투포인터
        int first =0;
        int secend =0;
        List<Integer> result = new ArrayList<>();

        //첫번째 포인터와 두번째 포인터가 배열이 길이보다 작을 때만
        while (first<fCnt && secend<sCnt){

            //두 배열의 포인터 위치의 배열 값이 같을 때
            if(fArr.get(first).equals(sArr.get(secend))){
                result.add(fArr.get(first));
                first++;
                secend++;

            // 첫번째 배열의 포인터 위치의 배열 값이 클때 두번째 포인터 값 올리기, 아니면 첫번째 포인터 값 올리기
            }else if(fArr.get(first)>sArr.get(secend)){
                secend++;
            }else {
                first++;
            }
        }
        //결과 배열 정렬
        Collections.sort(result);
        
        //결과 출력
        for (Integer i : result) {
            System.out.print(i+" ");
        }
    }
}
/*2. 공통원소 구하기
A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로그램을 작성하세요.

입력
첫 번째 줄에 집합 A의 크기 N(1<=N<=30,000)이 주어집니다.
두 번째 줄에 N개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
세 번째 줄에 집합 B의 크기 M(1<=M<=30,000)이 주어집니다.
네 번째 줄에 M개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
각 집합의 원소는 1,000,000,000이하의 자연수입니다.

출력
두 집합의 공통원소를 오름차순 정렬하여 출력합니다.

예시 입력1
5
1 3 9 5 2
5
3 2 5 7 8

예시 출력1
2 3 5
 */
