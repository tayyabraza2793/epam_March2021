package com.epam.jwd.model;

public class Square {
    private Point point1;
    private Point point2;
    private Point point3;
    private Point point4;
    private boolean exists;

    public Square(Point point1, Point point2, Point point3, Point point4) {
        setPoint1(point1);
        setPoint2(point2);
        setPoint3(point3);
        setPoint4(point4);
        setExists(point1, point2, point3, point4);
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

    public Point getPoint4() {
        return point4;
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

    public void setPoint3(Point point3) {
        this.point3 = point3;
    }

    public void setPoint4(Point point4) {
        this.point4 = point4;
    }

    public void setExists(Point point1, Point point2, Point point3, Point point4) {
        boolean variant1Exists = variantExists(point1, point2, point3, point4);
        boolean variant2Exists = variantExists(point2, point3, point4, point1);
        boolean variant3Exists = variantExists(point3, point4, point1, point2);
        boolean variant4Exists = variantExists(point4, point1, point2, point3);
        this.exists = variant1Exists || variant2Exists || variant3Exists || variant4Exists;
    }

    private boolean variantExists(Point point1, Point point2, Point point3, Point point4) {
        Line line1 = new Line(point1, point2);
        Line line2 = new Line(point2, point3);
        Line line3 = new Line(point3, point4);
        Line line4 = new Line(point4, point1);
        boolean checkLines = line1.getExists()
                && line2.getExists() && line3.getExists() && line4.getExists();
        boolean checkAngle1 = point1.getX() == point2.getX();
        boolean checkAngle2 = point2.getY() == point3.getY();
        boolean checkAngle3 = point3.getX() == point4.getX();
        boolean checkAngle4 = point4.getY() == point1.getY();
        boolean checkAngle = checkAngle1 && checkAngle2
                && checkAngle3 && checkAngle4;
        int lineLength1 = point2.getY() - point1.getY();
        int lineLength2 = point3.getX() - point2.getX();
        int lineLength3 = point3.getY() - point4.getY();
        int lineLength4 = point4.getX() - point1.getX();
        boolean checkLineLengths = lineLength1 == lineLength2
                && lineLength2 == lineLength3
                && lineLength3 == lineLength4;
        return checkLines && checkAngle && checkLineLengths;
    }

    public String toString() {
        return this.point1.toString() + ", " + this.point2.toString()
                + ", " + this.point3.toString() + ", " + this.point4.toString();
    }
}
