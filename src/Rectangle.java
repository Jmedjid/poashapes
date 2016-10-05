/**
 * Created by Joan on 05/10/2016.
 */
public class Rectangle {

    private double length;
    private double width;

    public Rectangle(Point2D refPoint, double length, double width) {
        this.length = length;
        this.width = width;
    }


    public double perimeter (){
        return this.length*2 + this.width*2;
    }

    public double surface (){
        return this.length*this.width;
    }
}
