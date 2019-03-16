package breadthFirstSearch;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    
    private int data;
    private boolean visited;
    private List<Vertex> neighboursList;
    
    
    public Vertex(int data) {
        
        this.data = data;
        this.visited=false;  //initially not visited
        this.neighboursList = new ArrayList<Vertex>();  //using ArrayList for List type obj  
        }
    
    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public void addNeighbour(Vertex vertex) {
        this.neighboursList.add(vertex);
    }

    public int getData() {
        return data;
    }
    
    public List<Vertex> getNeighboursList() {
        

            return neighboursList;
        
    }

  
    
    
    
}
