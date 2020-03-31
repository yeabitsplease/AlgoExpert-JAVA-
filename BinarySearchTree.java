/*
Create a Binary Search Tree.
Add 50,25,15,45,75,65,85 to it.

*/



public class BinarySearchTree {
    


    class Node { 
        int key; 
        Node left, right; 
  
        public Node(int item) { 
            key = item; 
            left = right = null; 
        } 
    } 
  
   
    Node root; 
  
   
    BinarySearchTree() {  
        root = null;  
    } 
  
   
    void insert(int key) { 
       root = insertRecord(root, key); 
    } 
      
   
    Node insertRecord(Node root, int key) { 
  
   
        if (root == null) { 
            root = new Node(key); 
            return root; 
        } 
  
    
        if (key < root.key) 
            root.left = insertRecord(root.left, key); 
        else if (key > root.key) 
            root.right = insertRecord(root.right, key); 
  
    
        return root; 
    } 
  
   
  
    
    
    public Node search(Node root, int key) 
{ 
  
    if (root==null || root.key==key) 
        return root; 
  
  
    if (root.key > key) 
        return search(root.left, key); 
  
  
    return search(root.right, key); 
} 
 
    public static void main(String[] args) { 
        BinarySearchTree tree = new BinarySearchTree(); 
  
        /* Let us create following BST 
              50 
           /     \ 
          25      75
         /  \    /  \ 
       15   45  65   85 */
        tree.insert(50); 
        tree.insert(25); 
        tree.insert(15); 
        tree.insert(45); 
        tree.insert(75); 
        tree.insert(65); 
        tree.insert(85); 
  
      
  } 
} 


