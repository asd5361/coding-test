package Recursive_Tree_Graph;

public class CodingTest06 {
    static int n;
    static int[] ch; // 원소를 사용하는지 체크하는 배열
    public void DFS(int L){
        if(L == n+1){ //종착점에 왔을 때
            String tmp = "";
            for (int i = 1; i <= n; i++) {
                if(ch[i]==1) tmp += (i+" ");
            }
            if(tmp.length()>0) System.out.println(tmp); //공집합이 아닐 때만 출력
        }
        else {
            ch[L]=1;
            DFS(L+1);
            ch[L]=0;
            DFS(L+1);
        }
    }
    public static void main(String[] args) {
        CodingTest06 T = new CodingTest06();
        n=3;
        ch=new int[n+1]; //숫자를 인덱스로 하기 위해
        T.DFS(1);
    }
}
/*6.부분집합 구하기(DFS)
설명
자연수 N이 주어지면 1부터 N까지의 원소를 갖는 집합의 부분집합을 모두 출력하는 프로그램을 작성하세요.

입력
첫 번쨰 줄에 자연수 N(1<=N<=10)이 주어집니다.

출력
첫 번째 줄부터 각 줄에 하나씩 부분집합을 아래와 출력예제와 같은 순서로 출력한다. 단 공집합은 출력하지 않습니다.

예시 입력1
3
예시 출력1
1 2 3
1 2
1 3
1
2 3
2
3
 */