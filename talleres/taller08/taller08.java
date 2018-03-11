import java.util.*;

public class taller08 {
    public static void main (String args[]) {
      Stack stack = new Stack();
      Stack stack_aux = new Stack();

      for(int i = 50; i >= 0; --i) {
        stack.push(i);
        System.out.print(i + ", ");
      }
      System.out.println();
      System.out.println("--------------------------------------");

      while (stack.empty() == false) {
        stack_aux.push(stack.pop());
        System.out.print(stack_aux.peek() + ", ");
      }
      stack = stack_aux;
      System.out.println();

      //::::::::::::::::::::::::::::::::LinkedList:::::::::::::::::::::::::::::::\\

      LinkedList<String> queue = new LinkedList<String>();
      queue.add("Juan");
      queue.add("Maria");
      queue.add("Pedro");

      for (String cliente : queue) {
        System.out.println(cliente + " fue atendid@.");
      }

    }
}
