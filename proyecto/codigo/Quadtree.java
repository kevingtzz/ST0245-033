class Quadtree {

  public Rectangle boundary;
  public int capacity;
  public Point[] points;
  public boolean divided;
  public Quadtree northwest;
  public Quadtree northeast;
  public Quadtree southwest;
  public Quadtree southeast;


  public Quadtree(Rectangle boundary, int capacity) {
    this.boundary = boundary; //Rectangle limit
    this.capacity = capacity; //limit of point by rectangle;
    this.points   = new Point[capacity * 2]; //save
    this.divided  = false;
  }

  public void subdivide() {
    int x = this.boundary.x; //lo que se necesita es la coordenada x del quadtree a dividir
    int y = this.boundary.y;//lo mismo para las demas
    int w = this.boundary.w;
    int h = this.boundary.h;
    Rectangle nw = new Rectangle(x - w/2, y + h/2, w/2, h/2);//la coordenada x se encuetra en el centro del rectangulo por lo tanto la nueva x será x - el ancho del rectangulo a dividir divido 2
    Quadtree northwest = new Quadtree(nw, this.capacity);
    Rectangle ne = new Rectangle(x + w/2, y + h/2, w/2, h/2);
    Quadtree northeast = new Quadtree(ne, this.capacity);
    Rectangle sw = new Rectangle(x - w/2, y - h/2, w/2, h/2);
    Quadtree southwest = new Quadtree(sw, this.capacity);
    Rectangle se = new Rectangle(x + w/2, y - h/2, w/2, h/2);
    Quadtree southeast = new Quadtree(se, this.capacity);
    this.divided = true;
  }

  public boolean insert(Point point) {
    int i = 0;
    if (!this.boundary.contains(point)) {
      return false;// este condicional verifica si el rectangulo generado por la divicion contiene puntos, si no lo contiene no hay necesidad de insertar puesto que solo se debe insertar en uno de los rectangos generados en la divicion
    }
    if (this.points.length < this.capacity) {
      this.points[0] = point;
      ++i;
      return true;
    } else {
      if (!this.divided) {
        this.subdivide();
      }
      if (this.northwest.insert(point)) {
        return true;
      }//el punto se insertará en uno de estos rectangulos
      else if (this.northeast.insert(point)) {
        return true;
      }
      else if (this.southwest.insert(point)) {
        return true;
      }
      else if (this.southeast.insert(point)) {
        return true;
      }
    }
    return false;
  }
}
