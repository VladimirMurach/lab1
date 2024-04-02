package users;

public class User {

    private String name;
    private String middleName;
    private String surname;

    public void setName(String name) {
        this.name = name;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getSurname() {
        return surname;
    }

    public String fullName() {
        if (middleName == null) return name + " " + surname;
        else return name + " " + middleName + " " + surname;
    }

}
