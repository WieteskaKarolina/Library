public class NormalCover extends Book {
    private final Book book;

    public NormalCover(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "("  + book +  ')';
    }
}
