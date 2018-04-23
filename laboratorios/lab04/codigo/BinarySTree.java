package codigo;

/**
*@author Kevin Gutierrez
*/

public class BinarySTree {

  Node root;

  public BinarySTree() {
    root = null;
  }

  public void insert(int key, Object value) {
    Node n = new Node(key);
    n.value = value;
    if (root == null) {
      root = n;
    } else {
      Node tmp = root;
      while (tmp != null) {
        n.father = tmp;
        if (n.key >= tmp.key) {
          tmp = tmp.Rson;
        } else {
          tmp = tmp.Lson;
        }
      }
      if (n.key < n.father.key) {
        n.father.Lson = n;
      } else {
        n.father.Rson = n;
      }
    }
  }

  public void inOrderTW(Node x) {
    if (x != null) {
      inOrderTW(x.Lson);
      System.out.println(x.key);
      inOrderTW(x.Rson);
    }
  }

  public static void posOrden(Nodo root) {
    if (root == null) {
        return;
    }
    posOrden(root.Lson);
    posOrden(root.Rson);
    System.out.println(root.value);
}

  public void posOrderTW

  private class Node {
    public Node father;
    public Node Lson;
    public Node Rson;
    public int key;
    public Object value;

    public Node(int key) {
      this.key = key;
      father = null;
      Lson = null;
      Rson = null;
      value = null;
    }
  }
}
