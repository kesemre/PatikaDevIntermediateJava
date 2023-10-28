import java.util.Date;

public class Book {
    private String bookName;
    private int page;
    private String bookAuthorName;
    private String releaseDate;

    public Book(String bookName, int page, String bookAuthorName, String releaseDate) {
        this.bookName = bookName;
        this.page = page;
        this.bookAuthorName = bookAuthorName;
        this.releaseDate = releaseDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getBookAuthorName() {
        return bookAuthorName;
    }

    public void setBookAuthorName(String bookAuthorName) {
        this.bookAuthorName = bookAuthorName;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate (String releaseDate) {
        this.releaseDate = releaseDate;
    }
}
