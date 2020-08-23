package lesson9.stock;


public class Stock {

    private String name;
    private static Stock[] stocks = new Stock[10];

    public Stock(String name) {
        this.name = name;
    }


    public String getName() {
        return this.name;
    }

    public static void initDB() {
        stocks[0] = new Stock("утюг");
        stocks[1] = new Stock("сковородка");
        stocks[2] = new Stock("лыжи");
        stocks[3] = new Stock("утюг2");
        stocks[4] = new Stock("пылесос");
    }

    public static void showAll() {
        System.out.println("Показать всех: ");
        for (Stock stock : stocks) {
            System.out.println(stock);
        }
    }


    public String toString() {
        return "\nName: " + this.getName();
    }

    public static void main(String[] args) {
        initDB();
        showAll();
    }
}

