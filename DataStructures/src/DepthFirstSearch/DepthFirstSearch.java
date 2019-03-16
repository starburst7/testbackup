package DepthFirstSearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class DepthFirstSearch {

    private Vertex root;

    public DepthFirstSearch(Vertex root) {
          this.root = root;
          Stack<Vertex> st = new Stack<Vertex>();  //abstract data type that allows us to manage a depth first engagement
          
          st.push(root);
          
          while(!st.isEmpty()) {
              
              Vertex temp=st.pop();
              System.out.print(temp.getData()+", ");
              
              for(Vertex v: temp.getNeighboursList()) {
                 
                  if(v.isVisited()==false) {
                      v.setVisited(true);
                      st.push(v);
                  }
              }
          }
          
    }
    

    
    
    public static void main(String[]args) {
        
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
        
     
        DepthFirstSearch dfs = new DepthFirstSearch(A);
        
        
        
        
        
    }
    
    public void dfs(){
        
        
    }
    
    
}
