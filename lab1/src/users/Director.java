package users;

public class Director {

    private UserBuilder userBuilder;

    public void setUserBuilder(UserBuilder userBuilder) {
        this.userBuilder = userBuilder;
    }

    public User getUser() {
        return userBuilder.getUser();
    }

    public void constructUser() {
        userBuilder.createNewUser();
        userBuilder.buildName();
        userBuilder.buildMiddleName();
        userBuilder.buildSurname();
    }
}
