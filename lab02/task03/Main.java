import java.util.Scanner;

class Point {
    private float x, y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void changeCoords(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void showPoint() {
        Float x = this.x;
        Float y = this.y;
        System.out.println("(" + x.toString() + ", " + y.toString() + ")");
    }
}

class Polygon {
    private Point[] points;

    public Polygon(int n) {
        points = new Point[n];

        for (int i = 0; i < n; i++) {
            points[i] = new Point(0, 0);
        }
    }

    public Polygon(float[] coords) {
        this(coords.length / 2);

        for (int i = 0; i < coords.length; i += 2) {
            points[i/2] = new Point(i, i + 1);
        }
    }

    public void showPolygon() {
        for (int i = 0; i < points.length; i++) {
            points[i].showPoint();
        }
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float x1 = scanner.nextFloat();
        float y1 = scanner.nextFloat();
        float x2 = scanner.nextFloat();
        float y2 = scanner.nextFloat();

        Point point = new Point(x1, y1);
        point.showPoint();

        point.changeCoords(x2, y2);
        point.showPoint();

        int n = scanner.nextInt();
        float[] points = new float[n];

        for(int i = 0; i < n; i++) {
            points[i] = i;
        }

        Polygon polygon = new Polygon(points);
        System.out.println("Poligonul are urmatoarele coordonate:");
        polygon.showPolygon();

        scanner.close();
    }
}