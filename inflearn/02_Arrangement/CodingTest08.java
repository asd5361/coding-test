import java.util.Scanner;

public class CodingTest08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N명 수 입력 받기
        int num = scanner.nextInt();

        // N명의 점수들 입력 받기
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }
        //등수를 담을 점수 입력 받기
        int[] answer = new int[num];

        // i번째 점수 꺼냄
        for (int i = 0; i < arr.length; i++) {
            //증가시킬 등수 담을 int형 변수
            int cnt = 1;
            
            //들어있는 점수들 비교해서 i번째보다 큰 수가 있으면 등수 1 중가
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] < arr[j]){
                    cnt++;
                }
                //답을 담을 배열에 등수 삽입
                answer[i] = cnt;
            }
        }
        //등수 결과 출력
        for (int i : answer) {
            System.out.print(i+" ");
        }
}
}
/*8.등수구하기
N명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램을 작성하세요.
같은 점수가 입력될 경우 높은 등수로 동일 처리한다.
즉 가장 높은 점수가 92점인데 92점이 3명 존재하면 1등이 3명이고 그 다음 학생은 4등이 된다.

입력
첫 줄에 N(3<=N<=100)이 입력되고, 두 번째 줄에 국어점수를 의미하는 N개의 정수가 입력된다.

출력
입력된 순서대로 등수를 출력한다.

예시 입력1
5
87 89 92 100 76

예시 출력1
4 3 2 1 5
 */