package codigo;

/**
* @author Kevin Gutierrez
*/

public class lab04 {
  public static void main(String args[]) {
    GlogTree tree = new GlogTree();
    tree.insert('M',"Kevin", "");
    tree.insert('M',"Javier", "Kevin");
    tree.insert('W',"Flor", "Kevin");
    tree.insert('M',"Ansizar", "Javier");
    tree.insert('W',"Nubia", "Javier");
    tree.insert('M',"Jose", "Flor");
    tree.insert('W',"Elvia", "Flor");
    tree.insert('W',"Maria", "Elvia");

  }
}
