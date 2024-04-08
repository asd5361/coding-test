package Recursive_Tree_Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class CodingTest12 {
    static ArrayList<ArrayList<Integer>> graph;
    static int[] checked; //방문 노드를 체크하는 용도
    static int n,m,answer = 0;

    public static void DFS(int v){
        if(v == n) answer++;
        else {
            //nv : 현재 노드(v)에서 갈 수 있는 노드 (nv)들
            for (int nv : graph.get(v)) {
                if(checked[nv] == 0){
                    checked[nv] = 1;
                    DFS(nv);
                    checked[nv] = 0; //nv번째 노드 방문이 끝났기 때문에 0으로 바꿈
                }
            }
        }
    }
    public static void main(String[] args) {
        CodingTest12 tree = new CodingTest12();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        //0번째는 사용 안함
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        checked = new int[n+1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            // a -> b
            graph.get(a).add(b);
        }
        checked[1]=1;
        tree.DFS(1);
        System.out.println(answer);
    }
}
/*12.경로 탐색(인접리스트)
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
