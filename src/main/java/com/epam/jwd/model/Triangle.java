package com.epam.jwd.model;

public class Triangle {
    private Point point1;
    private Point point2;
    private Point point3;
    private boolean exists;

    public Triangle(Point point1, Point point2, Point point3) {
        setPoint1(point1);
        setPoint2(point2);
        setPoint3(point3);
        setExists(point1, point2, point3);
    }

    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public Point getPoint3() {
        return point3;
    }

    public boolean getExists() {
        return exists;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public void setPoint3(Point point3) {
        this.point3 = point3;
    }

    public void setExists(Point point1, Point point2, Point point3) {
        Line line1 = new Line(point1, point2);
        Line line2 = new Line(point1, point3);
        Line line3 = new Line(point2, point3);
        boolean check1 = line1.getExists();
        boolean check2 = line2.getExists();
        boolean check3 = line3.getExists();
        this.exists = check1 && check2 && check3;
    }

    public String toString() {
        return this.point1.toString() + ", " + this.point2.toString()
                + ", " + this.point3.toString();
    }
}
