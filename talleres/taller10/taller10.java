class Nodo {
  public int dato;
  public Nodo izquierda;
  public Nodo derecha;
}
class Arbol {
  private Nodo raiz;
    private void insertar(Nodo nodo, int n){
    if (nodo.dato == n)
      return;
    if (n > nodo.dato)
       if (nodo.derecha == null)
       else
    if (n < nodo.dato)
         if (nodo.izquierda == null)
         else

  }
  public void insertar(int n){
    insertar(raiz,n);
  }
  private boolean buscar(Nodo nodo, int n){
    if (nodo.dato == n)
      return true;
    if (nodo == null)
      return false;
    if (n > nodo.dato){
      return buscar(nodo.derecha, n);}
    return buscar(nodo.izquierda, n);
  }
  public boolean buscar(int n){
    buscar(raiz,n);
  }
}
