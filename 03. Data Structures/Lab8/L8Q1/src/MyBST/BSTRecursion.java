// Binary Search Tree using recursion

// Time Complexity
// // Insertion, Deletion, Search := O(H), H - height of the tree
// // Traversals := O(N), N - number of nodes in the tree

// Space Complexity
// // Insertion, Deletion, Search, Traversals := O(H), H - height of the tree

package MyBST;

public class BSTRecursion {
    Node root;
    
    // Constructor
    public BSTRecursion(){
        root = null;
    }
    
    // Getters
    public Node getRoot(){
        return root;
    }
    
    //************************************************************//
    
    // Util Functions
    
    // 1. Modification Functions
    // // 1.1 Insertion
    public Node insertRecursion(Node root, int data){
        Node newNode = new Node(data);
        
        if(root == null){
            root = newNode;
            return root;
        }
        
        if(data < root.getData()){
            root.left = insertRecursion(root.left, data); 
        }
        else if(data > root.getData()){
            root.right = insertRecursion(root.right, data);
        }
        
        // duplicates not allowed
        
        return root;
    }
    
    // // 1.2 Deletion
    // // // 1.2.1 MinNode 
    public Node minNode(Node root){
        Node minNode = root;
        while(root.left!=null){
            minNode = root;
            root = root.left;
        }
        
        return minNode; // leftmost node
    }
    
    // // // 1.2.2 Deletion function
    public Node deleteRecursion(Node root, int key){
        if(root==null){
            return root;
        }
        
        if(root.getData() < key){
            root.right = deleteRecursion(root.right, key);
        }
        else if(root.getData() > key){
            root.left = deleteRecursion(root.left, key);
        }
        // key has been found
        else{
            // Left Node or Node with one child
            if(root.left==null){
                return root.right; // if leaf, then this will be null
            }
            else if(root.right==null){
                return root.left; // if leaf, then this will be null
            }
            
            // Node with two children
            // // Get the smallest in the right tree (inorder successor)
            Node inorderSuccessor = minNode(root.right);
            
            // // Set the current value to the inorder successor value
            root.setData(inorderSuccessor.getData());
            
            // // delete the inorder successor as the value has been set
            root.right = deleteRecursion(root.right, inorderSuccessor.getData());
        }
        
        return root;
    }
    
    // 2. Boolean Results
    // // 2.1 Searching
    public boolean searchRecursion(Node root, int key){
        if(root == null){
            return false;
        }
        
        if(root.getData() == key){
            return true;
        }
        else if(root.getData() < key){
            return searchRecursion(root.right, key);
        }
        else{
            return searchRecursion(root.left, key);
        }
    }
    
    // // 2.2 Is BST Helper Function
    public static boolean isBSTUtil(Node root, int min, int max){
        if(root==null){
            return true;
        }
        
        if(root.getData() < min || root.getData() > max){
            return false;
        }
        
        return isBSTUtil(root.left, min, root.getData()-1) && isBSTUtil(root.right, root.getData()+1, max);
    }
    
    // 3. Traversals
    // // 3.1 Top view
    // // // 3.1.1 Left Top View
    public void printLeftTopView(Node root){
        if(root==null){
            return;
        }
        
        System.out.print(root.getData() + " ");
        printLeftTopView(root.left);
    }
    
    // // // 3.1.2 Right Top View
    public void printRightTopView(Node root){
        if(root==null){
            return;
        }
        
        System.out.print(root.getData() + " ");
        printRightTopView(root.right);
    }
    
    //************************************************************//
    
    // User Functions
    // 1. Modification
    // // 1.1 Insertion
    public void insert(int data){
        root = insertRecursion(root, data);
    }
    
    // // 1.2 Deletion
    public void delete(int key){
        root = deleteRecursion(root, key);
    }
    
    // 2. Boolean Results
    // // 2.1 Searching an element
    public boolean search(int key){
        return searchRecursion(root, key);
    }
    
    // // 2.2 Static isBST()
    public static boolean isBST(Node root){
        return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    // 3. Traversals
    // // 3.1 Inorder
    public void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.getData() + " ");
            inorder(root.right);
        }
    }
    
    // // 3.2 Preorder
    public void preorder(Node root){
        if(root!=null){
            System.out.print(root.getData() + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    
    // // 3.3 Postorder
    public void postorder(Node root){
        if(root!=null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.getData() + " ");
        }
    }
    
    // // 3.4 Top View
    public void printTopView(){
        if(root==null){
            return;
        }
        
        System.out.println(root.getData() + " ");
        
        printLeftTopView(root.left);
        printRightTopView(root.right);
    }
    
    // // 3.5 Count of nodes
    public int countNodes(Node root){
        if(root==null){
            return 0;
        }
        
        return 1+countNodes(root.left) + countNodes(root.right);
    }
    
    // // 3.6 Height of tree
    public int height(Node root){
        if(root==null){
            return 0;
        }
        
        return 1 + Math.max(height(root.left), height(root.right));
    }
    
    // // 3.7 Count Leaves
    public int countLeaves(Node root){
        if(root==null){
            return 0;
        }
        
        if(root.left == null && root.right==null){
            return 1;
        }
        
        return countLeaves(root.left) + countLeaves(root.right);
    }
}
