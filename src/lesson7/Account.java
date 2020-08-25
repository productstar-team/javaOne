package lesson7;

public class Account {
    private int amount;
    private String name;

    public Account(int amount, String name) {
        this.amount = amount;
        this.name = name;
    }

    public int deduct(int amount, String accName) throws InsufficientAmountException {
        if (!accName.equals(this.name)){
            throw new AccessDeniedException("You don't have access to this account");
        }
        if (this.amount < amount){
            throw new InsufficientAmountException("Not enough money");
        }
        this.amount = this.amount - amount;
        return this.amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
