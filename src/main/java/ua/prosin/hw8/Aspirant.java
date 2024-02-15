package ua.prosin.hw8;

class Aspirant extends Student {
    public String scintificWork;

    public Aspirant(String firstName, String lastName, String group, double avergeMark, String scintificWork) {
        super(firstName, lastName, group, avergeMark);
        this.scintificWork = scintificWork;
    }

    @Override
    double getScholarship() {
        return (avergeMark == 5) ? 200 : 180;
    }
}
