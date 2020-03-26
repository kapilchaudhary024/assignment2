/*
 *  Created by IntelliJ IDEA.
 *  User: krishna kant sharma
 *  Date: 23-Mar-20
 *  Time: 12:15 PM
 */

// after execution we came to know case 1 is correct
// and case 2 is incurrect

package problem2.main;

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;

public class MyMain {
    public static void main(String[] args) {

        TraversalOperations t = new TraversalOperations();
        MyBinarySearchTree mst = new MyBinarySearchTree();
        TreeNode root = new TreeNode(10);
        mst.insert(root, 5);
        mst.insert(root, 1);
        mst.insert(root, 15);
        mst.insert(root, 9);
        mst.insert(root, 7);
        mst.insert(root, 12);
        mst.insert(root, 30);
        mst.insert(root, 25);
        mst.insert(root, 40);
        mst.insert(root, 45);
        mst.insert(root, 6);
        mst.insert(root, 3);
        t.printPreorder(root);
        System.out.println();
        t.printPostorder(root);
    }
}