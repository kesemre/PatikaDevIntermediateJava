public class Brand implements Comparable<ProductBase>{

    private String name;
    private int id;
    public Brand(String name,int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(ProductBase o) {
        return this.getName().compareTo(o.getBrand().getName());
    }


}
