
import java.util.Scanner;

public class CodingTest05 {
    public static void main(String[] args) {

/*
5. 소수(에라토스테네스 체)
자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.

입력
첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.

출력
첫 줄에 소수의 개수를 출력합니다.

예시 입력1
20
예시 출력1
8
 */
        //5. 소수(에라토스테네스 체)
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int cnt = 0;
        //num 번째 수 까지 받기 위해 +1 준비함
        boolean[] arr = new boolean[num+1];

        //기본값 true으로 바꿔주기
        for (int i = 0; i < arr.length; i++) {
            arr[i] = true;
        }


        // 0과 1은 소수가 아니니까 false
        arr[0] = arr[1] = false;

        // 2부터 소수인지 확인해서 cnt 늘리기
        for (int i = 2; i <= num; i++) {
            if(arr[i]){
                //2부터 n의 배수를 확인하여, 배수이면 false 저장.
                for (int j = 2; j*i <= num; j++) {
                    arr[j*i] = false;
                }
                cnt++;
            }
        }

        //결과 출력
        System.out.println(cnt);

    }
}
