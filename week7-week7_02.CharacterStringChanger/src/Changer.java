import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Unicron
 */
public class Changer {
    
    ArrayList<Change> changes = new ArrayList<Change>();
    
    public Changer(){
        changes = new ArrayList<Change>();
    }
    
    public void addChange(Change change){
        changes.add(change);
    }
    
    public String change(String characterString){
        for (Change Change : changes) {
            characterString = Change.change(characterString);
        }
    return characterString;
    }
}
