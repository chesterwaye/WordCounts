/**
 * Class: BinarySearchTree
 *
 * @author Chester Waye
 * @version 1.0 * Course : ITEC 3150, Spring 2021 Written: 4/15/2021
 *
 * <p>
 * <p>
 * This class –now describe what the class does
 * <p>
 * Purpose: –Describe the purpose of this class
 */
public class BinarySearchTree {
    /* Class Node */
    class Node
    {
        String data;
        int count;
        Node left, right;

        /* Constructor */
        public Node()
        {
            left = null;
            right = null;
            data = "";
            count=1;
        }

        /* Constructors */
        public Node(String text)
        {
            left = null;
            right = null;
            data = text;
            count=1;
        }


        /**
         * @return the data
         */
        public String getData() {
            return data;
        }

        /**
         * @param data the data to set
         */
        public void setData(String data) {
            this.data = data;
        }

        /**
         * @return the left
         */
        public Node getLeft() {
            return left;
        }

        /**
         * @param left the left to set
         */
        public void setLeft(Node left) {
            this.left = left;
        }

        /**
         * @return the right
         */
        public Node getRight() {
            return right;
        }

        /**
         * @param right the right to set
         */
        public void setRight(Node right) {
            this.right = right;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }
    }

    private Node rootNode;
    public BinarySearchTree()
    {
        rootNode = null;
    }

    private Node insert(Node node, String text)
    {
        if (node == null)
            node = new Node(text);
        else
        {
            if (text.compareToIgnoreCase(node.getData()) > 0)
                node.left = insert(node.left, text);
            else if (text.compareToIgnoreCase(node.getData()) < 0)
                node.right = insert(node.right, text);
            else
            {
                int count = node.getCount();
                node.setCount(count + 1);
            }
        }
        return node;
    }

    // wrapper for the BTSDriver class
    public void insertText(String text)
    {
        rootNode = insert(rootNode, text);
    }

    // print nodes In order traversal
    private void printNodes(Node node)
    {
        if (node == null)
        {}
        else
        {
            printNodes(node.getLeft());
            System.out.println("word=" + node.getData()+ ", count=" + node.getCount());
            printNodes(node.getRight());
        }
    }

    // public wrapper to call from outside
    public void printTree()
    {
        printNodes(rootNode);
    }
}
