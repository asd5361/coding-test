package Recursive_Tree_Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CodingTest13 {
    static int n,m;
    static ArrayList<ArrayList<Integer>> graph; //Integer를 저장할 수 있는 ArrayList를 저장하는 Arr;
    static int[] checked, dis; //방문 노드를 체크하는 용도, 레벨 기록 용도

    //1번 정점에서 각 정점으로 가는 최단 이동 간선수
    public static void BFS(int v){
        Queue<Integer> Q = new LinkedList<>();
        checked[v] = 1;
        dis[v] = 0;
        Q.offer(v); //0레벨 루트

        while (!Q.isEmpty()){
            int cv = Q.poll(); // 큐에서 꺼낸 정점 : cv

            //cv가 갈 수 있는 정점 순회
            for (int nv: graph.get(cv)) {
                if(checked[nv] == 0){ //방문한 적이 없으면
                    checked[nv] = 1; // 방문 기록
                    dis[nv] = dis[cv]+1; //cv의 레벨 + 1 기록
                    Q.offer(nv); //큐에 추가
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); //정점 개수
        m = sc.nextInt(); //간선 개수
        checked = new int[n+1];
        dis = new int[n+1];

        graph = new ArrayList<ArrayList<Integer>>();
        //정점 개수만큼 리스트 추가
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        //단방향 그래프
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            graph.get(a).add(b);
        }
        checked[1] = 1;
        BFS(1);

        for (int i = 2; i <= n; i++) {
            System.out.println(i+" : "+dis[i]);
        }
    }
}

/*13.그래프 최단거리(BFS)
다음 그래프에서 1번 정점에서 각 정점으로 가는 최소 이동 간선수를 출력하세요.

입력설명
첫째 줄에는 정점의 수 N(1<=N<=20)와 간선의 수 M가 주어진다. 그 다음부터 M줄에 걸쳐 연결정보가 주어진다.

출력설명
1번 정점에서 각 정점으로 가는 최소 간선수를 2번 정점부터 차례대로 출력하세요.

입력예제1
6 9
1 3
1 4
2 1
2 5
3 4
4 5
4 6
6 2
6 5

출력예제1
2 : 3
3 : 1
4 : 1
5 : 2
6 : 2
 */