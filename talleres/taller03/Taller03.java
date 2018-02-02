public class Taller03 {

    public static void hanoi_Aux (int n, String origin, String intermediate, String destiny) {
	if (n == 1) {
	    System.out.println(origin + " to " + destiny);
	}else {
	    hanoi_Aux (n - 1, origin, destiny, intermediate);
	    System.out.println(origin + " to " + destiny);
	    hanoi_Aux (n - 1, intermediate, origin, destiny);
	    System.out.println("juego completado");
	} 
    }

    public static void main (String args []) {
	Taller03 hanoi = new Taller03();
	hanoi_Aux(5, "torre1", "torre2", "torre3");
    }
}
