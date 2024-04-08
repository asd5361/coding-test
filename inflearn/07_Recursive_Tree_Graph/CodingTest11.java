package Recursive_Tree_Graph;

import java.util.Scanner;

public class CodingTest11 {
    static int[][] graph;
    static int[] checked; //방문 노드를 체크하는 용도
    static int n,m,answer = 0;

    public static void DFS(int v){
        if(v == n) answer++;
        else {
            for (int i = 1; i <= n; i++) {
                if(graph[v][i] == 1 && checked[i] == 0){
                    checked[i] = 1;
                    DFS(i);
                    checked[i] = 0; //i번째 노드 방문이 끝났기 때문에 0으로 바꿈
                }
            }
        }
    }
    public static void main(String[] args) {
        CodingTest11 tree = new CodingTest11();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new int[n+1][n+1];
        checked = new int[n+1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
        }
        checked[1]=1;
        tree.DFS(1);
        System.out.println(answer);
    }
}
/*11.경로 탐색(인접행렬)
방향그래프가 주어지면 1번 정점에서 N번 정점으로 가는 모든 경로의 가지 수를 출력하는 프로그램을 작성하세요. 아래 그래프에서 1번 정점에서 5번 정점으로 가는 가지 수는
1 2 3 4 5
1 2 5
1 3 4 2 5
1 3 4 5
1 4 2 5
1 4 5

총 6가지입니다.

입력설명
첫째 줄에는 정점의 수 N(1<=N<=20)와 간선의 수 M가 주어진다. 그 다음부터 M줄에 결쳐 연결정보가 주어진다.

출력설명
총 가지수를 출력한다.

입력예제1
5 9
1 2
1 3
1 4
2 1
2 3
2 5
3 4
4 2
4 5

출력예제 1
6
 */