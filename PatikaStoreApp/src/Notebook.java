public class Notebook extends ProductBase{

    private int Ram;
    private double screenSize;
    private int Memory;

    public Notebook(String name, Brand brand, int id, String type,
                    int price, double discount, int stock,int Ram,double screenSize, int Memory ) {
        super(name, brand, id, type, price, discount, stock);
        this.Ram = Ram;
        this.screenSize = screenSize;
        this.Memory = Memory;
        this.category="Notebook";

    }

    public int getRam() {
        return Ram;
    }

    public void setRam(int ram) {
        Ram = ram;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getMemory() {
        return Memory;
    }

    public void setMemory(int memory) {
        Memory = memory;
    }
}
