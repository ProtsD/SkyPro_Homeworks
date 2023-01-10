package Cource2.HW1_Encapsulation;

public class SlytherinFaculty extends Hogwarts {
    private String firstName;
    private String secondName;
    private int cunning;
    private int determination;
    private int ambition;
    private int lustForPower;

    public SlytherinFaculty(String firstName, String secondName, int magic, int transgressionDistance, int cunning, int determination, int ambition, int lustForPower) {
        super(magic, transgressionDistance);
        this.firstName = firstName;
        this.secondName = secondName;
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.lustForPower = lustForPower;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public void print() {
        System.out.println(firstName + " " + secondName);
        super.print();
        System.out.println("Cunning:                " + cunning);
        System.out.println("Determination:          " + determination);
        System.out.println("Ambition:               " + ambition);
        System.out.println("Lust for power:         " + lustForPower);
        System.out.println();
    }

    public String compareWith(SlytherinFaculty student2) {
        int skillSetStudent1 = cunning + determination + ambition + lustForPower;
        int skillSetStudent2 = student2.cunning + student2.determination + student2.ambition + student2.lustForPower;
        if (skillSetStudent1 > skillSetStudent2) return " has better skill set than ";
        else if (skillSetStudent1 < skillSetStudent2) return " has worse skill set than ";
        else return " has equal skill set with ";
    }
}
