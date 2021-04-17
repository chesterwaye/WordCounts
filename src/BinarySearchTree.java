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
        Node left;
        Node right;

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

    private Node insert(Node node, String textFile)
    {
        if (node == null)
            node = new Node(textFile);
        else
        {
            if (textFile.compareToIgnoreCase(node.getData()) > 0)
                node.left = insert(node.left, textFile);
            else if (textFile.compareToIgnoreCase(node.getData()) < 0)
                node.right = insert(node.right, textFile);
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

    // print nodes Inorder traversal
    private void printNodes(Node node)
    {
        if (node != null) {
            printNodes((node.left));
            System.out.println("word=" + node.getData()+ ", count=" + node.getCount());
            printNodes(node.right);
        }
    }

    // public wrapper to call from outside
    public void printTree()
    {
        printNodes(rootNode);
    }
}
