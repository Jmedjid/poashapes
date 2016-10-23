/**
 * Created by Joan on 05/10/2016.
 */
public class Point3D extends Point2D {

    private double z;

    public Point3D() {
        this(0,0,0);
    }

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }


    public void translate(double dx, double dy, double dz) {
        super.translate(dx, dy);
        this.z = z + dz;
    }

    public boolean isOrigin() {
        return super.isOrigin() && this.z == 0.0;
    }

    public double distance(Point3D other) {
        return Math.sqrt(Math.pow(other.getX() - getX(), 2) + Math.pow(other.getY() - getY(), 2) + Math.pow(other.getZ() - getZ(), 2));
    }

    public double getZ() {
        return z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point3D)) return false;
        if (!super.equals(o)) return false;

        Point3D point3D = (Point3D) o;

        return Double.compare(point3D.getZ(), getZ()) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(z);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + getX() +
                "y=" + getY() +
                "z=" + z +
                '}';
    }
}
