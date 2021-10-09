public class Guitar extends Instruments{

    public String type;
    public int numStrings;

    public Guitar(int purchasePrice, int salePrice, String type, int numStrings) {
        super(purchasePrice, salePrice);
        this.type = type;
        this.numStrings = numStrings;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumStrings() {
        return numStrings;
    }

    public void setNumStrings(int numStrings) {
        this.numStrings = numStrings;
    }

    public String play() {
        return "I'm a guitar, dring";
    }
}
