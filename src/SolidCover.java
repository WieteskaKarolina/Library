public class SolidCover extends Book {
    private final Book book;

    @Override
    public String toString() {
        return "[" + book + ']';
    }

    public SolidCover(Book book) {
        this.book = book;
    }

}
