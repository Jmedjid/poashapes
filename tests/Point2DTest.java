import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by Joan on 05/10/2016.
 */
public class Point2DTest {
    Point2D p;


    @org.testng.annotations.BeforeMethod
    public void setUp() throws Exception {
        p = new Point2D(0, 0);
    }


    @org.testng.annotations.AfterMethod
    public void tearDown() throws Exception {
    }


    @org.testng.annotations.Test
    public void testTranslate() throws Exception {
        Point2D p = new Point2D(0, 0);
        p.translate(2, 3);
        assertEquals(p.getX(), 2.0);
        assertEquals(p.getY(), 3.0);
    }

    @org.testng.annotations.Test
    public void testIsOrigin() throws Exception {
        Point2D p = new Point2D(0,0);
        assertEquals(p.isOrigin(), true);

    }

    @org.testng.annotations.Test
    public void testDistance() throws Exception {

    }


}