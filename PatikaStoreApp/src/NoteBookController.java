import java.util.ArrayList;
import java.util.Scanner;

public class NoteBookController implements ProductController{
    private ArrayList <Notebook> notebooks = new ArrayList<>();
    Scanner input = new Scanner(System.in) ;

    public NoteBookController(){
        /*name,brand,id,type,price,discount,stock,Ram,SreenSize,Memory */
        this.notebooks.add(new Notebook("HUAWEI Matebook 14",this.brandlist.brandList.get(3),1,
               "Notebook",7000,0,100,16,14.0,512 ));

        this.notebooks.add(new Notebook("LENOVO V14 IGL",this.brandlist.brandList.get(1),2,"Notebook",
                3700,0,100,8,14.0,1024));

        this.notebooks.add(new Notebook("ASUS Tuf Gaming",this.brandlist.brandList.get(5),3,"Notebook",
                8199,0,100,32,15.6,2048));
    }
    @Override
    public void look() {
        System.out.println("Notebook Listesi");
        String str = "___________________________________________________________________________________________________";
        System.out.println(str);
            System.out.println("| ID | Ürün Adı                              | Fiyat     | Marka    | Depolama  | Ekran     |RAM  |");
        System.out.println(str);
        for (Notebook n:this.notebooks
             ) {
            System.out.println("| "+n.getId()+" | "+n.getName()+" | "+ n.getPrice()+" | " + n.getBrand().getName()+" | "+n.getMemory() +" | " + n.getScreenSize() +" | " +
                     n.getRam());
        }
        System.out.println(str);
    }

    @Override
    public void add() {
        this.look();
        System.out.println("Ekleyebilecğniz Markalar");
        for (Brand brand: this.brandlist.brandList
        ) {
            System.out.println("- "+brand.getName());
        }
        System.out.print("Lütfen eklemek istediğiniz Markanın id'sini giriniz:");
        int brandId = this.input.nextInt();
        System.out.print("Lütfen eklemek isteiğiniz Notebook modeliniz giriniz:");
        this.input.nextLine();
        String notebookName = this.input.nextLine();
        System.out.print("Lütfen yukardakilerden farklı bir ürün id' veriniz");
        int notebookId = this.input.nextInt();
        System.out.print("Lütfen Notebook türünüz yazınız:");
        this.input.nextLine();
        String notebookType = this.input.nextLine();
        System.out.print("Lütfen ürünün fiyatını girniz: ");
        int notebookPrice = this.input.nextInt();
        System.out.print("Lütfen ürnün stoğunu giriniz: ");
        int notebookStock = this.input.nextInt();
        System.out.print("Lütfen Notebook 'un RAM miktarını yazınız: ");
        int notebookRam = this.input.nextInt();
        System.out.print("Lütfen Notebook ekran boyutunu girniz: ");
        this.input.nextLine();
        double notebookScreenSize =this.input.nextDouble();
        System.out.print("Lütfen Notebook hafıza Boyutunu yazınız: ");
        int notebookMemory = input.nextInt();
        notebooks.add(new Notebook(notebookName,brandlist.brandList.get(brandId),notebookId,notebookType,notebookPrice,0,
                notebookStock,notebookRam,notebookScreenSize,notebookMemory));
        this.look();
    }

    @Override
    public void remove() {
        this.look();
        int removeindex = this.input.nextInt();
        this.notebooks.remove(removeindex-1);
        System.out.println("silme işlemi gerçekleştirildi");
        this.look();
    }
}
