/**
 * Class: TestDriver
 *
 * @author Chester Waye
 * @version 1.0 * Course : ITEC 3150, Spring 2021 Written: 4/15/2021
 * Written: January 18, 2012
 * <p>
 * <p>
 * This class –now describe what the class does
 * <p>
 * Purpose: –Describe the purpose of this class
 */

import java.io.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TestDriver {


    private static BinarySearchTree bst;

    public static void main(String[] args) throws FileNotFoundException {


        bst = new BinarySearchTree();
        // Load the tree from the file
        Set<String> documentWords = loadData("CarlAndTheCottonGin.txt");
        // Print the tree in order
        bst.printTree();
/*
        for (String word : documentWords)
        {

            System.out.println(word);

        }*/

    }

    public static Set<String> loadData(String fileName)
            throws FileNotFoundException
    {

        Set<String> words = new HashSet<String>();
        Scanner in = new Scanner(new File(fileName));



        // Use any characters other than a-z or A-Z as delimiters
        in.useDelimiter("[^a-zA-Z]+");
        while (in.hasNext())
        {
            bst.insertText(in.next());
            // words.add(in.next().toLowerCase());
        }
        return words;
    }
}
