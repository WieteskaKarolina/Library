public class Audiobook extends Book{
    String author;
    String title;
    Integer width;

    public Audiobook(String author, String title, Integer width) {
        this.author = author;
        this.title = title;
        this.width = width;
    }

    public Audiobook() {
        this.author = "Caroline Smith";
        this.title = "notebook";
        this.width = 64;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPageNumber() {
        return width;
    }

    public void setPageNumber(Integer width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", pageNumber=" + width ;
    }
}
