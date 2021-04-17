/**
 * Class: Words
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
public class Words implements Comparable<Words> {

   private String words;
    private int count;

    public Words(String words, int count) {
        this.words = words;
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }

    @Override
    public int compareTo(Words o) {

        return this.words.compareToIgnoreCase(o.getWords());
    }

    @Override
    public String toString() {
        return
                "word = " + words  +
                ", count = " + count;
    }
}
