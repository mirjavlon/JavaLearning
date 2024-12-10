package Point;

public class Point {

    private int x;
    private int y;

    public Point() {}

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        double a = (getX() - 0)*(getX() - 0) + (getY() - 0)*(getY()-0);
        return Math.sqrt(a);
    }

    public double distance(Point param) {
       return distance(param.x,param.y);
    }

    public double distance(int x, int y) {
        double a = ((getX() - x) * (getX()- x) + (getY() - y) * (getY() - y));
        return Math.sqrt(a);
    }
}
