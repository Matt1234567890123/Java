public class SvgScene {
    private Polygon[] polygons;
    private int count=0;

    public SvgScene() {
        this.polygons = new Polygon[3];
    }

    public void addPolygon(Polygon poly) {
        for (int i = 0; i < polygons.length; i++) {
            if (this.polygons[i] == null) {
                this.polygons[i] = poly;
                return;
            }
        }
        this.polygons[count] = poly;
        count++;
        if (count == polygons.length) count = 0;
    }
}
