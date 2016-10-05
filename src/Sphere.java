import javafx.geometry.*;

/**
 * Created by Joan on 05/10/2016.
 */
public class Sphere extends Shape3D {


    private double radius;


    public Sphere(javafx.geometry.Point3D refPoint, double radius) {
        super(refPoint);
        this.radius = radius;
    }

    @Override
    public double volume() {
        return ((4*Math.PI*Math.pow(this.radius, 3.0))/3);
    }

    @Override
    public double surface() {
        return 0;
    }



}
