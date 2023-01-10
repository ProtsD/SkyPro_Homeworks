package Cource2.HW1_Encapsulation;

public class RavenclawFaculty extends Hogwarts {
    private String firstName;
    private String secondName;
    private int wisdom;
    private int wit;
    private int creativity;

    public RavenclawFaculty(String firstName, String secondName, int magic, int transgressionDistance, int wisdom, int wit, int creativity) {
        super(magic, transgressionDistance);
        this.firstName = firstName;
        this.secondName = secondName;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public void print() {
        System.out.println(firstName + " " + secondName);
        super.print();
        System.out.println("Wisdom:                 " + wisdom);
        System.out.println("Wit:                    " + wit);
        System.out.println("Creativity:             " + creativity);
        System.out.println();
    }

    public String compareWith(RavenclawFaculty student2) {
        int skillSetStudent1 = wisdom + wit + creativity;
        int skillSetStudent2 = student2.wisdom + student2.wit + student2.creativity;
        if (skillSetStudent1 > skillSetStudent2) return " has better skill set than ";
        else if (skillSetStudent1 < skillSetStudent2) return " has worse skill set than ";
        else return " has equal skill set with ";
    }
}
