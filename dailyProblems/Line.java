public class Line {
  Point p;  
  double length; 

  public Line(Point p) {
      this.p = p;
      this.length = p.calculateLength(); 
  }

  public static void main(String[] args) {
      Point p1 = new Point(2, 3, 8, 3); 
      Point p2 = new Point(1, 2, 6, 5);  

      Line l1 = new Line(p1);
      Line l2 = new Line(p2);

      System.out.println("L1 Length: " + l1.length);
      System.out.println("L2 Length: " + l2.length);

      if (l1.length > l2.length) {
          System.out.println("L1 is longer than L2");
      } else if (l1.length < l2.length) {
          System.out.println("L2 is longer than L1");
      } else {
          System.out.println("L1 and L2 are of equal length");
      }
  }
}

class Point {
  private int startX, startY;
  private int endX, endY;

  public Point(int startX, int startY, int endX, int endY) {
      this.startX = startX;
      this.startY = startY;
      this.endX = endX;
      this.endY = endY;
  }

  public double calculateLength() {
      return Math.sqrt(Math.pow((endX - startX), 2) + Math.pow((endY - startY), 2));
  }

  public int getStartX() { return startX; }
  public int getStartY() { return startY; }
  public int getEndX() { return endX; }
  public int getEndY() { return endY; }
}
