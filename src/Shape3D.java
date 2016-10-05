import javafx.geometry.Point3D;

/**
 * Created by Joan on 05/10/2016.
 */
public abstract class Shape3D extends Shape{

    private Point3D refPoint;

    public Shape3D(Point3D refPoint) {
        super();
        this.refPoint = refPoint;
    }


    public double volume (){
        return 1.0;
    }

    public Point3D getRefPoint() {
        return refPoint;
    }

    public void setRefPoint(Point3D refPoint) {
        this.refPoint = refPoint;
    }

}
