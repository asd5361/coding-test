package Recursive_Tree_Graph;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node lf, rt;
    public Node(int val){
        data = val;
        lf=rt=null;
    }
}

public class CodingTest07 {
        Node root;
        public void BFS(Node root){
            //Node객체 저장하는 큐 선언
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            // L : Level
            int L = 0;
        }
    public static void main(String[] args) {
        CodingTest07 main = new CodingTest07();
        main.root = new Node(1);
    }
}
/*7.이진트리 순회(넓이우선탐색 : 레벨 탐색)
이진트리 레벨탐색(BFS : Breadth-First Search)
설명
아래 그림과 같은 이진트리를 레벨 탐색 연습하세요.

레벨 탐색 순회 출력 : 1 2 3 4 5 6 7
 */