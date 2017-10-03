public class Point {
    public Point(double xCoordinate, double yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    private double xCoordinate, yCoordinate;

    public double getX() {
        return xCoordinate;
    }

    public double getY() {
        return yCoordinate;
    }
    public String toString() {
        return "(" + xCoordinate + ", " + yCoordinate + ")";
    }
}
