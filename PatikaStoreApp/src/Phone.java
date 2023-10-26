public class Phone extends ProductBase{
    private int Ram;

    private double screenSize;
    private int bataryPower;
    private int Memory;
    private String Color;

    public Phone(String name, Brand brand, int id, String type, int price, double discount, int stock, int Ram,
                 double screenSize, int bataryPower, int Memory, String Color) {
        super(name, brand, id, type, price, discount, stock);
        this.Ram = Ram;
        this.screenSize = screenSize;
        this.bataryPower = bataryPower;
        this.Memory = Memory;
        this.Color = Color;
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

    public int getBataryPower() {
        return bataryPower;
    }

    public void setBataryPower(int bataryPower) {
        this.bataryPower = bataryPower;
    }

    public int getMemory() {
        return Memory;
    }

    public void setMemory(int memory) {
        Memory = memory;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }
}
