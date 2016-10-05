/**
 * Created by Joan on 05/10/2016.
 */
public class Point3D extends Point2D {

    private double z;


    public boolean isOrigin() {
        if (super.isOrigin() && (this.z == 0.0)){
            return true;
        }
        else{
            return false;
        }
    }


    public void translate(double dx, double dy, double dz) {
        super.translate(dx, dy);
        this.z = dz;
    }


    public double distance(Point3D other) {
        return Math.sqrt(Math.pow((super.x - other.x), 2.0)+Math.pow((super.y - other.y), 2.0)+(Math.pow((this.z - other.z), 2.0)));
    }


}
