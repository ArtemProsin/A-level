package ua.prosin.hw8;
class Student {
    public String firstName;
    public String lastName;
    public String group;
    public Double avergeMark;

    public Student(String firstName, String lastName, String group, double avergeMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.avergeMark = avergeMark;

    }

    double getScholarship() {
        return (avergeMark == 5) ? 100 : 80;
        }
}
