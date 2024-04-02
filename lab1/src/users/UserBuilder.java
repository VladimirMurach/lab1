package users;

public abstract class UserBuilder {

    protected User user;
    protected NameGenerator ng = new NameGenerator();

    public User getUser() {
        return user;
    }

    public void createNewUser() {
        user = new User();
    }

    public abstract void buildName();

    public abstract void buildMiddleName();

    public abstract void buildSurname();
}
