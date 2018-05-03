import java.util.*;

public class SLLTest{
    public static void main(String[] args){
        SLL singLL =  new SLL();
        singLL.add(6); //The datatype needed here is an int. 
        singLL.add(10);
        singLL.add(1);
        singLL.add(3);
        singLL.add(7);
        singLL.add(2);
        singLL.add(8);
        singLL.printValues();
    }
}