/**
 * Created by Joan on 05/10/2016.
 */
public abstract class Shape2D extends Shape {

    private Point2D refPoint;

    public Shape2D(Point2D refPoint) {
        super();
        this.refPoint = refPoint;
    }

    public double perimeter(){

        return 2.0;
    }

    public Point2D getRefPoint() {
        return refPoint;
    }


}
