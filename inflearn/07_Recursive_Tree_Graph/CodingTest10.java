package Recursive_Tree_Graph;

public class CodingTest10 {
    public static void undirectionalGraph(){
        int[][] graph = new int[6][6];
        graph[1][2] = graph[2][1] = 1;
        graph[1][3] = graph[3][1] = 1;
        graph[2][5] = graph[5][2] = 1;
        graph[2][4] = graph[4][2] = 1;
        graph[3][4] = graph[4][3] = 1;
        for (int[] ints : graph) {
            for (int anInt : ints) {
                System.out.print(anInt+" ");
            }
            System.out.println();
        }
    }
    public static void directionalGraph(){
        int[][] graph = new int[6][6];
        graph[1][2] = 1;
        graph[1][3] = 1;
        graph[2][5] = 1;
        graph[3][4] = 1;
        graph[4][2] = 1;
        for (int[] ints : graph) {
            for (int anInt : ints) {
                System.out.print(anInt+" ");
            }
            System.out.println();
        }
    }
    public static void weightedOrientationGraph(){
        int[][] graph = new int[6][6];
        graph[1][2] = 2;
        graph[1][3] = 4;
        graph[2][5] = 5;
        graph[3][4] = 5;
        graph[4][2] = 2;

        for (int[] ints : graph) {
            for (int anInt : ints) {
                System.out.print(anInt+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        undirectionalGraph();
        System.out.println("====");
        directionalGraph();
        System.out.println("====");
        weightedOrientationGraph();
    }
}
/*
10.그래프와 인접행렬
  1. 무방향 그래프
  2. 방향그래프
  3. 가중치 방향그래프

 */