public class Segment {
    public Point p1;
    public Point p2;

    public double length() {
        return Math.sqrt(Math.pow(this.p1.x-this.p2.x, 2) + Math.pow(this.p1.y-this.p2.y, 2));
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
