import java.util.ArrayList;

abstract class PublishingHouse {
    static String[] poemAuthors = {"Juliusz Słowacki", "Adam Mickiewicz"};
    static String[] thrillerAuthors = {"Robin Cook"};
    static String[] historicalNovelAuthors = {"Henryk Sienkiewicz"};

    public static PublishingHouse getPublishingHouse(String author){
        for (String poemAuthor : poemAuthors) {
            if(poemAuthor.equals(author)) return new PoemPublishingHouse(author);
        }
        for (String thrillerAuthor : thrillerAuthors) {
            if(thrillerAuthor.equals(author)) return new ThrillerPublishingHouse(author);
        }
        for (String historicalNovelAuthor : historicalNovelAuthors) {
            if(historicalNovelAuthor.equals(author)) return new HistoricalNovelsPublishingHouse(author);
        }
        return null;
    }
    public abstract Book createBook(String tittle, Integer pageNumber);
}


class HistoricalNovelsPublishingHouse extends PublishingHouse {
    HistoricalNovel historicalNovel;
    ArrayList<String> authors = new ArrayList<String>();

    public HistoricalNovelsPublishingHouse(HistoricalNovel historicalNovel) {
        this.historicalNovel = historicalNovel;
    }

    public HistoricalNovelsPublishingHouse(String author) {
        authors.add(author);
    }

    @Override
    public Book createBook(String tittle, Integer pageNumber) {
        return new HistoricalNovel(authors.get(0), tittle, pageNumber);
    }

}


class ThrillerPublishingHouse extends PublishingHouse {
    Thriller thriller;
    ArrayList<String> authors = new ArrayList<String>();

    public ThrillerPublishingHouse(Thriller thriller) {
        this.thriller = thriller;
    }

    public ThrillerPublishingHouse(String author) {
        authors.add(author);
    }

    @Override
    public Book createBook(String tittle, Integer pageNumber) {
        return new Thriller(authors.get(0), tittle, pageNumber);
    }

}

class PoemPublishingHouse extends PublishingHouse {
    Poem poem;
    ArrayList<String> authors = new ArrayList<String>();

    public PoemPublishingHouse(Poem poem) {
        this.poem = poem;
    }

    public PoemPublishingHouse(String author) {
        authors.add(author);
    }

    @Override
    public Book createBook(String tittle, Integer pageNumber) {
        return new Poem(authors.get(0), tittle, pageNumber);
    }

}