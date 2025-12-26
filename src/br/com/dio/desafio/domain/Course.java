package br.com.dio.desafio.domain;

public class Course extends Content{

    private int workload;

    public Course() {
    }

    @Override
    public double calculateXp() {
        return STD_XP * workload;
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
                "course='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", workload=" + workload +
                '}';
    }
}
