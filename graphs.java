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
      public static void createGraph( ArrayList<Edge>[] graph){
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
         // for(int i=0; i< graph[2].size(); i++){
         //    System.out.print(graph[2].get(i).dest);
         // }
      }
      // public static void BFS( ArrayList<Edge>[] graph){
      //   Queue<Integer> q = new LinkedList<>();
      // boolean[] visited = new boolean[graph.length];
      //   q.add(0);
      //   while(!q.isEmpty()){
      //      int curr=  q.remove();
      //      if(!visited[curr]){
      //       System.out.print(curr);
      //       visited[curr] = true;
      //       for(int i=0; i< graph[curr].size(); i++){
      //           int neighbor = graph[curr].get(i).dest;
      //             if (!visited[neighbor]) {
      //               q.add(neighbor);
      //           }
      //       }
      //      }


      //   }

      // }
      // public static void dfs(ArrayList<Edge>[] graph , int curr , boolean vis[]){
      //     vis[curr] = true;
      //     for(int i= 0; i<graph(curr).size(); i++){
      //       int e = graph(curr).get(i);
      //       if(!vis[curr]){
      //         dfs(graph,e.dest,vis);
      //       }
      //     }
      // }
      public static boolean hashPath(ArrayList<Edge>[] graph, int src, int dest, boolean visit[]){
        if(src == dest){
          return true;
        }
        visit[src] = true;
        for(int i=0; i<graph[src].size(); i++){
          Edge e = graph[src].get(i);
          if(!visit[e.dest] && hashPath(graph, e.dest, dest, visit)){
            return true;
          }
        }
        return false;
      }
      @SuppressWarnings("unchecked")
    public static void main(String args[]){
          int v =5;
          ArrayList<Edge>[] graph = new ArrayList[v];
          createGraph(graph);
          // BFS(graph);
          System.out.print(hashPath(graph,0,5,new boolean[v]
));
        
    
}
}