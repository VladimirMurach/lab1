package books;

public class EducationalFactory implements BookFactory {
    
    TitleGenerator tg = new TitleGenerator();

    @Override
    public Russian createRussian() {
        return new RussianEducational(tg.randomEduRusTitle(), tg.randomEduRusSubject(), tg.randomType());
    }

    @Override
    public English createEnglish() {
        return new EnglishEducational(tg.randomEduEngTitle(), tg.randomLevel(), tg.randomEduEngSubject(), tg.randomEduEngAuthor(), tg.randomUniversity());
    }
    
}
