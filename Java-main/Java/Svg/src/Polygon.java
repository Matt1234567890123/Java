public class Polygon {
    private Point[] points;

    public Point[] getPoints() {
        return points;
    }

    private Style style;
    public Polygon(Point[] points, Style style){
        this.points = new Point[points.length];
        for(int i=0; i < points.length; i++){
            this.points[i] = new Point(points[i].getX(), points[i].getY());
        }
    }

    public Polygon(Polygon old){
        Point[] oldPoints = old.getPoints();
        this.points = new Point[oldPoints.length];
        for(int i=0; i<oldPoints.length; i++){
            this.points[i] = new Point(oldPoints[i].getX(), oldPoints[i].getY());
        }
        this.style = style;
    }

    public String toString(){
        String result = "";
        for(Point p: points){
            result += p.toString() + "\n";
        }
        return result;
    }

    public String toSvg(){
        String result = "<polygon_points=\"";

        for(int i = 0; i < points.length; i++){
            result += points[i].getX() + "," + points[i].getY();
            if(i < points.length - 1) {
                result += " ";
            }
        }

        result += "\" style=\"fill:none;stroke:black;stroke-width:1\" />";
        return result;
    }
}
