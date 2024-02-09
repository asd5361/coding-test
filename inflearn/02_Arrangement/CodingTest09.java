import java.util.Scanner;

public class CodingTest09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[][] bingGo = new int[num][num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                bingGo[i][j] = scanner.nextInt();
            }
        }
        int answer = 0;

        //같은 행과 열의 합 구하기
        int rowSum,colsum;
        for (int i = 0; i < num; i++) {
        rowSum = colsum = 0;
            for (int j = 0; j < num; j++) {
                rowSum += bingGo[i][j];
                colsum += bingGo[j][i];
            }
            //행과 열 수 중에 큰거 answer 넣기
            answer = Math.max(answer,rowSum);
            answer = Math.max(answer,colsum);
        }

        //왼쪽 대각, 오른쪽 대각 구하기
        int liftDiag = 0;
        int rightDiag = 0;
        for (int i = 0; i < num; i++) {
            liftDiag += bingGo[i][i];
            rightDiag += bingGo[i][num-1-i];
        }
        answer = Math.max(answer,liftDiag);
        answer = Math.max(answer,rightDiag);

        System.out.println(answer);
    }
}
/*
9.격자판 최대합

5*5 격자판에 아래롸 같이 숫자가 적혀있습니다.
N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.

입력
첫 줄에 자연수 N이 주어진다.(2<=N<=50)
두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.

출력
최대합을 출력합니다.

예시 입력1
5
10 13 10 12 15
12 39 30 23 11
11 25 50 53 15
19 27 29 37 27
19 13 30 13 19

예시 출력
155
 */