import java.util.ArrayList;
import java.util.Scanner;

public class PhoneController implements ProductController{

    private ArrayList<Phone> phones = new ArrayList<>();
    Scanner input = new Scanner(System.in) ;
    public PhoneController(){
        /*name,Brand,id,type,price,discount,stock,Ram,screenSize,bataryPower,Memory,Color                        */
    this.phones.add(new Phone("SAMSUNG GALAXY A51",brandlist.brandList.get(1),1,"Telefon",3199,0,100,
            6,6.5,4000,128,"Siyah"));
        this.phones.add(new Phone("iPhone 11 64 GB",brandlist.brandList.get(3),2,"Telefon",7400 ,0,100,
                6,6.1,3500,64,"Mavi"));


    }

    @Override
    public void look() {
        System.out.println("Notebook Listesi");
        String str = "___________________________________________________________________________________________________";
        System.out.println(str);
        System.out.println("| ID | Ürün Adı                              | Fiyat     | Marka    | Depolama  | Ekran     |RAM  |");
        System.out.println(str);
        for (Phone phone:this.phones
        ) {
            System.out.println("| "+phone.getId()+" | "+phone.getName()+" | "+ phone.getPrice()+" | " + phone.getBrand().getName()+" | "+phone.getMemory() +" | " + phone.getScreenSize() +" | " +phone.getBataryPower()+" + "+
                    phone.getRam()+" | "+phone.getColor());
        }
        System.out.println(str);
    }

    @Override
    public void add() {
        this.look();
        System.out.println("Ekleyebilecğniz Markalar");
        for (Brand brand: this.brandlist.brandList) {
            System.out.println("- "+brand.getName());
        }
        System.out.print("Lütfen eklemek istediğiniz Markanın id'sini giriniz:");
        int brandId = this.input.nextInt();
        System.out.print("Lütfen eklemek isteiğiniz Telefon modeliniz giriniz:");
        this.input.nextLine();
        String phoneName = this.input.nextLine();
        System.out.print("Lütfen yukardakilerden farklı bir ürün id' veriniz");
        int phoneId = this.input.nextInt();
        System.out.print("Lütfen Telefon türünüz yazınız:");
        this.input.nextLine();
        String phoneType = this.input.nextLine();
        System.out.print("Lütfen ürünün fiyatını girniz: ");
        int phonePrice = this.input.nextInt();
        System.out.print("Lütfen ürnün stoğunu giriniz: ");
        int phoneStock = this.input.nextInt();
        System.out.print("Lütfen Telefon 'un RAM miktarını yazınız: ");
        int phoneRam = this.input.nextInt();
        System.out.print("Lütfen Telefon ekran boyutunu girniz: ");
        this.input.nextLine();
        double phoneScreenSize =this.input.nextDouble();
        System.out.print("Lütfen Telefonun Batarya kapasitesini yazınız: ");
        int phoneBatary = input.nextInt();
        System.out.print("Lütfen Telefon hafıza Boyutunu yazınız: ");
        int phoneMemory = input.nextInt();
        input.nextLine();
        String phoneColor = input.nextLine();

        phones.add(new Phone(phoneName,brandlist.brandList.get(brandId),phoneId,phoneType,phonePrice,0,
                phoneStock,phoneRam,phoneScreenSize,phoneBatary,phoneMemory,phoneColor));
        this.look();
    }



    @Override
    public void remove() {
        this.look();
        int removeindex = this.input.nextInt();
        this.phones.remove(removeindex-1);
        System.out.println("silme işlemi gerçekleştirildi");
        this.look();
    }

}
