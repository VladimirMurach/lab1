package lab1;

import books.Book;
import books.BookFactory;
import books.EducationalFactory;
import books.EnglishEducational;
import books.EnglishFiction;
import books.RussianEducational;
import books.RussianFiction;
import books.FictionFactory;
import java.util.ArrayList;
import java.util.Random;
import users.Director;
import users.StudentBuilder;
import users.TeacherBuilder;
import users.User;
import users.UserBuilder;

public class LibraryRecord {

    private User user;
    private ArrayList<Book> bookList;
    private int numberOfBooks;
    private Random r;

    public LibraryRecord() {
        r = new Random();
        bookList = new ArrayList<>();
        setUser();
        setBookList();
    }

    private void setUser() {
        int n = r.nextInt(2);
        Director director = new Director();
        UserBuilder userBuilder = switch (n) {
            case 0 ->
                new StudentBuilder();
            case 1 ->
                new TeacherBuilder();
            default ->
                null;
        };
        director.setUserBuilder(userBuilder);
        director.constructUser();
        user = director.getUser();
    }

    private void setBookList() {
        numberOfBooks = r.nextInt(3, 11);
        for (int i = 0; i < numberOfBooks; i++) {
            int n = r.nextInt(4);
            switch (n) {
                case 0 -> {
                    BookFactory eduFactory = new EducationalFactory();
                    bookList.add(eduFactory.createEnglish());
                }
                case 1 -> {
                    BookFactory ficFactory = new FictionFactory();
                    bookList.add(ficFactory.createEnglish());
                }
                case 2 -> {
                    BookFactory eduFactory = new EducationalFactory();
                    bookList.add(eduFactory.createRussian());
                }
                case 3 -> {
                    BookFactory ficFactory = new FictionFactory();
                    bookList.add(ficFactory.createRussian());
                }
                default -> {
                }
            }
        }
    }

    public User getUser() {
        return user;
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

}
