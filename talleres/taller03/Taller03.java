public class Taller03 {

    public static void hanoi (int n, String origin, String intermediate, String destiny) {
	if (n == 1) {
	    System.out.println(origin + " to " + destiny);
	}else {
	    hanoi (n - 1, origin, destiny, intermediate);
	    System.out.println(origin + " to " + destiny);
	    hanoi (n - 1, intermediate, origin, destiny);
	    System.out.println("juego completado");
	}
    }

    public static void combinations(String base, String s) {
      if (s.length() == 0) { System.out.println(base);
      }else {
        combinations(base + s.charAt(0), s.substring(1));
        combinations(base, s.substring(1));
      }
    }

    public static void permutations (String base, String s) {
      if (s.length() == 0) System.out.println(base);
      for (int i = 0; i < s.length(); ++i) {
        permutations(base + s.charAt(i), s.substring(0,i) + s.substring(i+1));
      }
    }

  public static void main (String args []) {
	   Taller03 hanoi = new Taller03();
	   hanoi (3, "torre1", "torre2", "torre3");
     permutations("", "abc");
    }
}
