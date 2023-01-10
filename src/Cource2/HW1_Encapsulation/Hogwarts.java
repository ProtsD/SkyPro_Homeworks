package Cource2.HW1_Encapsulation;

public class Hogwarts {
    private int magic;
    private int transgressionDistance;

    public Hogwarts(int magic, int transgressionDistance) {
        this.magic = magic;
        this.transgressionDistance = transgressionDistance;
    }

    public int getMagic() {
        return magic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    public void print() {
        System.out.println("Magic:                  " + magic);
        System.out.println("Transgression distance: " + transgressionDistance);
    }

    public String compareMagicWith(Hogwarts student2) {
        if (magic > student2.magic) return " has more magic power than ";
        else if (magic < student2.magic) return " has less magic power than ";
        else return " has equal magic power with ";
    }

    public String compareTransgressionDistanceWith(Hogwarts student2) {
        if (transgressionDistance > student2.transgressionDistance) return " has more transgression distance than ";
        else if (transgressionDistance < student2.transgressionDistance) return " has less transgression distance than ";
        else return " has equal transgression distance with ";
    }
}
