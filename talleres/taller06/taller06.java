/*
*@author Kevin Gutierrez Gomez
*@version 1.0
*/

class ArrayList<T> {
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

  public T get(int i) throws Exception {
    if (i < size && i >= 0) {
      return elements[i];
    } else {
    throw new Exception("Out of bounds "+i);
    }
  }

  public void add(T e) {
    add(size,e);
  }


  public void add(int index, T e) {
    if (size == elements.length) {
      T[] arraytmp = (T[]) new Object[size*2];
      for (int i = 0; i < size; ++i) {
        arraytmp[i] = elements[i];
      }
      elements = arraytmp;
    }
    for (int i = size; i > index; --i) {
      elements[i] = elements[i-1];
    }
    elements[index] = e;
    size++;
  }
}
