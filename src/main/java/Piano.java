public class Piano extends Instruments{

    public String brand;

    public Piano(int purchasePrice, int salePrice, String brand) {
        super(purchasePrice, salePrice);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String play() {
        return "I'm a piano, deedledee";
    }
}
