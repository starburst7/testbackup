package binary_tree;

public class Node {

    char data;
    int value;
    Node left;
    Node right;
    Node parent;
    
    //initialize Node's character value
    Node(char data,int value){
        this.data=data;
        this.right=null;
        this.left=null;
        this.parent=null;
        this.value=value;
    }
    
    Node(int value){
        this.value=value;
        right=null;
        left=null;
    }
    
   
    
    
    
    
    
}
