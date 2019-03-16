package breadthFirstSearch;

import java.util.LinkedList;
import java.util.Queue;
import DepthFirstSearch.Vertex;

public class BreadthFirstSearch {

    public Vertex root;
    
    
    public void search(Vertex root) {
        
        this.root=root;
        
        Queue<Vertex> qu = new LinkedList<Vertex>();
        
        qu.add(root);
        
        while(!qu.isEmpty()) {
            
            Vertex temp= qu.poll();
            
            System.out.print(temp.getData()+", ");
            
            for(Vertex v: temp.getNeighboursList()) {
                if(v.isVisited()==false) {
                    v.setVisited(true);
                    qu.add(v);
                }
            }
        }
        
    }
    
    public static void main(String[] args) {

        /*                10
         * 
         *       5        6        7
         *    30          15      
         *                20
         *              92  97  
         */
        
        
        Vertex A = new Vertex(10);
        Vertex B = new Vertex(5);
        Vertex C = new Vertex(6);
        Vertex D= new Vertex(7);
        Vertex E= new Vertex(30);
        Vertex F= new Vertex(15);
        Vertex G= new Vertex(20);
        Vertex H= new Vertex(92);
        Vertex I= new Vertex(97);
        
        
        A.addNeighbour(B);
        A.addNeighbour(C);
        A.addNeighbour(D);
        B.addNeighbour(E);
        C.addNeighbour(F);
        
        F.addNeighbour(G);
        G.addNeighbour(H);
        G.addNeighbour(I);
        
        BreadthFirstSearch BFS= new BreadthFirstSearch();
        
        BFS.search(A);
        
    }

}
