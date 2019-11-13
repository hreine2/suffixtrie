public class LinkedList
{

    /*class Node {

        public Object data; //stores Object data in list
        public Node next; //reference to next node in link list
        //public Node prev;// possibly used for a doubly linked list or to iterate in reverse
    }*/
    private Node first; //reference to head of the list

    /**
     * constructor, instantiates the link list
     */
    public LinkedList() {
        first = null;
    }

    /**
     * Adds the new Object to the end of the list
     *
     * @param Movie, the movies in the list being added
     */
    public void add(Comparable Movie)
    {
        Node newNode = new Node();
        newNode.data = Movie;
        newNode.next = null;

        if(first == null ) { //add first object to the head of the list
            first = newNode;
        }
        else
        { //there is already an object/objects in the list
            Node ref = first;
            while (ref.next != null)
            {
                ref = ref.next;	//loop until ref to next node is null
            }
            ref.next = newNode; //add the new movie object
        }
    }

    /**
     * Accessor, gets the number of objects in the list,
     * used to initialize array size
     *
     * @return integer
     */
    public int getSize() {
        int count = 0;
        Node ref = first;

        if(first != null){
            count++;
            while(ref.next!= null){
                count++;
                ref = ref.next;
            }
        }
        return count;
    }

    /**
     * Calls the toString method of the data stored in the link list
     *
     * @return string of movies
     */
    @Override
    public String toString() {
        String testS = "";
        Node ref = first;
        while(ref.next != null )
        {
            testS += String.format("%s%n", ref.data.toString());
            ref = ref.next;
        }
        testS += String.format("%s%n", ref.data.toString()); //concatenate last movie to string after loop ends, since end of link list has a null reference
        return testS;
    }


    /**
     * an array to store the link list in,
     * will be used to merge the 2 list
     *
     * @param movieList, the list input by the user
     * @return an Array
     */
    public Comparable[] toArray(LinkList movieList) {
        Comparable[] movies = new Comparable[movieList.getSize()];
        int i = 0;
        Node ref = first;
        while(ref.next != null )
        {
            movies[i] =  (Comparable) ref.data; //cast to comparable type
            ref = ref.next;
            i++;
        }
        movies[i] = (Comparable) ref.data;
        return movies;
    }
}

