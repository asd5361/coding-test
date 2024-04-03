package Recursive_Tree_Graph;

class Node{
    int data;
    Node left, right;
    public Node(int val){
        data=val;
        left=right=null;
    }
}
public class CodingTest05 {
    Node root;
    public static void DFS(Node root){
        if(root == null) return;
        else {
            //System.out.print(root.data+ " "); //전위 순회
            DFS(root.left);
            //System.out.print(root.data+ " "); //중위 순회
            DFS(root.right);
            //System.out.print(root.data+" "); // 후위 순회
        }
    }
    public static void main(String[] args) {
        CodingTest05 t = new CodingTest05();
         t.root = new Node(1);
        t.root.left = new Node(2);
        t.root.right = new Node(3);
        t.root.left.left = new Node(4);
        t.root.left.right = new Node(5);
        t.root.right.left = new Node(6);
        t.root.right.right = new Node(7);
        t.DFS(t.root);
    }
}
/*5.이진트리 순회(깊이우선탐색)
설명
//아래 그림과 같은 이진트리를 전위순회와 후위순회를 연습해보세요.

입력
아래 그림과 같은 이진트리를 전위순회와 후위순회를 연습해보세요.

출력
전위순회 출력 : 1 2 4 5 3 6 7
중위순회 출력 : 4 2 5 1 6 3 7
후위순회 출력 : 4 5 2 6 7 3 1

 */