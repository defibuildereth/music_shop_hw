public abstract class Stock implements ISell{

    public int purchasePrice;
    public int salePrice;

    public Stock(int purchasePrice, int salePrice) {
        this.purchasePrice = purchasePrice;
        this.salePrice = salePrice;
    }

    public int getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(int purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public int getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(int salePrice) {
        this.salePrice = salePrice;
    }
}
