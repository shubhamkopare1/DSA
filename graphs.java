import java.util.*;
class Graph{
      static class Edge{
           int src;
           int dest;
           int wt;
           public Edge(int s , int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
           }
      }
      @SuppressWarnings("unchecked")
    public static void main(String args[]){
          int v =5;
          ArrayList<Edge>[] graph = new ArrayList[v];
          for(int i= 0; i< graph.length; i++){
            graph[i] = new ArrayList<>();
          }
         graph[0].add(new Edge(0, 1, 5));
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 4, 2));
        graph[2].add(new Edge(2, 3, 1));
        graph[3].add(new Edge(3, 2, 1));
        graph[3].add(new Edge(3, 1, 3));
        graph[4].add(new Edge(4, 2, 2));
         for(int i=0; i< graph[2].size(); i++){
            System.out.print(graph[2].get(i).dest);
         }
    
}
}