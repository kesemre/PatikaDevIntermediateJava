public class Book implements Comparable<Book>{
    private final String bookName;
    private final String authorName;
    private final int pageNumber;
    private final String releaseDate;



    public Book(String bookName , String authorName, int pageNumber, String releaseDate){
       this.bookName = bookName;
       this.authorName=authorName;
       this.pageNumber = pageNumber;
       this.releaseDate = releaseDate;
        }
    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    @Override
    public int compareTo(Book o) {

        return this.authorName.compareTo(o.authorName);
    }

    public String getBook(){
        return "Kitap adı: "
                +this.bookName+"\nYazar: " + this.authorName+ "\nSayfa Sayısı: " +
                this.pageNumber + "\nBasım Yılı:" ;
    }
}
