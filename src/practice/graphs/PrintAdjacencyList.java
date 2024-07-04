package practice.graphs;

import java.util.ArrayList;
import java.util.List;

public class PrintAdjacencyList {
    public static void main(String[] args) {
        int V = 5, E = 7;
        int[][] edges = { { 0, 1 }, { 0, 4 }, { 4, 1 }, { 4, 3 }, { 1, 3 }, { 1, 2 }, { 3, 2 } };
        printGraph(V, edges, E);
    }

    static List<List<Integer>> adjList = new ArrayList<List<Integer>>();

    public static List<List<Integer>> printGraph(int V, int edges[][], int E) {

        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < E; i++) {
            int a = edges[i][0];
            int b = edges[i][1];
            addEdgeUni(a, b);
            addEdgeUni(b, a);
        }
        System.out.println(adjList.toString());
        return adjList;
    }

    public static void addEdgeUni(int a, int b) {
        adjList.get(a).add(b);
    }
}