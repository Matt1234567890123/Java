public class Main {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 3;
        p1.y = 5;
        Point p2 = new Point();
        p2.x = 7;
        p2.y = 8;
        Point p3 = new Point();
        p2.x = 9;
        p2.y = 11;
        Point p4 = new Point();
        p2.x = 1;
        p2.y = 3;
        Segment s1 = new Segment();
        s1.p1 = p1;
        s1.p2 = p2;
        Segment[] arr = new Segment[2];
        Segment s2 = new Segment();
        s2.p1 = p3;
        s2.p2 = p4;
        System.out.println(s2.length());
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