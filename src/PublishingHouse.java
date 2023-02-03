import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

abstract class PublishingHouse {
    static List<String> poemAuthors = new ArrayList<>(Arrays.asList("Juliusz Słowacki", "Adam Mickiewicz"));
    static List<String> thrillerAuthors = new ArrayList<>(List.of("Robin Cook"));
    static List<String> historicalNovelAuthors = new ArrayList<>(List.of("Henryk Sienkiewicz"));

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
    public static void addPoemAuthor(String poemAuthor){
        poemAuthors.add(poemAuthor);
    }
    public static void addThrillerAuthor(String thrillerAuthor){
        thrillerAuthors.add(thrillerAuthor);
    }
    public static void addHistoricalNovelAuthor(String historicalNovelAuthor){
        historicalNovelAuthors.add(historicalNovelAuthor);
    }
    public abstract Book createBook(String tittle, Integer pageNumber);
}


class HistoricalNovelsPublishingHouse extends PublishingHouse {
    HistoricalNovel historicalNovel;
    String author;

    public HistoricalNovelsPublishingHouse(HistoricalNovel historicalNovel) {
        this.historicalNovel = historicalNovel;
    }

    public HistoricalNovelsPublishingHouse(String author) {
        this.author = author;
    }

    @Override
    public Book createBook(String tittle, Integer pageNumber) {
        return new HistoricalNovel(author, tittle, pageNumber);
    }

}


class ThrillerPublishingHouse extends PublishingHouse {
    Thriller thriller;
    String author;

    public ThrillerPublishingHouse(Thriller thriller) {
        this.thriller = thriller;
    }

    public ThrillerPublishingHouse(String author) {
        this.author = author;
    }

    @Override
    public Book createBook(String tittle, Integer pageNumber) {
        return new Thriller(author, tittle, pageNumber);
    }

}

class PoemPublishingHouse extends PublishingHouse {
    Poem poem;
    String author;

    public PoemPublishingHouse(Poem poem) {
        this.poem = poem;
    }

    public PoemPublishingHouse(String author) {
        this.author = author;
    }

    @Override
    public Book createBook(String tittle, Integer pageNumber) {
        return new Poem(author, tittle, pageNumber);
    }

}