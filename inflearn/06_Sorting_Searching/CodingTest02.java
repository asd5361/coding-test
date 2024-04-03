package Sorting_Searching;

import java.util.Scanner;

public class CodingTest02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        //배열 크기 - 1 만큼 진행됨
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i; j++) { //큰 수가 맨 뒤로 가니까 -i만큼 빼서 비교함
                if(arr[j] >arr[j+1]) {
                    int tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
/*2.버블 정렬
설명
N개이 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
정렬하는 방법은 버블정렬입니다.

입력
첫 번째 줄에 자연수 N(1<=N<=100)이 주어집니다.
두 번째 줄에 N개의 자연수가 공백을 사이에 두고 입력됩니다. 각 자연수는 정수형 범위 안에 있습니다.

출력
오름차순으로 정렬된 수열을 출력합니다.

예시입력1
6
13 5 11 7 23 15
예시출력1
2 7 11 13 15 23
 */