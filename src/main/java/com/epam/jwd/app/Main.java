package com.epam.jwd.app;
import com.epam.jwd.model.Person;
import com.epam.jwd.model.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static Logger logger = LoggerFactory.getLogger(Main.class);

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

        for (int i = 0; i < students.size(); i++) {
            logger.info(students.get(i).getName());
            logger.warn(students.get(i).getSecondName());
            logger.error(String.valueOf(students.get(i).getAge()));
            logger.debug(students.get(i).getUniversity());
        }
    }
}
