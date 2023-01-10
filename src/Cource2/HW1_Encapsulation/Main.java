package Cource2.HW1_Encapsulation;

public class Main {
    public static void main(String[] args) {
        GryffindorFaculty potter = new GryffindorFaculty("Harry","Potter",11,21,31,40,50);
        GryffindorFaculty granger = new GryffindorFaculty("Hermione","Granger",10,20,30,40,50);

        SlytherinFaculty malfoy = new SlytherinFaculty("Draco","Malfoy",10,22,30,40,50,60);
        SlytherinFaculty montague = new SlytherinFaculty("Graham","Montague",11,21,30,40,50, 60);

        HufflepuffFaculty smith = new HufflepuffFaculty("Zacharias","Smith",12,22,30,40,50);
        HufflepuffFaculty diggory = new HufflepuffFaculty("Cho","Diggory",10,23,32,40,50);

        RavenclawFaculty chang = new RavenclawFaculty("Cedric","Chang",10,20,30,40,50);
        RavenclawFaculty patil = new RavenclawFaculty("Patil","Chang",10,20,30,40,50);

        potter.print();
        malfoy.print();
        smith.print();
        chang.print();

        System.out.println(potter.getSecondName() + potter.compareWith(granger) + granger.getSecondName() + " in Gryffindor");
        System.out.println(malfoy.getSecondName() + malfoy.compareWith(montague) + montague.getSecondName() + " in Slytherin");
        System.out.println(smith.getSecondName() + smith.compareWith(diggory) + diggory.getSecondName() + " in Hufflepuff");
        System.out.println();

        System.out.println(potter.getSecondName() + potter.compareMagicWith(malfoy) + malfoy.getSecondName());
        System.out.println(malfoy.getSecondName() + malfoy.compareMagicWith(smith) + smith.getSecondName());
        System.out.println(diggory.getSecondName() + diggory.compareMagicWith(patil) + patil.getSecondName());
        System.out.println();

        System.out.println(potter.getSecondName() + potter.compareTransgressionDistanceWith(malfoy) + malfoy.getSecondName());
        System.out.println(malfoy.getSecondName() + malfoy.compareTransgressionDistanceWith(smith) + smith.getSecondName());
        System.out.println(diggory.getSecondName() + diggory.compareTransgressionDistanceWith(patil) + patil.getSecondName());
    }
}
