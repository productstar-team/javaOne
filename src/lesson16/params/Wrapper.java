package lesson16.params;

public class Wrapper<T> {
    private int price;
    private T asset;

    public Wrapper(int price, T asset) {
        this.price = price;
        this.asset = asset;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public T getAsset() {
        return asset;
    }
}
