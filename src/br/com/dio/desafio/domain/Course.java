package br.com.dio.desafio.domain;

public class Course {

    private String course;
    private String description;
    private int workload;

    public Course() {
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    @Override
    public String toString() {
        return "course{" +
                "course='" + course + '\'' +
                ", description='" + description + '\'' +
                ", workload=" + workload +
                '}';
    }
}
