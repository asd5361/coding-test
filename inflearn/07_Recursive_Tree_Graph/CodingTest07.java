package Recursive_Tree_Graph;

import java.util.LinkedList;
import java.util.Queue;


public class CodingTest07 {
        Node root;
        public void BFS(Node root){
            //Node객체 저장하는 큐 선언
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            // L : Level
            int L = 0;
            while (!q.isEmpty()){
                //q에 원소가 몇 개 들어가 있는가?
                int len = q.size();
                //System.out.print(L+" : ");
                for (int i = 0; i < len; i++) {
                    //Node 형
                    Node cur = q.poll();
                    // 한 레벨의 원소 출력 후
                    System.out.print(cur.data+" ");
                    //자식을 q에 넣음, cur:현재노드, if(cur.lf != null) : 말단 노드 거르기 위함
                    if(cur.left!=null) q.add(cur.left);
                    if(cur.right!=null) q.add(cur.right);
                }
                //레벨이 끝난 것이므로 ++
                L++;
                //줄바꿈
                System.out.println();
            }
        }
    public static void main(String[] args) {
        CodingTest07 main = new CodingTest07();
        main.root = new Node(1);
        main.root.left = new Node(2);
        main.root.right = new Node(3);
        main.root.left.left = new Node(4);
        main.root.left.right = new Node(5);
        main.root.right.left = new Node(6);
        main.root.right.right = new Node(7);
        main.BFS(main.root);
    }
}
/*7.이진트리 순회(넓이우선탐색 : 레벨 탐색)
이진트리 레벨탐색(BFS : Breadth-First Search)
설명
아래 그림과 같은 이진트리를 레벨 탐색 연습하세요.

레벨 탐색 순회 출력 : 1 2 3 4 5 6 7
 */