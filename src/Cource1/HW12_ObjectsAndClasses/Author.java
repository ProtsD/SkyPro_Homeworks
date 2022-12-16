package Cource1.HW12_ObjectsAndClasses;

public class Author {
    private String firstName;

    private String secondName;
    private int birthDay;

    Author(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }
}
