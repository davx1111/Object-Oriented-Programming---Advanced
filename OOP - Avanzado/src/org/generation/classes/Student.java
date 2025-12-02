package org.generation.classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student {

    private String name;
    private String id;
    private int age;

    private final List<Course> courseList = new ArrayList<>();

    public Student(String name, String id, int age) {
        setName(name);
        this.id = id;
        setAge(age);
    }

    // Getters y setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa.");
        }
        this.age = age;
    }

    public List<Course> getCourseList() {
        return Collections.unmodifiableList(courseList);
    }

    public void addCourse(Course course) {
        if(course != null && !courseList.contains(course)) {
            courseList.add(course);
        }
    }

    public void removeCourse(Course course) {
        courseList.remove(course);
    }
}
