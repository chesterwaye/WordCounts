/**
 * Class: Node
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
public class Node {
     Words fileWords;
     Node leftChild;
     Node rightChild;

    Node(Words fileWords) {
        this.fileWords = fileWords;
    }

    public Words getFileWords() {
        return fileWords;
    }

}
