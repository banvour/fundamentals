package io.everyonecodes.java.t7b_datastructures.mixed.exercise1;

import org.junit.jupiter.api.Assertions;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        Student max = new Student("Max", "Mustermann");
        Student samuel = new Student("Samuel", "Heitor");
        Student siegfried = new Student("Siegfried", "Haitung");

        List<Student> studentList = List.of(max, samuel);

        GradeAdministrator gradeAdministrator = new GradeAdministrator(studentList);

        gradeAdministrator.assignGrade(max, Subject.GERMAN, Grade.GOOD);
        gradeAdministrator.assignGrade(max, Subject.ENGLISH, Grade.VERY_GOOD);
        gradeAdministrator.assignGrade(max, Subject.PSYCHOLOGY, Grade.ADEQUATE);

        gradeAdministrator.assignGrade(samuel, Subject.GERMAN, Grade.SATISFACTORY);
        gradeAdministrator.assignGrade(samuel, Subject.ENGLISH, Grade.GOOD);
        gradeAdministrator.assignGrade(samuel, Subject.MATHS, Grade.VERY_GOOD);

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> gradeAdministrator.assignGrade(siegfried, Subject.MATHS, Grade.VERY_GOOD));

        gradeAdministrator.printGrade(siegfried, Subject.GERMAN);
        gradeAdministrator.printGrade(max, Subject.GERMAN);
        gradeAdministrator.printGrade(max, Subject.HISTORY);
        gradeAdministrator.printGrade(samuel, Subject.GERMAN);

    }
}
