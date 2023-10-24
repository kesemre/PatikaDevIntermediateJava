import java.util.TreeSet;

public class Main {
    /*Book isminde bir sınıf tasarlayınız.
    Bu sınıf Comparable interface'den kalıtım alıp "compareTo" metodunu override ediniz.
    Bu metodun içinde kitabı A'dan Z'ye isme göre sıralayan kodu yazınız.
    Bu sınıftan 5 tane nesne oluşturun ve nesneleri Set tipinde bir yapısında saklayınız.
    Sonra ikinci kez Set tipinden bir veri yapısı kullanın ve
    kitapları sayfa sayısına göre sıralamasını sağlayınız.
    Book sınıfı kitap ismi, sayfa sayısı, yazarın ismi, yayın tarihi değişkenlerinden oluşmaktadır.*/
    public static void main(String[] args) {
        TreeSet<Book> treeSet = new TreeSet<>();
        TreeSet<Book> treeSetPage = new TreeSet<>(new ComparatorPage());
        TreeSet<Book> treeSetName = new TreeSet<>(new ComparatorBookName());

        Book[] books = {new Book("Seksen Günde Devrialem","J.verne",216,"2013"),
                        new Book("Gün Olursa Asra Bedel ","Cengiz Aytmatov",426,"2013")
                        ,new Book("Genetik 101","Beth Skwareckı",231,"2021")
                        ,new Book("Sherlock Holmes","Sır Artur Conan Doyle",384,"2017")
                        ,new Book("İki yıl Okul Tatili","Jules Verne",173,"2019")};
        for (Book b:books) {
            treeSetPage.add(b);
            treeSetName.add(b);
            treeSet.add(b);
        }
        System.out.println("Kitap İsmine göre");
        for (Book b: treeSetName
             ) {
            System.out.println("Yazar: " + b.getAuthorName() + " Kitap: " + b.getBookName() +" Sayfa: " + b.getPageNumber() );

        }

        System.out.println("Kitap sayfasına göre");
        for (Book b: treeSetPage
        ) {
            System.out.println("Yazar: " + b.getAuthorName() + " Kitap: " + b.getBookName() +" Sayfa: " + b.getPageNumber() );

        }
        System.out.println("Kitap yazarına göre");
        for (Book b: treeSet
        ) {
            System.out.println("Yazar: " + b.getAuthorName() + " Kitap: " + b.getBookName() +" Sayfa: " + b.getPageNumber() );

        }






    }
}