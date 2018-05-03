import java.util.*;

public class ProjectTest{
    public static void main(String[] args){
    HashMap<String, String> nameDescr = new HashMap<>();
    Project printIt = new Project();
    nameDescr.put ("Bacon Ipsum", "Prosciutto biltong tenderloin shankle salami t-bone pig pork belly corned beef. Meatloaf pig boudin t-bone, bacon pastrami kevin filet mignon biltong shank turducken corned beef beef ribs prosciutto. Ribeye landjaeger shank beef sirloin bresaola fatback. Corned beef chuck tongue porchetta salami pork belly tail pig meatball.");
    printIt.elevatorPitch(nameDescr);
    }
}