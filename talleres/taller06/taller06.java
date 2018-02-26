/*
*@author Kevin Gutierrez Gomez
*@version 1.0
*/

public class ArrayList<T> {
  private int size;
  private static final int DEFAULT_CAPACITY = 10;
  private T elements[];

  public ArrayList() {
    this.elements = (T[]) new Object[DEFAULT_CAPACITY];
    size = 0; // en realidad es un apuntador
  }

  public int size() { //objeto.size()
    return size;
  }

  public T get(int i) {
    return (i < size && i >= 0)
    ?elements[i]
    :trow new IndexOutOfBoundsException("Out of bounds "+i);
  }

  public void add(T e) {
    add(size,e);
  }


  public void add(int index, T e) {
    if (size == elements.length) {
      T[] arraytmp = (T[]) new object[size*2];
      for (int i = 0, i < size; ++i) {
        arraytmp[i] = elements[i];
      }
      elements = arraytmp;
    }
    for (int i = size; i > index; --i) {
      elements[i] = elements[i-1];
    }
    elements[index] = e;
  }
}
