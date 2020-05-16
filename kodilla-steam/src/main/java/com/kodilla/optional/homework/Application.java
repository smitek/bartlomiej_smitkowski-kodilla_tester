package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    private static Object Student;
    private static com.kodilla.optional.homework.Student student;

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Andy W", new Teacher("Bill G")));
        students.add(new Student("Tommy H", new Teacher("Gorgio A")));
        students.add(new Student("Michael A", new Teacher("Gorgio A")));
        students.add(new Student("Norman C", new Teacher(null)));

        Optional<Student> optionalStudent = Optional.ofNullable(student);
        optionalStudent.ifPresent(s -> System.out.println(s.getTeacher()));

        for (Student student : students) {
            Teacher teacher = student.getTeacher(); //.orElse(new Teacher("<undefined>"));
            System.out.println("Student: " + student.getName() + ", Teacher: " + teacher.name);
        }
    }
}
