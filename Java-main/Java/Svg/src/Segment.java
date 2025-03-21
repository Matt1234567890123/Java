public class Segment {
    private Point p1;
    private Point p2;

    public void setP1(Point p1) {
        this.p1 = p1;
    }
    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }
    public Segment(Point p1, Point p2){
        this.p1 = new Point(p1.getX(), p1.getY());
        this.p2 = new Point(p2.getX(), p2.getY());
    }

    @Override
    public String toString() {
        return "Segment{\n" +
                "p1=" + p1.toString() +
                "\np2=" + p2.toString() +
                '}';
    }

    public double length() {
        return Math.sqrt(Math.pow(this.p1.getX()-this.p2.getX(), 2) + Math.pow(this.p1.getY()-this.p2.getY(), 2));
    }

    public static Segment longestSegment(Segment arr[]){
        Segment max = arr[0];
        for(Segment s : arr){
            if(max.length() < s.length()){
                max = s;
            }
            System.out.println("cos");
            System.out.println(s.length());
        }
        return max;
    }
}
