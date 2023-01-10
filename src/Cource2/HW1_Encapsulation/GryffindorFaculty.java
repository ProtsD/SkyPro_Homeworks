package Cource2.HW1_Encapsulation;

public class GryffindorFaculty extends Hogwarts {
    private String firstName;
    private String secondName;
    private int nobility;
    private int honor;
    private int courage;

    public GryffindorFaculty(String firstName, String secondName, int magic, int transgressionDistance, int nobility, int honor, int courage) {
        super(magic, transgressionDistance);
        this.firstName = firstName;
        this.secondName = secondName;
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    public void print() {
        System.out.println(firstName + " " + secondName);
        super.print();
        System.out.println("Nobility:               " + nobility);
        System.out.println("Honor:                  " + honor);
        System.out.println("Courage:                " + courage);
        System.out.println();
    }

    public String compareWith(GryffindorFaculty student2) {
        int skillSetStudent1 = nobility + honor + courage;
        int skillSetStudent2 = student2.nobility + student2.honor + student2.courage;
        if (skillSetStudent1 > skillSetStudent2) return " has better skill set than ";
        else if (skillSetStudent1 < skillSetStudent2) return " has worse skill set than ";
        else return " has equal skill set with ";
    }
}
