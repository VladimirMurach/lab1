package users;

import java.util.ArrayList;
import java.util.Random;
import lab1.CSVReader;

public class NameGenerator {
    
    private CSVReader reader = new CSVReader();
    private ArrayList<String> nameList = reader.readCsv("src/files/names.csv");
    private ArrayList<String> studentSurnameList = reader.readCsv("src/files/student surnames.csv");
    private ArrayList<String> middlenameList = reader.readCsv("src/files/middlenames.csv");
    private ArrayList<String> teacherSurnameList = reader.readCsv("src/files/teacher surnames.csv");
    private Random r = new Random();

    public String randomName() {
        return nameList.get(r.nextInt(nameList.size()));
    }
    
    public String randomMiddleName() {
        return middlenameList.get(r.nextInt(middlenameList.size()));
    }
    
    public String randomStudentSurname() {
        return studentSurnameList.get(r.nextInt(studentSurnameList.size()));
    }
    
    public String randomTeacherSurname() {
        return teacherSurnameList.get(r.nextInt(teacherSurnameList.size()));
    }
}
