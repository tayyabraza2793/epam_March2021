package com.epam.jwd.app;

import com.epam.jwd.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(10);

        for (int i = 0; i < 10; i++) {
            Student student = new Student();
            student.setId(i);
            student.setAge(i * 10);
            student.setName("Name" + i);
            student.setSecondName("Second Name" + i);
            student.setUniversity("University" + i);
            student.setCourse(i);
            students.add(student);
        }

        for (Student student : students) {
            logger.info(student.getName());
            logger.warn(student.getSecondName());
            logger.error(String.valueOf(student.getAge()));
            logger.debug(student.getUniversity());
        }

        logger.info("End of first task\n");
        secondMethod();
    }

    public static void secondMethod() {
        Point[] points = new Point[4];
        Point[] pointsForTriangles = new Point[6];
        Line[] lines = new Line[2];
        Triangle[] triangles = new Triangle[2];
        Square[] squares = new Square[1];

        for (int i = 0; i < points.length; i++) {
            points[i] = new Point(i, i + 2);
            logger.info("Point " + i + " : " + points[i].toString());
        }

        for (int i = 0; i < pointsForTriangles.length; i++) {
            pointsForTriangles[i] = new Point(i, i + 2);
            logger.info("Point for triangle " + i + " : " + pointsForTriangles[i].toString());
        }

        for (int i = 0; i < lines.length; i++) {
            lines[i] = new Line(points[i], points[i + 2]);
            if (lines[i].getExists()) logger.info("Line " + i + " exists");
            else logger.error("Line " + i + " doesn't exist");
        }

        for (int i = 0; i < triangles.length; i++) {
            triangles[i] = new Triangle
                    (pointsForTriangles[i], pointsForTriangles[i + 2], pointsForTriangles[i + 4]);
            if (triangles[i].getExists()) logger.info("Triangle " + i + " exists");
            else logger.error("Triangle " + i + " doesn't exist");
        }

        for (int i = 0; i < squares.length; i++) {
            squares[i] = new Square(points[i], points[i + 1], points[i + 2], points[i + 3]);
            if (squares[i].getExists()) logger.info("Square " + i + " exists");
            else logger.error("Square " + i + " doesn't exist");
        }

//Custom checks for existence

        logger.info("Custom checks:\n");
        Line line1 = new Line(points[0], points[0]);
        if (line1.getExists()) logger.info("Line 1 exists");
        else logger.error("Line 1 doesn't exist");

        Line line2 = new Line(points[0], points[1]);
        if (line2.getExists()) logger.info("Line 2 exists");
        else logger.error("Line 2 doesn't exist");

        Triangle triangle1 = new Triangle
                (pointsForTriangles[0], pointsForTriangles[1], pointsForTriangles[2]);
        if (triangle1.getExists()) logger.info("Triangle 1 exists");
        else logger.error("Triangle 1 doesn't exist");

        Triangle triangle2 = new Triangle
                (pointsForTriangles[0], pointsForTriangles[0], pointsForTriangles[2]);
        if (triangle2.getExists()) logger.info("Triangle 2 exists");
        else logger.error("Triangle 2 doesn't exist");

        Square square1 = new Square(points[0], points[1], points[2], points[3]);
        if (square1.getExists()) logger.info("Square 1 exists");
        else logger.error("Square 1 doesn't exist");

        Point squareP1 = new Point(1, 1);
        Point squareP2 = new Point(1, 3);
        Point squareP3 = new Point(3, 3);
        Point squareP4 = new Point(3, 1);
        Point squareP5 = new Point(4, 1);
        Square square2 = new Square(squareP1, squareP2, squareP3, squareP4);
        if (square2.getExists()) logger.info("Square 2 exists");
        else logger.error("Square 2 doesn't exist");

        Square square3 = new Square(squareP2, squareP3, squareP4, squareP1);
        if (square3.getExists()) logger.info("Square 3 exists");
        else logger.error("Square 3 doesn't exist");

        Square square4 = new Square(squareP3, squareP4, squareP1, squareP2);
        if (square4.getExists()) logger.info("Square 4 exists");
        else logger.error("Square 4 doesn't exist");

        Square square5 = new Square(squareP4, squareP1, squareP2, squareP3);
        if (square5.getExists()) logger.info("Square 5 exists");
        else logger.error("Square 5 doesn't exist");

        Square square6 = new Square(squareP4, squareP4, squareP2, squareP3);
        if (square6.getExists()) logger.info("Square 6 exists");
        else logger.error("Square 6 doesn't exist");

        Square square7 = new Square(squareP1, squareP2, squareP3, squareP5);
        if (square7.getExists()) logger.info("Square 7 exists");
        else logger.error("Square 7 doesn't exist");
    }
}
