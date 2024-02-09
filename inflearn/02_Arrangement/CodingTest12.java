import java.util.Scanner;

public class CodingTest12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //학생 수 입력 받음
        int stdNum = scanner.nextInt();
        int mathNum = scanner.nextInt();
        //n번 학생의 점수 받음
        int[][] bingGo = new int[mathNum][stdNum];
        for (int i = 0; i < mathNum; i++) {
            for (int j = 0; j < stdNum; j++) {
                bingGo[i][j] = scanner.nextInt();
            }
        }
        int answer = 0;
        for (int i = 1; i <= stdNum; i++) {
            for (int j = 1; j <= stdNum; j++) {
                int cnt = 0;
                for (int k = 0; k < mathNum; k++) {
                    int pi = 0;
                    int pj = 0;
                    for (int s = 0; s < stdNum; s++) {
                        if(bingGo[k][s] == i){
                            pi = s;
                        }
                        if(bingGo[k][s] == j){
                            pj = s;
                        }
                    }// for s
                    if(pi < pj){
                        cnt++;
                    }
                }// for k
                if(cnt == mathNum){
                    answer++;
                }
            }//for j
        }// for i
        System.out.println(answer);
    }
}
/*12.멘토링
현수네 반 선생님은 반 학생들의 수학점수를 향상시키기 위해 멘토링 시스템을 만들려고 합니다.
멘토링은 멘토(도와주는 학생)와 멘티(도움을 받는 학생)가 한 짝이 되어 멘토가 멘티의 수학공부를 도와주는 것입니다.
선생님은 M번의 수학테스트 등수를 가지고 멘토와 멘티를 정합니다.
만약 A학생이 멘토이고, B학생이 멘티가 되는 짝이 되었다면, A학생은 M번의 수학테스트에서 모두 B학생보다 등수가 앞서야 합니다.
M번의 수학성적이 주어지면 멘토와 멘티가 되는 짝을 만들 수 있는 경우가 총 몇 가지 인지 출력하는 프로그램을 작성하세요.

입력
첫 번째 줄에 반 학생 수 N(1<=N<=20)과 M(1<=M<=10)이 주어진다.
두 번째 줄부터 M개의 줄에 걸쳐 수학테스트 결과가 학생번호로 주어진다. 학생번호가 제일 앞에서부터 1등, 2등, ...N등 순으로 표현된다.
만약 한 줄에 N=4이고, 테스트 결과가 3 4 1 2로 입력되었다면 3번 학생이 1등, 4번 학생이 2등, 1번 학생이 3등, 2번 학생이 4등을 의미합니다.

출력
첫 번째 줄에 짝을 만들 수 있는 총 경우를 출력합니다.

예시 입력1
4 3
3 4 1 2
4 3 2 1
3 1 4 2

예시 출력1
3

힌트
출력설명
(3,1),(3,2),(4,2)와 같이 3가지 경우의 (멘토,멘티) 짝을 만들 수 있다.
 */
