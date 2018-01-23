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

    fecha.showDate();
  //  System.out.println(fecha.getDay());
  //  System.out.println(fecha.getMonth());
  //  System.out.println(fecha.getYear());
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

    class Date {                                                               //Punto 3 del taller

      private int day;
      private int month;
      private int year;

      public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
      }

      public int getDay() {
        return day;
      }

      public int getMonth() {
        return month;
      }

      public int getYear() {
        return year;
      }

      public void showDate() {
        System.out.println(day + "/" + month + "/" + year);
      }

    }
