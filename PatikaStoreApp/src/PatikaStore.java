import java.util.Scanner;

public class PatikaStore {
    CategoryList categoryList;
    BrandList brandList;
    NoteBookController noteBookController = new NoteBookController();
    PhoneController phoneController = new PhoneController();
    static Scanner scanner = new Scanner(System.in);
    public PatikaStore() {
        this.categoryList = new CategoryList();
        this.brandList = new BrandList();

    }

    public  void run(){

        System.out.println("Patika Store Hoşgeldiniz:D ");
        int chosse =0;
        for (String s: this.categoryList.list
             ) {
            System.out.println(chosse + ". "+s+" İşlemleri");
            ++chosse;
        }

        System.out.println(chosse + ". Marka Listele");
        ++chosse;
        System.out.println(chosse + ". Çıkış Yap");
        System.out.print("Tercihiniz: ");
        int input = scanner.nextInt();
        switch (input){
            case 0:
                System.out.println("Notebook İşlemleri");
                System.out.println("\n _______________________");
                System.out.println("1. Notebook Listesi Görüntüle");
                System.out.println("2. Notebook ekle");
                System.out.println("3. Notebook kaldır");
                int chosse0 = scanner.nextInt();
                System.out.println("Şeçim: " + chosse0);

                switch (chosse0){
                    case 1:
                        this.noteBookController.look();
                        break;
                    case 2:
                        this.noteBookController.add();
                        break;
                    case 3:
                        this.noteBookController.remove();
                        break;
                    default:
                        System.out.println("Yanlış sayı girildi");
                }
                this.run();
                break;
            case 1:
                System.out.println(" Telefon İşlemleri");
                System.out.println("\n _______________________");
                System.out.println("1. Telefon Listesi Görüntüle");
                System.out.println("2. Telefon ekle");
                System.out.println("3. Telefon kaldır");
                int chosse1 = scanner.nextInt();
                System.out.println("Şeçim: " + chosse1);
                switch (chosse1){
                    case 1:
                        this.phoneController.look();
                        break;
                    case 2:
                        this.phoneController.add();
                        break;
                    case 3:
                        this.phoneController.remove();
                        break;
                    default:
                        System.out.println("Yanlış sayı girildi");
                }
                this.run();
                break;
            case 2:
                System.out.println("Markalarımız");
                System.out.println("_________________________");
                for (Brand brand: this.brandList.brandList
                     ) {
                    System.out.println("- "+brand.getName());
                }
                this.run();
                break;
            case 3:
                System.out.println("Çıkış yapılıyor");
                System.out.println("Tekrar Görüşmek dileğiyle:D Görüşürüz.....");
                System.exit(0);
                break;

            default:
                System.out.println("yanlış Şeçim");
                this.run();



        }

    }
}
