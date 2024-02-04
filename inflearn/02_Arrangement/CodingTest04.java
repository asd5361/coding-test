import java.util.Scanner;

public class CodingTest04 {
    public static void main(String[] args) {
/*
4.피보나치 수열
1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.

입력
첫 줄에 총 항수 N(3<=N<=45)이 입력된다.

출력
첫 줄에 피보나치 수열을 출력합니다.

예시 입력1
10
예시 출력1
1 1 2 3 5 8 13 21 34 55
 */
/*
     n 수 만큼 반복문 돌리기
     a = 1, b = 1, c = a+b
     a출력
     b출력
     c = a + b
     c 출력
     a = b + c
     a 출력
     b = c + a
     b 출력
 */
        //4.피보나치 수열
        Scanner sc = new Scanner(System.in);
        // n번 숫자 입력
        int num = sc.nextInt();
        int[] arr = new int[num];
        int a = 1;
        int b = 1;
        int c = a+b;
        // a, b, c 값 배열이 저장
        if(arr.length == 1){
            arr[0] = a;
        }else if(arr.length == 2){
            arr[0] = a;
            arr[1] = b;
        }else if(arr.length > 2){
            arr[0] = a;
            arr[1] = b;
            arr[2] = c;
        }
        // 4번째 부터 값 계산해서 배열 저장
        for (int i = 3; i <= num-1; i++) {
            if(c > b && c > a){
                a = b+c;
                arr[i] = a;
            }else if(a > c && a > b){
                b = c+a;
                arr[i] = b;
            } else if (b > a && b > c) {
                c = a+b;
                arr[i] = c;
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
