import javafx.geometry.*;
import javafx.geometry.Point3D;

/**
 * Created by Joan on 05/10/2016.
 */
public class Cone extends Shape3D {


    private double height;
    private double radius;


    public Cone(Point3D refPoint, double height, double radius) {
        super(refPoint);
        this.height = height;
        this.radius = radius;
    }

    public double volume(){
        return (Math.PI*Math.pow(this.radius, 2.0)*this.height)/3;
    }

    public double surface(){
        return Math.PI*Math.pow(this.radius, 2.0);
    }
}
