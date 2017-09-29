import java.util.Scanner;

public class LinesMain {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double x1, y1, x2, y2;
        LineSegment lineSegment1;
        LineSegment[] lineSegments;
        System.out.println("Input first x value");
        x1 = keyboard.nextDouble();
        System.out.println("Input first y value");
        y1 = keyboard.nextDouble();
        System.out.println("Input second x value");
        x2 = keyboard.nextDouble();
        System.out.println("Input second y value");
        y2 = keyboard.nextDouble();
        keyboard.nextLine();
        lineSegments[0] = new LineSegment(x1, y1, x2, y2);
        System.out.println("Points: " + lineSegments[0].toString());
        System.out.println("Length: " + lineSegments[0].getLength());
        System.out.println("Slope: " + lineSegments[0].getSlope());
        System.out.println("Intersects x-axis: " + lineSegments[0].intersectsX());
        System.out.println("Intersects y-axis: " + lineSegments[0].intersectsY());
        Line.LINE_SEGMENT.intersectsY();
    }
    public static class Line {
        public Line(double x1, double y1, double x2, double y2) {
            LINE_SEGMENT = new LineSegment(x1, y1, x2, y2);
        }
        static LineSegment LINE_SEGMENT;
    }
}
