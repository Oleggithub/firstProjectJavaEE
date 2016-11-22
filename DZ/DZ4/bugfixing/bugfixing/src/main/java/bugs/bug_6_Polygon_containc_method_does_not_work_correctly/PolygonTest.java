package bugs.bug_6_Polygon_containc_method_does_not_work_correctly;


import java.awt.*;

public class PolygonTest {

    public static void main(String[] args) {
        int[] xPoints = {-2, 2, -2};
        int[] yPoints = {2, 2, -2};

        Polygon polygon = new Polygon(xPoints, yPoints, yPoints.length);
        boolean checkPoint = polygon.contains(1, 2);
        System.out.print(checkPoint);//why false?) -> should be true))
    }
}
