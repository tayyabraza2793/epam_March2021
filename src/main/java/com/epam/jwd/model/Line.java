package com.epam.jwd.model;

public class Line {
    private Point point1;
    private Point point2;
    private boolean exists;

    public Line(Point point1, Point point2) {
        setPoint1(point1);
        setPoint2(point2);
        setExists(point1, point2);
    }

    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public boolean getExists() {
        return this.exists;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public void setExists(Point point1, Point point2) {
        this.exists = !((point1.getX() == point2.getX())
                && (point1.getY() == point2.getY()));
    }

    public String toString() {
        return this.point1.toString() + ", " + this.point2.toString();
    }
}
