package binary_tree;

public class TreeNode {

    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;
    private TreeNode parent;
    
    public TreeNode(int value) {
        data=value;
    }
    
    public TreeNode get(int value) {
        if(this.data==value)
            return this;
        
        if(value<data) {
            if(leftChild!=null) //if it has a left child, recursively call on the left child
                return leftChild.get(value);
        }
        else {
            if(rightChild!=null) 
                return rightChild.get(value);
          }
        return null;
    }
    
    public int min() {  //all min values are stored in LEFT edges
        
        if(leftChild==null)
            return this.data;
        
        else
            return leftChild.min();
    }
    
    public int max() {
        if(rightChild==null)
            return this.data;
        else
            return rightChild.max();
    }
   
    public void insert(int value) {
        
        //for duplicate values, do nothing
        if(value==data)
            return ;
        
        if(value<data) {
            
            if(leftChild==null)//if there is no left child: Empty tree or leaf node. WE FOUND OUR INSERTION POINT.
                leftChild=new TreeNode(value);
            else
                leftChild.insert(value);  //recursively call method for the base Node's child
        }
        
        else {
            if(rightChild==null)//if there is no right child: Empty tree or leaf node. WE FOUND OUR INSERTION POINT.
                rightChild=new TreeNode(value);
            else
                rightChild.insert(value);
        }
        
    }
    
    
    public TreeNode delete(TreeNode node,int value) {
        if(node==null)   
            return node;
   /*traverse until target node to delete*/   
        //if value to delete is smaller than base root, recur left side of tree
        if(value<node.data)
           node.leftChild= delete(node.leftChild, value);
        else if(value>node.data)
            node.rightChild=delete(node.rightChild,value);

        /* if current Node's value is equal to target value, then this is the node to be deleted */
        else {
            
        }

    }
        
        /*----------------Traversal Methods ----------------------*/
        
        public void traverseInOrder() {
            
            if(this.leftChild != null) //stopping case: when left child is null, then current node is a leaf.
            leftChild.traverseInOrder();  //recursively go down the tree on left side
            
            System.out.print(this.data+", ");
            
            if(rightChild!=null)
                rightChild.traverseInOrder();
                
         }
        
   public void traversePostOrder() {
            
            if(leftChild!=null)    //stopping case: when left child is null, then current node is a leaf.
                leftChild.traversePostOrder();  //recursively go down the tree on left side
            if(rightChild!=null)
                rightChild.traversePostOrder();
            System.out.print(this.data+", ");
            
        }
   
   public void traversePreOrder() {
       System.out.print(this.data+", ");
       if(leftChild!=null)    //stopping case: when left child is null, then current node is a leaf.
           leftChild.traversePreOrder();  //recursively go down the tree on left side
       if(rightChild!=null)
           rightChild.traversePreOrder();
       
   }
         
         
        
    
    /*--------------------------Accessor & Mutators(not used)-------------------------*/
    public int getData() {
        return data;
    }
    public TreeNode getLeftChild() {
        return leftChild;
    }
    public TreeNode getRightChild() {
        return rightChild;
    }
    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }
  
    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }
    
}
