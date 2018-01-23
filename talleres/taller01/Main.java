public class Main {

    public static void main (String args []) {

	String cont = "contador";

	Punto2D punto = new Punto2D(15,23);
	Counter count = new Counter(cont);
  Date fecha = new Date(7,11,1998);

	for (int i = 0; i < 10; ++i) {
	    count.incrementar();
	}

	System.out.println("El numero de incrementos es: " + count.incrementos());
	System.out.println("El radio es: " + punto.radio());
	System.out.println("La distancia euclidiana es: " + punto.distacia(5,10));
	System.out.println("El angulo es: " + punto.angulo());
    }

}


  class Punto2D {                                                               //Punto 2 de el taller.

      private float x;
      private float y;

      Punto2D(float x, float y) {
  	     this.x = x;
  	     this.y = y;
      }

      double radio() {
        return Math.sqrt((x * y) + (y * y));
      }

      double angulo() {
        return Math.atan2(x , y);
      }

      double distacia (int x2, int y2) {
          return Math.sqrt(Math.pow((x - x2), 2) + Math.pow((y - y2), 2));
      }

      public float getX() {
  	return x;
      }
      public float getY() {
  	return y;
     }
  }

  class Counter {                                                               //Punto 1 de el taller.

      String id;
      private int count = 0;

      public Counter(String id) {
  	this.id = id;
      }

      public void incrementar() {
  	++count;
      }

      public int incrementos() {
  	return count;
      }

      public String toString() {
  	return id + ": " + count;
      }

    }

public class fecha {
    private String day;
    private String month;
    private String year;
    private String cadena;
    
    public fecha(String day, String month, String year){
        this.day = day;
        this.month = month;
        this.year = year;
        cadena= year+month+day;
    }
    public String getDay(){
        return day;
    }
    
    public String getCadena(){
        return cadena;
    }
    
    public String getMonth(){
        return month;
    }
    
    public String getYear(){
        return year;
    }
    
    public String comparar(fecha cadena1,fecha cadena2){
           
            if(Integer.parseInt(cadena1.getCadena()) > Integer.parseInt(cadena2.getCadena()))
                return "La primera fecha es mayor que la segunda";
            
            if(cadena1.getCadena().equals(cadena2.getCadena()))
                return "Ambas fechas son iguales";
            
           return "La primera fecha es menor que la segunda";
    }
