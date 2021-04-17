import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Class: BST
 *
 * @author Chester Waye
 * @version 1.0 * Course : ITEC 3150, Spring 2021 Written: 4/16/2021
 * <p>
 * <p>
 * <p>
 * This class –now describe what the class does
 * <p>
 * Purpose: –Describe the purpose of this class
 */

public class BST
{
    Node root;

    public void addNode(String words, int count) {

        //Create a new Node and initialize it
        Words fWord = new Words( words, count);
        Node newNode = new Node(fWord);

        //if there is no root this becomes the root
        if (root == null) {
            root = newNode;
        } else {

            //Set root as the Node we will start
            //with as we traverse the tree
            Node focusNode = root;

            //Future parent for our new Node
            Node parent;

            while (true) {

                //root is the top parent so we start there
                parent = focusNode;

                //check if the new node should go on the left side of the parent
                if (newNode.fileWords.getWords().compareToIgnoreCase(focusNode.fileWords.getWords()) > 0) {

                    //Switch focus to the left child
                    focusNode = focusNode.leftChild;

                    //if the left child has no children
                    if (focusNode == null) {

                        //then place the new node on the left of it
                        parent.leftChild = newNode;
                        return; // all done
                    }
                } else if (newNode.fileWords.getWords().compareToIgnoreCase(focusNode.fileWords.getWords()) < 0) { // if we get here put the node on the right

                    focusNode = focusNode.rightChild;

                    //if the right child has no children
                    if (focusNode == null) {
                        //then place the new node on the right of it
                        parent.rightChild = newNode;
                        return; // All Done
                    }
                } else {
                    int c = focusNode.fileWords.getCount();
                    focusNode.fileWords.setCount(c + 1);
                    return;
                }
            }
        }
    }


    // print nodes Inorder traversal
    private void printNodes(Node node)
    {
        if (node != null) {
            printNodes((node.leftChild));
            System.out.printf( "%-6s" ,node.fileWords + "\n");
            printNodes(node.rightChild);
        }
    }

    // public wrapper to call from outside
    public void printTree()
    {
        printNodes(root);
    }

}

