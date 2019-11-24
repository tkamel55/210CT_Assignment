// q9 about binary search tree with traverse 


//this class represent the nodes
class Node {
	 
    private Node left;
    private Node right;
    private Integer data;
 
    public Node(Integer data) {
        this.data = data;
    }
 
    public Node getLeft() {
        return left;
    }
    public void setLeft(Node left) {
        this.left = left;
    }
    public Node getRight() {
        return right;
    }
    public void setRight(Node right) {
        this.right = right;
    }
 
    public Integer getData() {
        return data;
    }
}
 
public class Q9 {
  
    private Node root;
 
    public boolean isEmpty() {
 
        return (this.root == null);
    }
 
    public void insert(Integer data) {
 
        System.out.print("[input: "+data+"]");
        if(root == null) {
            this.root = new Node(data);
            System.out.println(" -> inserted: "+data);
            return;
        }
 
        insertNode(this.root, data);
        System.out.print(" -> inserted: "+data);
        System.out.println();
    }
 
    private Node insertNode(Node root, Integer data) {
 
        Node tmpNode = null;
        System.out.print(" ->"+root.getData());
        if(root.getData() >= data) {
            System.out.print(" [L]");
            if(root.getLeft() == null) {
                root.setLeft(new Node(data));
                return root.getLeft();
            } else {
                tmpNode = root.getLeft();
            }
        } else {
            System.out.print(" [R]");
            if(root.getRight() == null) {
                root.setRight(new Node(data));
                return root.getRight();
            } else {
                tmpNode = root.getRight();
            }
        }
 
        return insertNode(tmpNode, data);
    }
    
   
    
    public void postOrderTraversal() {
        doPostOrder(this.root);
    }
    
    //implementing postorder method 
    private void doPostOrder(Node root) {
    	 
        if(root == null) return;
        doPostOrder(root.getLeft());
        doPostOrder(root.getRight());
        System.out.print(root.getData()+" ");
    }
    
    public void inOrderTraversal() {
        doInOrder(this.root);
    }
 
    //implementing inorder method 
    private void doInOrder(Node root) {
 
        if(root == null) return;
        doInOrder(root.getLeft());
        System.out.print(root.getData()+" ");
        doInOrder(root.getRight());
    }
    
    public void preOrderTraversal() {
        doPreOrder(this.root);
    }
     
    
    // Implementing preorder method
    private void doPreOrder(Node root) {
 
        if(root == null) return;
        System.out.print(root.getData()+" ");
        doPreOrder(root.getLeft());
        doPreOrder(root.getRight());
    }
    
   // to test the program 
    public static void main(String a[]) {
       
        Q9 bst = new Q9();
        bst.insert(7);
        bst.insert(9);
        bst.insert(4);
        bst.insert(1);
        bst.insert(5);
        bst.insert(3);
        bst.insert(6);
        bst.insert(0);
        bst.insert(8);
        //For spacing
        System.out.println("");
        
        System.out.println("In-order Traverse:");
        bst.inOrderTraversal();
        
        System.out.println("");
        
        System.out.println("Post-order Traverse:");
        bst.postOrderTraversal();
        
        System.out.println("");
        
        System.out.println("Pre-order Traverse:");
        bst.preOrderTraversal();
        
      }
}
