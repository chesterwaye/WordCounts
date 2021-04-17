import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Class: MyDriver
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
public class MyDriver {
    private static BST bst;

    public static void textFile(String fileName)
            throws FileNotFoundException
    {

        Scanner in = new Scanner(new File(fileName));

        // Use any characters other than a-z or A-Z as delimiters
        in.useDelimiter("[^a-zA-Z]+");
        while (in.hasNext())
        {
            bst.addNode(in.next(),1 );

        }

    }
    public static void printHeader() {

        System.out.printf("Word %23s", "Count\n");

    }


    public static void main(String[] args) throws FileNotFoundException {

        bst = new BST();
        textFile("CarlAndTheCottonGin.txt");
        printHeader();;
        bst.printTree();

    }

}
