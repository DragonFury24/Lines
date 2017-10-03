public class LineSegment {
    public LineSegment(double x1, double y1, double x2, double y2) {
        endpoint0 = new Point(x1, y1);
        endpoint1 = new Point(x2, y2);
    }

    private Point endpoint0;
    private Point endpoint1;

    //Returns distance of both points using distance formula
    public double getLength() {
        return Math.sqrt(Math.pow(endpoint1.getX() - endpoint0.getX(), 2) + Math.pow(endpoint1.getY() - endpoint0.getY(), 2));
    }

    public double getSlope() {
        return (endpoint1.getY() - endpoint0.getY()) / (endpoint1.getX() - endpoint0.getX());
    }

    //Intersection methods use ideas from Intermediate value theorem to determine intersection.
    public boolean intersectsX() {
        //Math.signum() found from java.Math source library.
        return Math.signum(endpoint0.getY()) != Math.signum(endpoint1.getY());
    }

    public boolean intersectsY() {
        //Math.signum() found from java.Math source library.
        return Math.signum(endpoint0.getX()) != Math.signum(endpoint1.getX());
    }

    public String toString() {
        return "Endpoint 1: " + endpoint0.toString() + "  " + "Endpoint 2: " + endpoint1.toString();
    }
}
