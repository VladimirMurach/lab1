package books;

public class FictionFactory implements BookFactory {

    TitleGenerator tg = new TitleGenerator();
    
    @Override
    public Russian createRussian() {
        return new RussianFiction(tg.randomFicRusTitle(), tg.randomFicRusAuthor(), tg.randomYear());
    }

    @Override
    public English createEnglish() {
        return new EnglishFiction(tg.randomFicEngTitle(), tg.randomFicEngAuthor(), tg.randomArtist());
    }
    
}
