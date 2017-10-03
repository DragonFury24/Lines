public class Point {
    public Point(double xCoordinate, double yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    private double xCoordinate, yCoordinate;

    //return xCoordinate value
    public double getX() {
        return xCoordinate;
    }

    //return yCoordinate value
    public double getY() {
        return yCoordinate;
    }

    //returns both xCoordinate and yCoordinate as String
    public String toString() {
        return "(" + xCoordinate + ", " + yCoordinate + ")";
    }
}
