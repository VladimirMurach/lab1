package users;

public class TeacherBuilder extends UserBuilder {

    @Override
    public void buildName() {
        user.setName(ng.randomName());
    }

    @Override
    public void buildMiddleName() {
        user.setMiddleName(ng.randomMiddleName());
    }

    @Override
    public void buildSurname() {
        user.setSurname(ng.randomTeacherSurname());
    }
}
