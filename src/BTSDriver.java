/**
 * Class: BTSDriver
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


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class BTSDriver {

    private static BinarySearchTree bst;

    public static void textFile(String fileName)
            throws FileNotFoundException
    {

          Scanner in = new Scanner(new File(fileName));

        // Use any characters other than a-z or A-Z as delimiters
        in.useDelimiter("[^a-zA-Z]+");
        while (in.hasNext())
        {
            bst.insertText(in.next());

        }

    }


    public static void main(String[] args) throws FileNotFoundException {


        bst = new BinarySearchTree();
        // Load the tree from the file
        textFile("CarlAndTheCottonGin.txt");
        // Print the tree in order
        bst.printTree();

    }

}
