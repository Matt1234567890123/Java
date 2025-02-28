public class Point {
    public double x;
    public double y;

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
