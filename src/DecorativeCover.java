public class DecorativeCover extends Book {
    private final Book book;

    public DecorativeCover(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "{" + book + '}';
    }
}
