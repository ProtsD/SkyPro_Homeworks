package Cource2.HW1_Encapsulation;

public class HufflepuffFaculty extends Hogwarts {
    private String firstName;
    private String secondName;
    private int diligence;
    private int loyalty;
    private int honor;

    public HufflepuffFaculty(String firstName, String secondName, int magic, int transgressionDistance, int diligence, int loyalty, int honor) {
        super(magic, transgressionDistance);
        this.firstName = firstName;
        this.secondName = secondName;
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honor = honor;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonor() {
        return honor;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void print() {
        System.out.println(firstName + " " + secondName);
        super.print();
        System.out.println("Diligence:              " + diligence);
        System.out.println("Loyalty:                " + loyalty);
        System.out.println("Honor:                  " + honor);
        System.out.println();
    }

    public String compareWith(HufflepuffFaculty student2) {
        int skillSetStudent1 = diligence + loyalty + honor;
        int skillSetStudent2 = student2.diligence + student2.loyalty + student2.honor;
        if (skillSetStudent1 > skillSetStudent2) return " has better skill set than ";
        else if (skillSetStudent1 < skillSetStudent2) return " has worse skill set than ";
        else return " has equal skill set with ";
    }
}
