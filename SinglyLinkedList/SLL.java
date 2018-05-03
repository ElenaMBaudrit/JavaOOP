import java.util.*;

public class SLL{
    private Node head; 

    public SLL(){
        head = null;
    }
    public SLL add(int num){ //Just for the kicks, in order to return a value. The exercise's instructions do not mention that anything must be returned.
        Node toAdd =  new Node(num); 
        if (head == null){
            head = toAdd;
            return this;
        }
        Node pointer = head;
        while (pointer.getNext() != null){
            pointer = pointer.getNext();
        }
        pointer.setNext(toAdd);
        return this;
    }
    public SLL remove(){ // we are not using any arguments for this one.
        if (head == null){
            return this;
        }
        Node pointer = head;
        while (pointer.getNext().getNext() != null){ // This will prevent us to fall unto the unknown (AKA 'Null Space').
            pointer = pointer.getNext();
        }
        pointer.setNext(null);
        return this;
    }
    public void printValues(){
        Node pointer = head;
        while (pointer != null){
            System.out.println(pointer.getValue()); //The name of the method created to use the private int value en Node.java here.
            pointer = pointer.getNext();
        }
    }
}