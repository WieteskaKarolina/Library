public class Book {
    String author;
    String title;
    Integer pageNumber;

    public Book(String author, String title, Integer pageNumber) {
        this.author = author;
        this.title = title;
        this.pageNumber = pageNumber;
    }

    public Book() {
        this.author = "Caroline Smith";
        this.title = "notebook";
        this.pageNumber = 64;
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
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    @Override
    public String toString() {
        return "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", pageNumber=" + pageNumber ;
    }
}

