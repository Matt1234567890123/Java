public class Main {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.setX(3);
        p1.setY(5);
        Point p2 = new Point();
        p2.setX(7);
        p2.setY(8);
        Point p3 = new Point();
        p3.setX(9);
        p3.setY(11);
        Point p4 = new Point();
        p4.setX(1);
        p4.setY(3);
        Segment s1 = new Segment(p1, p2);
        p1.setX(74);
        Segment[] arr = new Segment[2];
        Segment s2 = new Segment(p3, p4);
        System.out.println(s2.length());
        Point[] points = new Point[4];
        points[0] = p1;
        points[1] = p2;
        points[2] = p3;
        points[3] = p4;

        Style style = new Style("black", "yellow", 5.0);
        Polygon sq = new Polygon(points, style);
        System.out.println(sq.toString());
        Polygon sq2 = new Polygon(sq);
        sq2.getPoints()[1].setX(563);
        System.out.println(sq2.toString());
        System.out.println(sq.toString());

        //System.out.println(p1.toString());
        //System.out.println(p1.toSvg());
        /*p1.translate(3.0, 6.0);
        System.out.println(p1.toSvg());

        System.out.println(p2.toSvg());
        Point p3 = new Point();
        p3 = p2.translated(3.0, 2.0);
        System.out.println(p3.toSvg());*/
        //System.out.println(p2.toSvg());

        //System.out.println(s1.length());
        arr[0] = s1;
        arr[1] = s2;
        System.out.println(Segment.longestSegment(arr));
    }
}

//import java.awt.*;