package l8q1;

import MyBST.*;

public class L8Q1 {
    public static void main(String[] args) {
        BSTRecursion bst1 = new BSTRecursion();
        
        bst1.insert(5);
        bst1.insert(1);
        bst1.insert(4);
        bst1.insert(2);
        bst1.insert(3);
        
        bst1.inorder(bst1.getRoot());
        System.out.println();
        
        bst1.delete(4);
        
        bst1.inorder(bst1.getRoot());
        System.out.println();
        
        // Top View
        bst1.printTopView();
        
        // IsBST
        System.out.println(BSTRecursion.isBST(bst1.getRoot()));
        
        // # Nodes
        System.out.println(bst1.countNodes(bst1.getRoot()));
        
        // Height
        System.out.println(bst1.height(bst1.getRoot()));
        
        // Count leaves
        System.out.println(bst1.countLeaves(bst1.getRoot()));
    }
    
}
