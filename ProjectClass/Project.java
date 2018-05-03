import java.util.*;

public class Project{
    private String nameProj;
    private String descProj;
    public Project (String nameProj, String descProj){
        this.nameProj = nameProj;
        this.descProj = descProj;
    }
    public Project (String nameProj){
        this(nameProj,"No Description provided");
    }
    public Project (){
        this("No name", "No description requested");
    }
    public HashMap<String, String> elevatorPitch(HashMap<String, String> nameAndProject){
        for (Map.Entry item : nameAndProject.entrySet()){
            System.out.println("Name: " + item.getKey() + " / Description: " + item.getValue());
        }
        return nameAndProject;
    }
}