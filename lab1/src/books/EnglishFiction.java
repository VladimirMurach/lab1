package books;

public class EnglishFiction implements English {
    
    private String title;
    private String author;
    private String artist;

    public EnglishFiction(String title, String author, String artist) {
        this.title = title;
        this.author = author;
        this.artist = artist;
    }
    
    @Override
    public String fullTitle() {
        return title + " by " + author + ". Artist: " + artist;
    }
}
