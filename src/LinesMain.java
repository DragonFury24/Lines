import java.util.Scanner;

public class LinesMain {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double x1, y1, x2, y2;
        LineSegment[] lineSegments = new LineSegment[2];
//        System.out.println("Input first x value");
//        x1 = keyboard.nextDouble();
//        System.out.println("Input first y value");
//        y1 = keyboard.nextDouble();
//        System.out.println("Input second x value");
//        x2 = keyboard.nextDouble();
//        System.out.println("Input second y value");
//        y2 = keyboard.nextDouble();
//        keyboard.nextLine();

        //Creates 2 line segments with specified points
        lineSegments[0] = new LineSegment(25, 99, -98, 89);
        lineSegments[1] = new LineSegment(12, 32, 65, -23);

        //print out the points, length, slope, and whether the lines intersect the axes the line segment
        System.out.println("Points: " + lineSegments[0].toString());
        System.out.println("Length: " + lineSegments[0].getLength());
        System.out.println("Slope: " + lineSegments[0].getSlope());
        System.out.println("Intersects x-axis: " + lineSegments[0].intersectsX());
        System.out.println("Intersects y-axis: " + lineSegments[0].intersectsY());

        //print out the points, length, slope, and whether the lines intersect the axes the line segment
        System.out.println();
        System.out.println("Points: " + lineSegments[1].toString());
        System.out.println("Length: " + lineSegments[1].getLength());
        System.out.println("Slope: " + lineSegments[1].getSlope());
        System.out.println("Intersects x-axis: " + lineSegments[1].intersectsX());
        System.out.println("Intersects y-axis: " + lineSegments[1].intersectsY());

    }
}
