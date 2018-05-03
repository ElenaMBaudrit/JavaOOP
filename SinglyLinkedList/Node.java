import java.util.*;

public class Node{
    private int value;
    private Node next;

    public Node(int number){
        value =  number; //'this' could be used, but, in this case, the parameters are named different, therefore, the probability of a mistake is lower.
        next = null;
    }

    public Node getNext(){
        return next;
    }
    public void setNext(Node n){
        next = n;
    }
    public int getValue(){ //This is to be able to use the 'private int value' above in the SLL.java file
        return value;

    }
}