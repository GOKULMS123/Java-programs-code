import java.util.*;

class Graphlist {
  ArrayList<ArrayList<Integer>> adjlist = new ArrayList<>();

  Graphlist(int v) {
    for (int i = 0; i < v; i++) {
      adjlist.add(new ArrayList<Integer>());
    }
  }

  public void addedges(int s, int e) {
    adjlist.get(s).add(e);
    adjlist.get(e).add(s);
  }

  public void print() {
    for (int i = 0; i < adjlist.size(); i++) {
      System.out.print("adj list vertices: " + i + " => ");
      for (int j = 0; j < adjlist.get(i).size(); j++) {
        System.out.print(adjlist.get(i).get(j) + " ");
      }
      System.out.println();
    }
  }

  public void bfs(int v) {
    int V = adjlist.size();
    Queue<Integer> q = new LinkedList<>();
    boolean[] visited = new boolean[V];
    visited[v] = true;
    q.add(v);
    while (q.size() != 0) {
      int vertex = q.remove();
      System.out.print(vertex + " ");
      for (int i = 0; i < adjlist.get(vertex).size(); i++) {
        int av = adjlist.get(vertex).get(i);
        if (!visited[av]) {
          q.add(av);
          visited[av] = true;
        }
      }
    }
    System.out.println();
  }

  public void dfs(int v) {
    int V = adjlist.size();
    boolean[] visited = new boolean[V];
    dfs2(v, visited);
  }

  public void dfs2(int v, boolean[] visited) {
    visited[v] = true;
    System.out.print(v+" ");
    for (int i = 0; i < adjlist.get(v).size(); i++) {
      int av = adjlist.get(v).get(i);
      if (!visited[av]) {
        dfs2(av, visited);
      }
    }
  }
}

public class Graph {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Graphlist graphlist = new Graphlist(5);
    int[][] graph = {
        { 0, 1, 0, 0, 1 },
        { 1, 0, 1, 1, 0 },
        { 0, 1, 0, 1, 1 },
        { 0, 1, 1, 0, 1 },
        { 1, 0, 1, 1, 0 }
    };
    graphlist.addedges(0, 1);
    graphlist.addedges(0, 4);
    graphlist.addedges(1, 2);
    graphlist.addedges(1, 3);
    graphlist.addedges(2, 3);
    graphlist.addedges(2, 4);
    graphlist.addedges(3, 4);

    graphlist.print();

    graphlist.bfs(0);
    graphlist.dfs(1);

    sc.close();
  }
}