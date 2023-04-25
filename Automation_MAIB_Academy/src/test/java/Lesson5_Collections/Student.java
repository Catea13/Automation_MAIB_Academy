package Lesson5_Collections;

public class Student {
    String name;
    String grupa;
    double average;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrupa() {
        return grupa;
    }

    public void setGrupa(String grupa) {
        this.grupa = grupa;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public Student(String name, String grupa, double average) {
        this.name = name;
        this.grupa = grupa;
        this.average = average;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grupa='" + grupa + '\'' +
                ", average=" + average +
                '}';
    }
}
