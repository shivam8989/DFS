package Graphs;

import java.util.ArrayList;

public class DFS {
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int src, int dest, int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }
    public static void CreateGraph(ArrayList<Edge>[] graph){
        for(int i = 0; i<graph.length; i++){
            graph[i]= new ArrayList<>();
        }
        graph[0].add(new DFS.Edge(0,1,1));
        graph[0].add(new DFS.Edge(0,2,1));

        graph[1].add(new DFS.Edge(1,0,1));
        graph[1].add(new DFS.Edge(1,3,1));

        graph[2].add(new DFS.Edge(2,0,1));
        graph[2].add(new DFS.Edge(2,4,1));

        graph[3].add(new DFS.Edge(3,1,1));
        graph[3].add(new DFS.Edge(3,4,1));
        graph[3].add(new DFS.Edge(3,5,1));

        graph[4].add(new DFS.Edge(4,2,1));
        graph[4].add(new DFS.Edge(4,3,1));
        graph[4].add(new DFS.Edge(4,5,1));

        graph[5].add(new DFS.Edge(5,3,1));
        graph[5].add(new DFS.Edge(5,4,1));
        graph[5].add(new DFS.Edge(5,6,1));

        graph[6].add(new DFS.Edge(6,5,1));
    }
    public static void Dfs(ArrayList<Edge> [] graph, int curr, boolean visit[]){
        //visited
        System.out.print(curr+ " ");
        visit[curr]= true;
        for(int i = 0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!visit[e.dest]){
                Dfs(graph,e.dest,visit);
            }
        }

    }

    public static void main(String[] args) {
        int vertex = 7;
        ArrayList<Edge> [] graph = new ArrayList[7];
        CreateGraph(graph);
        Dfs(graph,0,new boolean[vertex]);

    }
}
