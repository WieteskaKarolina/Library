public class Magazine extends Book{
    String title;
    Integer pageNumber;

    public Magazine(String title, Integer pageNumber) {
        this.title = title;
        this.pageNumber = pageNumber;
    }

    public Magazine() {
        this.title = "Vogue";
        this.pageNumber = 34;
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
        return "title='" + title + '\'' +
                ", pageNumber=" + pageNumber ;
    }
}
