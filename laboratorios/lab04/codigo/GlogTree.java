package codigo;

/**
*@author Kevin Gutierrez
*/

public class GlogTree {

  Node root;

  public BinarySTree() {
    root = null;
  }

  public String GrandMa(String name) {
    Node aux = search(name);
    if (aux.Lson != null && aux.Lson.Lson != null) {
      return aux.Lson.Lson.name;
    }else {
      return "";
    }
  }

  public Node search(String name) {
    return search(root, name);
  }

  private Node search(Node node, String name) {

    if (nodo==null) {
        return node;
    }

    if (node.name.equals(name)) {
        return node;
    }

    Node right = buscar(node.Rson, name);
    if(right == null){
    return search(node.Lson, name);

    }else{
    return right;
    }
  }

  private void insert(Node node, String n, String name, String son) {

      Node aux = searh(son);
      if (n.equals("M")) {
          if (aux.Rson == null) {
              aux.Rson = new Node(n, name);
          }
      } else if (n.equals("W")) {
          aux.Lson = new Node(n, name);
      }
  }

  public void insert(String n, String name, String son) {
    if (root == null) {
        root = new Node(n, name);
    } else {
        insert(root, n, name, son);
    }
  }

  public void inorderTW(Node x) {
    if (x != null) {
      inorderTW(x.Lson);
      System.out.println(x.key);
      inorderTW(x.Rson);
    }
  }
  private class Node {
    public Node Lson;
    public Node Rson;
    public String data;
    public String name;

    public Node(String data, String name) {
      this.data = data;
      Lson = null;
      Rson = null;
      this.name = name;
    }
  }
}
