package Sorting_Searching;

import java.util.Scanner;

public class CodingTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i <arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length-1; i++) {
            int idx = i;
            // n번째 위치에 들어갈 최솟값 찾기
            for (int j = i+1; j < arr.length; j++) {
                if(arr[idx]> arr[j]) idx = j;
            }
            //n번째 위치와 최솟값 위치의 서로 값을 변경
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
//정렬,이분검색과 결정알고리즘
/*1.선택 정렬
설명
N개의 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
정렬하는 방법은 선택정렬입니다.

입력
첫 번째 줄에 자연수 N(1<=N<=100)이 주어집니다.
두 번째 줄에 N개의 자연수가 공백을 사이에 두고 입력됩니다. 각 자연수는 정수형 범위 안에 있습니다.

출력
오름차순으로 정렬된 수열을 출력합니다.

예시입력1
6
13 5 11 7 23 15
예시출력1
5 7 11 13 15 23
*/