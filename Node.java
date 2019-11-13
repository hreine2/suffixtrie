public class Node {

    char leadingChar;
    String label;
    boolean isWord;
    Node RightSibling;
    Node FirstChild;

    public Node(String suffix) {
        label = suffix;
        leadingChar = (char) suffix.substring(0,1);
    }

}