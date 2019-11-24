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
    public void setData(Integer data) {
        this.data = data;
    }
 
    public Integer getData() {
        return data;
    }
}
 
public class Q10 {
  
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
    
    
    public void delete(Integer data) {
    	 
        deleteNode(this.root, data);
    }
 
    private Node deleteNode(Node root, Integer data) {
 
        if(root == null) return root;
 
        if(data < root.getData()) {
            root.setLeft(deleteNode(root.getLeft(), data));
        } else if(data > root.getData()) {
            root.setRight(deleteNode(root.getRight(), data));
        } else {
            // node with no leaf nodes
            if(root.getLeft() == null && root.getRight() == null) {
            	System.out.println("After deleting "+data+":");
                return null;
            } else if(root.getLeft() == null) {
                // node with one node (no left node)
            	System.out.println("After deleting "+data+":");
                return root.getRight();
            } else if(root.getRight() == null) {
                // node with one node (no right node)
            	System.out.println("After deleting "+data+":");
                return root.getLeft();
            } else {
                // nodes with two nodes
                // search for min number in right sub tree
                Integer minValue = minValue(root.getRight());
                root.setData(minValue);
                root.setRight(deleteNode(root.getRight(), minValue));
                System.out.println("After deleting "+data+":");
            }
        }
 
        return root;
    }
   // this method is to find the minimum number after the nodes been deleted 
    private Integer minValue(Node node) {
 
        if(node.getLeft() != null) {
            return minValue(node.getLeft());
        }
        return node.getData();
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
 
    
   // to test the program 
    public static void main(String a[]) {
       
        Q10 bst = new Q10();
        // to inset data into the node 
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
        // to print output in ascending order 
        System.out.println("In-order Traverse:");
        bst.inOrderTraversal();
        
        System.out.println();
        //deleting the node
        bst.delete(9);
        bst.inOrderTraversal();
        
  
        
        
       
    }
}
