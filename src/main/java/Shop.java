import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;
    private int till;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<>();
        this.till = 0;
    }

    public int getTill() {
        return till;
    }

    public void setTill(int till) {
        this.till = till;
    }

    public void increaseTill(int amount) {
        this.till += amount;
    }

    public void decreaseTill(int amount) {
        this.till -= amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void setStock(ArrayList<ISell> stock) {
        this.stock = stock;
    }

    public void addStock(ISell item) {
        this.stock.add(item);
    }

    public void removeStock(ISell item) {
        private int index = this.stock.indexOf(item);
        this.stock.remove(index);
    }
}
