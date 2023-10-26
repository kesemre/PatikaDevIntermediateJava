public class ProductBase {
    public String category;
    private String name;
    private Brand brand;
    private int id ;
    private String type ;
    private int price;
    private double discount;
    private int stock;

    public ProductBase(String name, Brand brand, int id, String type, int price, double discount, int stock) {
        this.name = name;
        this.brand = brand;
        this.id = id;
        this.type = type;
        this.price = price;
        this.discount = discount;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
}

