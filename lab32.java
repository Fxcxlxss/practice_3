package lab3;

import java.util.Arrays;
import java.util.Random;

public class lab32 {
    class Point {
        private double x;
        private double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }

    class Circle {
        private Point center;
        private double radius;

        public Circle(Point center, double radius) {
            this.center = center;
            this.radius = radius;
        }

        public Point getCenter() {
            return center;
        }

        public double getRadius() {
            return radius;
        }

        public double getCircumference() {
            return 2 * Math.PI * radius;
        }

        @Override
        public String toString() {
            return "Circle{" +
                    "center=" + center +
                    ", radius=" + radius +
                    '}';
        }
    }

    class Tester {
        private Circle[] circles;
        private int count;

        public Tester(int size) {
            circles = new Circle[size];
            count = 0;
        }

        public void addCircle(Circle circle) {
            circles[count++] = circle;
        }

        public Circle getSmallestCircle() {
            Circle smallestCircle = circles[0];
            for (int i = 1; i < count; i++) {
                if (circles[i].getRadius() < smallestCircle.getRadius()) {
                    smallestCircle = circles[i];
                }
            }
            return smallestCircle;
        }

        public Circle getLargestCircle() {
            Circle largestCircle = circles[0];
            for (int i = 1; i < count; i++) {
                if (circles[i].getRadius() > largestCircle.getRadius()) {
                    largestCircle = circles[i];
                }
            }
            return largestCircle;
        }

        public void sortCircles() {
            Arrays.sort(circles, 0, count, (c1, c2) -> Double.compare(c1.getRadius(), c2.getRadius()));
        }
    }

    public class Main {
        public void main(String[] args) {
            Random random = new Random();

            Point center1 = new Point(1.0, 2.0);
            double radius1 = random.nextDouble();
            Circle circle1 = new Circle(center1, radius1);

            Point center2 = new Point(3.0, 4.0);
            double radius2 = random.nextDouble();
            Circle circle2 = new Circle(center2, radius2);

            Tester tester = new Tester(2);
            tester.addCircle(circle1);
            tester.addCircle(circle2);

            Circle smallestCircle = tester.getSmallestCircle();
            Circle largestCircle = tester.getLargestCircle();

            System.out.println("Smallest Circle: Radius = " + smallestCircle.getRadius() + ", Circumference = " + smallestCircle.getCircumference());
            System.out.println("Largest Circle: Radius = " + largestCircle.getRadius() + ", Circumference = " + largestCircle.getCircumference());

            tester.sortCircles();
            System.out.println("Sorted Circles: ");
            for (int i = 0; i < tester.count; i++) {
                Circle circle = tester.circles[i];
                System.out.println("Circle " + (i + 1) + ": Radius = " + circle.getRadius() + ", Circumference = " + circle.getCircumference());
            }
        }
    }
}
