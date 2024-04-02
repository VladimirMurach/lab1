package users;

public class StudentBuilder extends UserBuilder {
    
    @Override
    public void buildName() {
        user.setName(ng.randomName());
    }
    
    @Override
    public void buildMiddleName() {
        
    }
    
    @Override
    public void buildSurname() {
        user.setSurname(ng.randomStudentSurname());
    }
    
}
