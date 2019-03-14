package binary_tree;
import java.util.LinkedList;
import java.util.Queue;
public class BinarySearchTree {


    private TreeNode root;
    
    public TreeNode get(int value) {
        if(root!=null)
            return root.get(value);
        else
        return null;
    }
     
    public int min() {
        if (root==null)
            return Integer.MIN_VALUE;
        
        else
            return root.min();
    }
    
    public int max() {
        if (root==null)
            return Integer.MAX_VALUE;
        else
            return root.max();
    }
    
    public void insert(int value) {
        
        if(root==null)   //tree is empty
            root = new TreeNode(value);
        
        else
            root.insert(value);
        
    }
    
    public void delete(int value) {
        TreeNode NodeToRemove=this.get(value);
        
        //search the tree for the value to delete
       root.delete(NodeToRemove);
    }
    
    public void traverseInOrder() {
        if(root!=null)
            root.traverseInOrder();  //start from root and traverse InOrder
    }
    public void traversePostOrder() {
        if(root!=null)
            root.traversePostOrder();
    }
    public void traversePreOrder() {
        if(root!=null)
            root.traversePreOrder();
    }
    
    public void traverseLevelOrder() {
        
       if(root!=null) {
           
           Queue<TreeNode> qu= new LinkedList<TreeNode>();
           
           qu.add(root);
           
          while( !qu.isEmpty()) {
             
              //remove Node from queue processing
              TreeNode temp=qu.poll();
              System.out.print(temp.getData()+", ");
              
                 //level order processing:  Does it have neighbor/children Nodes? If so, add to queue              
                  if(temp.getLeftChild() !=null)
                     qu.add(temp.getLeftChild() );
              
                  if(temp.getRightChild() !=null)
                     qu.add(temp.getRightChild());
          }
           
           
       }
    }
 

    public TreeNode getInorderSuccessorOfRightSubTree(TreeNode a) {
        
       return a.getInorderSuccessor();
        
    }
    



    
    
    public static void main(String[] args) {
        
       
        BinarySearchTree tree = new BinarySearchTree();
        
        tree.insert(25);
        tree.insert(20);
        tree.insert(27);
        tree.insert(15);
        tree.insert(22); 
        tree.insert(26); 
        tree.insert(30); 
        tree.insert(29);
        tree.insert(32);
      
         
        
        System.out.println("inorder traversal: ");
        tree.traverseInOrder();
        
        System.out.println();
        
        System.out.println("preorder traversal: ");
       tree.traversePreOrder();
        System.out.println();
 
     
        System.out.println("postorder traversal: ");
        tree.traversePostOrder();
        System.out.println();
        
        System.out.println("Level order traversal: ");
        tree.traverseLevelOrder();
        
        System.out.println();
        
        
        System.out.println("return node with value 9: "+tree.get(9));
        
    System.out.println("the min value is: "+tree.min());
    System.out.println("the max value is: "+tree.max()); 
    
    
   
    
    
    
    
    tree.traverseInOrder();
   
    
    
        
        
    }
    
    
}
