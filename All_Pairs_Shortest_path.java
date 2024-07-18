package all_pairs_shortest_path;

public class All_Pairs_Shortest_path {
    static final int INF = 999999;
  
    public static int[][] All_pairs(int[][] graph) {
        int V = graph.length;
        int[][] dist = new int[V][V];

        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                dist[i][j] = graph[i][j];
            }
        }

        for (int k = 0; k < V; k++) {
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < V; j++) {
                    if (dist[i][k] != INF && dist[k][j] != INF && dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        } 

        return dist;
    }

    public static void printSolution(int dist[][]) {
        int V = dist.length;
        for (int i = 0; i < V; ++i) {
            for (int j = 0; j < V; ++j) {
                if (dist[i][j] == INF)
                    System.out.print("INF ");
                else
                    System.out.print(dist[i][j] + "  ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) 
    {
        int[][] graph = {
                {0, 5, INF, 10},
                {INF, 0, 3, INF},
                {INF, INF, 0, 1},
                {INF, INF, INF, 0}
     };

        int[][] shortestDistances = All_pairs(graph);
        System.out.println("Shortest distances between every pair of vertices:");
        printSolution(shortestDistances);
        
    }
}
