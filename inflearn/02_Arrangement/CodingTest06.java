import java.util.Scanner;

public class CodingTest06 {
    public static void main(String[] args) {
/*
6. 뒤집은 소수
N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.
첫 자리부터의 연속된 0은 무시한다.

입력
첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다.
각 자연수의 크기는 100,000를 넘지 않는다.

출력
첫 줄에 뒤집은 소수를 출력합니다. 출력순서는 입력된 순서대로 출력합니다.

예시 입력1
9
32 55 62 20 250 370 200 30 100

예시 출력1
23 2 73 2 3
*/
/* 수를 뒤집는다. 뒤집어서 소수인지 확인한다.
*
* */
        //6. 뒤집은 소수
        Scanner scanner = new Scanner(System.in);

        //값 입력 받기
        int num = scanner.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            int result=0;
            int n = scanner.nextInt();
            //정수 뒤집는 공식
            while (n != 0){
                result = result * 10 + n % 10;
                n /= 10;
            }
            arr[i] = result;
        }

        //배열에서 뒤집은 정수 꺼내기
        for (int i = 0; i < arr.length; i++) {
            //꺼낸 정수가 소수인지 확인하기

            //2 와 3은 별도로 지정
//            if(arr[i] == 2 || arr[i] == 3){
//                System.out.print(arr[i]+" ");
//                continue;
//            }
            boolean isPrime = true;
                if(arr[i] == 1){
                    continue;
                }
            // 변수 i를 제곱근만큼 반복
            for (int j = 2; j <= Math.sqrt(arr[i]); j++) {
                // num이 i로 나눠져 나머지가 0이 되면 다음 반복문 실행
                if(arr[i] % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(arr[i]+" ");
            }
        }

    }
}
