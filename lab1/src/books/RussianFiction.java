package books;

public class RussianFiction implements Russian {

    private String title;
    private String author;
    private String year;

    public RussianFiction(String title, String author, String year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String fullTitle() {
        return title + ". " + author + ". " + year;
    }
}
