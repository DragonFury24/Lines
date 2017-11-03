import java.util.Scanner;

public class LinesMain {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double x1, y1, x2, y2, x3, y3, x4, y4;
        LineSegment[] lineSegments = new LineSegment[2];
        //Ask for point values
        System.out.println("Input first x value");
        x1 = keyboard.nextDouble();
        System.out.println("Input first y value");
        y1 = keyboard.nextDouble();
        System.out.println("Input second x value");
        x2 = keyboard.nextDouble();
        System.out.println("Input second y value");
        y2 = keyboard.nextDouble();

        //ask for point values
        System.out.println("Input first x value");
        x3 = keyboard.nextDouble();
        System.out.println("Input first y value");
        y3 = keyboard.nextDouble();
        System.out.println("Input second x value");
        x4 = keyboard.nextDouble();
        System.out.println("Input second y value");
        y4 = keyboard.nextDouble();
        keyboard.nextLine();


        //Creates 2 line segments with specified points

        lineSegments[0] = new LineSegment(x1, y1, x2, y2);
        lineSegments[1] = new LineSegment(x3, y3, x4, y4);

        //print out the points, length, slope, and whether the lines intersect the axes for each LineSegment
        for (LineSegment lineSegment : lineSegments) {
            System.out.println("Points: " + lineSegment.toString());
            System.out.println("Length: " + lineSegment.getLength());
            System.out.println("Slope: " + lineSegment.getSlope());
            System.out.println("Intersects x-axis: " + lineSegment.intersectsX());
            System.out.println("Intersects y-axis: " + lineSegment.intersectsY());
            System.out.println();
        }
    }
}
