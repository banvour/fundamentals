package io.everyonecodes.java.t7b_datastructures.mixed.exercise1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GradeAdministrator {
    private final Map<Student, Map<Subject, Grade>> studentGrades = new HashMap<>();

    public GradeAdministrator(List<Student> students) {
        for (Student student : students) {
            studentGrades.put(student, new HashMap<>());
        }
    }

    public void registerStudent(Student student) {
        if (studentGrades.containsKey(student)) {
            throw new IllegalArgumentException(student.getFullName() + " is already registered in the system.");
        }

        studentGrades.put(student, new HashMap<>());
    }

    public void deregisterStudent(Student student) {
        studentGrades.remove(student);
    }

    public void assignGrade(Student student, Subject subject, Grade grade) {
        var subjectGrades = studentGrades.get(student);
        if (subjectGrades == null) {
            throw new IllegalArgumentException(student.getFullName() + " is not registered in the system.");
        }
        subjectGrades.put(subject, grade);
    }

    public void printGrade(Student student, Subject subject) {
        var subjectGrades = studentGrades.get(student);
        if (subjectGrades == null) {
            System.out.println(student.getFullName() + " is not registered in the system.");
            return;
        }
        var grade = subjectGrades.get(subject);
        if (grade == null) {
            System.out.println(student.getFullName() + " doesn't have any grade in " + subject.getName() +".");
            return;
        }

        System.out.println(student.getFullName() + " has a " + grade.getNumber() + " in " + subject.getName() + ".");
    }
}
