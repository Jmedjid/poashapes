/**
 * Created by Joan on 05/10/2016.
 */
public class Point2D {

    protected double x;
    protected double y;

    public Point2D (){
        this(0,0);
    }

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point2D point2d = (Point2D) o;

        if(Double.compare(point2d.x,x) != 0) return false;
        return Double.compare(point2d.y, y)==0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(x);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(y);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public void translate (double tx, double ty){
        this.x = this.x + tx;
        this.y = this.y + ty;
    }

    public boolean isOrigin (){
        if(this.x == 0.0 && this.y == 0.0){
            return true;
        }
        else{
            return false;
        }
    }

    public double distance(Point2D point) {
        double tx = this.x - point.x;
        double ty = this.y - point.y;
        double distance = Math.sqrt(tx * tx + ty * ty);
        return distance;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
