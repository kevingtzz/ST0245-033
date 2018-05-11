public class Particle {

  private float x;
  private float y;
  private float r;
  private boolean highlight;

  public Particle(float x, float y) {
    this.x = x;
    this.y = y;
    this.r = 4; //radio de la particula
    this.highlight = false;
  }

  public double intersects(Particle otherP) { //Calculate the dis between two points.
    double hypotenuse = Math.hypot(this.x - otherP.x, this.y - otherP.y);
    return hypotenuse;
  }

  public void setHighlight(boolean value) {
    this.highlight = value;
  }
}
