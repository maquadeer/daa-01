/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dfs;

/**
 *
 * @author student
 */
public class DFS {
    public int vertices;
    public int adjMat[][];
    public int visited[];
    
    public DFS(){
        vertices = 8;
        visited = new int[vertices];
        adjMat = new int[][]{
            {0,1,1,0,0,0,0,0},
            {1,0,0,1,1,0,0,0},
            {1,0,0,0,0,1,1,0},
            {0,1,0,0,0,0,0,1},
            {0,1,0,0,0,0,0,1},
            {0,0,1,0,0,0,0,1},
            {0,0,1,0,0,0,0,1},
            {0,0,0,1,1,1,1,0}
        };
    }
    
    public void dfs(int s){
        if(visited[s]==0){
            System.out.print(s + " ");
            visited[s] =1;
            for(int j=0;j<vertices;j++)
                if(adjMat[s][j] ==1 && visited[j] == 0)
                    dfs(j);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DFS g = new DFS();
        System.out.println("DFS: ");
        g.dfs(0);
    }
    
}
