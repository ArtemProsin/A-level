package ua.prosin.hw8;

public class Task1 {
    public static void main(String[] args) {
        Student[] students = {new Student("Alex", "Shark", "Group D", 3.9), new Aspirant("Roma", "Nova", "Group F", 5, "3")};

        for (Student student : students) {
            System.out.println(student.firstName + " " + student.lastName + ": " + student.getScholarship() + " грн");
        }
    }
}
