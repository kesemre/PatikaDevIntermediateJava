import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {


        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Kürk Mantolu Madonna",160,"Sabahattin ALi","1943"));
        books.add(new Book("Hayvan çiftliği",152,"George orwell","152"));
        books.add(new Book("Satranç",83,"Stefan Zweig","1941" ));
        books.add(new Book("Küçük prens",112,"Antoine de Saint-Exupéry","1943"));
        books.add(new Book("Şeker Portakalı",184,"José Mauro de Vasconcelos","1968"));
        books.add(new Book("Dönüşüm",74,"Franz Kafka","1915"));
        books.add(new Book("Simyacı",188,"Paulo Coelho","1988"));
        books.add(new Book("İnsan Neyle Yaşar?",96,"Lev Tolstoy","1885"));
        books.add(new Book("Fareler ve İnsanlar",125,"John Steinbeck","1937"));
        books.add(new Book("Yabancı",112,"Albert Camus","1942"));

        Map<String,String> booksMap = new TreeMap<>();
        books.stream().forEach(book -> booksMap.put(book.getBookName(), book.getBookAuthorName()));
        ArrayList<Book> moreThan100Page = new ArrayList<>();
        books.stream().filter(book -> book.getPage()>=100).forEach(book -> moreThan100Page.add(book));

        moreThan100Page.stream().forEach(book -> System.out.println(book.getBookName()));
        System.out.println(moreThan100Page.size());

    }
}