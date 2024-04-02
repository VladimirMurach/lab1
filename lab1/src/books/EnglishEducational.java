package books;

public class EnglishEducational implements English {

    private String title;
    private String level;
    private String subject;
    private String author;
    private String university;

    public EnglishEducational(String title, String level, String subject, String author, String university) {
        this.title = title;
        this.level = level;
        this.subject = subject;
        this.author = author;
        this.university = university;
    }

    @Override
    public String fullTitle() {
        return title + " by " + author + ", " + university + ". " + subject + ". " + level;
    }
}
