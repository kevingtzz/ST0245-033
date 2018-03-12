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
      int len = queue.size();
      for (int i = 0; i < len; ++i) {
        System.out.println(queue.remove() + " fue atendid@.");
      }

      //::::::::::::::::::::::::::::::Notacion Polaca::::::::::::::::::::::::::::\\



    Stack<Integer> stacks = new Stack<>();
    String string = "3 10 5 + *";
    String buff[] = string.split(" ");

    for (int i = 0; i < buff.length; i++) {
        String current = buff[i];
        if (!taller08.isOperator(current)) {
            stacks.push(Integer.parseInt(current));
        } else {
            int fact2 = stacks.pop();
            int fact1 = stacks.pop();
            stacks.push(taller08.oper(current, fact1, fact2));
        }
    }

    System.out.println(stacks.pop());
  }

  public static int oper(String operator, int fact1, int fact2) {
    switch (operator) {
      case "+": return fact1 + fact2;
      case "-": return fact1 - fact2;
      case "*": return fact1 * fact2;
      default: return fact1 / fact2;
    }
  }

    public static boolean isOperator(String str) {
      return str.equals("+")
      || str.equals("-")
      || str.equals("*")
      || str.equals("/");
    }
}
