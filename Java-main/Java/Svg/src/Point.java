public class Point {
    private double x;
    private double y;

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Point(){
        this.x = 0;
        this.y = 0;
    }
    public String toString() {
        return "Wsp. x punktu = " + this.x + "\nWsp. y punktu = " + this.y;
    }

    public String toSvg() {
        return "\n<circle r=\"45\" cx=\"" + this.x + "\" cy=\"" + this.y + "\" fill=\"red\" />";
    }

    public void translate(double dx, double dy){
        this.x = this.x + dx;
        this.y = this.y + dy;
    }

    public Point translated(double dx, double dy){
        Point p2 = new Point();
        p2.x = this.x + dx;
        p2.y = this.y + dy;
        return p2;
    }
}


//"<svg height="100" width="100"\nxmlns="http://www.w3.org/2000/svg">
