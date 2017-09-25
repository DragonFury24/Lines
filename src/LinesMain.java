import java.util.Scanner;

public class LinesMain {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double x1, y1, x2, y2;
        LineSegment lineSegment;
        System.out.println("Input first x value");
        x1 = keyboard.nextDouble();
        System.out.println("Input first y value");
        y1 = keyboard.nextDouble();
        System.out.println("Input second x value");
        x2 = keyboard.nextDouble();
        System.out.println("Input second y value");
        y2 = keyboard.nextDouble();
        keyboard.nextLine();
        lineSegment = new LineSegment(x1, y1, x2, y2);
        System.out.println("Points: " + lineSegment.toString());
        System.out.println("Length: " + lineSegment.getLength());
        System.out.println("Slope: " + lineSegment.getSlope());
        System.out.println("Intersects x-axis: " + lineSegment.intersectsX());
        System.out.println("Intersects y-axis: " + lineSegment.intersectsY());
        Line.LINE_SEGMENT.intersectsY();
    }
    public static class Line {
        public Line(double x1, double y1, double x2, double y2) {
            LINE_SEGMENT = new LineSegment(x1, y1, x2, y2);
        }
        static LineSegment LINE_SEGMENT;
    }
}
