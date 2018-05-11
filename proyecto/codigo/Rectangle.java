class Rectangle {

  public int x;
  public int y;
  public int w;
  public int h;

  public Rectangle(int x, int y, int w, int h) {
    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;
  }

  public boolean contains(Point point) {
    return (point.x >= this.x - this.w &&  //this function check the point is into the rectangle.
            point.x <= this.x + this.w &&
            point.y >= this.y - this.h &&
            point.y <= this.y + this.h);
  }

  public boolean intersects(Rectangle range) {
    return !(range.x - range.w > this.x + this.w ||
            range.x + range.w < this.x - this.w ||
            range.y - range.h > this.y + this.h ||
            range.y + range.h < this.y - this.h);
  }
}
