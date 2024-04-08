package Recursive_Tree_Graph;



public class CodingTest09 {
    Node root;
    public int DFS(int L, Node root){
        if(root.left == null && root.right == null) return L;
        else return Math.min(DFS(L+1,root.left),DFS(L+1,root.right));
    }

    public static void main(String[] args) {
        CodingTest09 tree = new CodingTest09();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.println(tree.DFS(0,tree.root));
    }
}
/*
9.Tree 말단 노드까지의 가장 짧은 경로

아래 그림과 같은 이진트리에서 루트 노드 1에서 말단 노드까지의 길이 중 가장 짧은 길이를 구하는 프로그램을 작성하세요.
각 경로의 길이는 루트노드에서 말단노드까지 가는데 이동하는 횟수를 즉 간선(에지)의 개수를 길이로 하겠습니다.

가장 짧은 길이는 3번 노드까지의 길이인 1이다.
 */