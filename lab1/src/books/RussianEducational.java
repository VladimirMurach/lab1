package books;

public class RussianEducational implements Russian {
    
    private String title;
    private String subject;
    private String type;

    public RussianEducational(String title, String subject, String type) {
        this.title = title;
        this.subject = subject;
        this.type = type;
    }
    
    @Override
    public String fullTitle() {
        return type + " " + title + ". " + subject;
    }
}
