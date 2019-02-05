package binary_tree;
import java.util.LinkedList;
import java.util.Queue;
public class BinarySearchTree {
    /*            (BINARY SEARCH TREE)       
     *              50
     *              
     *        30            70
     *        
     *        
          20    40       60    80
          
        1
     
     
     */

    Node rootNode;
    
    public BinarySearchTree() {
        this.rootNode=null;
    }
    
    public Node search(Node root, int value) {
        
        if(root==null || root.value==value)
            return root;
        
        if(root.value>value)
            return search(root.left, value);
        
        return search(root.right,value);
    }
    
    
    public Node insertRecurssive(Node root, int value) {
        
        //if tree is empty, insert node with new value at root of BST.
        if(root==null) {
            root=new Node(value);
            return root;
        }
        
        //repeat method on current root's left node
        if(value<root.value)
            root.left= insertRecurssive(root.left, value);
        
        else if (value>root.value)
            root.right=insertRecurssive(root.right,value);
        
        //return unchanged node pointer
        return root;
        
            
    }
    public int minValue(Node root) {
        
        int minVal=root.value;
        while(root.left!=null) {
            minVal=root.left.value;
            root=root.left;
        }
        return minVal;
    }
    
    public Node deleteRecurssive(Node root, int value) {
        
        //base case: tree is empty
        if(this.rootNode==null) return root;
        
        //otherwise go recursively down the tree either on left or right
        if(value<root.value)
            root.left = deleteRecurssive(root.left,value);
        
        else if(value>root.value)
            root.right = deleteRecurssive(root.right,value);
        
        //if value is the same as the value at root node, then this is the node to be deleted(3 cases)
        else {
            //case 1: node with only one child or no child
            if(root.left==null)
                return root.right;
            else if(root.right==null)
                return root.left;
            //case 2: node with 2 children. Get smallest in rightsubtree
            root.value=minValue(root.right);
            
            //delete the node
            root.right=deleteRecurssive(root.right,root.value);
        }
        
        return root;
        
    }
    
    public void insert(int value) {
        this.rootNode=insertRecurssive(this.rootNode,value);   //passes root node and the value you want inserted
    }
    
    public void delete(int value) {
        this.rootNode=deleteRecurssive(this.rootNode,value);
    }
    
    
    
    
  
        
    
    
    public void inorder(Node root) {
        
        if(root==null)
            return;
       
        inorder(root.left);
        System.out.print(root.value+" ");
        inorder(root.right);
    }
    
    public void preorder(Node root) {
        
        if(root==null)
            return;
        
        System.out.print(root.value+" ");
        preorder(root.left);
        preorder(root.right);
        
    }
    
public void postorder(Node root) {
        
        if(root==null)
            return;
        
        
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.value+" ");
        
    }

public void levelOrder() {
    
  Queue<Node> queue = new LinkedList<Node>();
  
  queue.add(this.rootNode);
  
  while(!queue.isEmpty()) {
      
      //dequeue and print
      Node tempNode=queue.poll();
      System.out.print(tempNode.value+ " ");
      
      //enqueue left and right child of the node
      if(tempNode.left!=null)
      queue.add(tempNode.left);
      if(tempNode.right!=null)
      queue.add(tempNode.right);
         
  }
  
    
}
    
    
    public static void main(String[] args) {
        
       
        BinarySearchTree tree = new BinarySearchTree();
        
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40); 
        tree.insert(70); 
        tree.insert(60); 
        tree.insert(80); 
        tree.insert(1); 
       
        
        System.out.println("inorder traversal: ");tree.inorder(tree.rootNode);
        
        System.out.println();
        
        System.out.println("preorder traversal: ");tree.preorder(tree.rootNode);
        
        System.out.println();
        
        System.out.println("postorder traversal: ");tree.postorder(tree.rootNode);
        
        System.out.println();
        
        System.out.println("Level order traversal: ");tree.levelOrder();
        
        System.out.println();
        
        //find starting from Root node, a node with value of 1
        System.out.println("Node with value 50: "+tree.search(tree.rootNode, 50));System.out.println();
        
        
        //deleting node with value 50 from tree
        tree.delete(50);
System.out.println("inorder traversal: ");tree.inorder(tree.rootNode);
        
        System.out.println();
        
        System.out.println("preorder traversal: ");tree.preorder(tree.rootNode);
        
        System.out.println();
        
        System.out.println("postorder traversal: ");tree.postorder(tree.rootNode);
        
        System.out.println();
     
    }
    
    
}
