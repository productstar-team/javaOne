package lesson7;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(10000, "acc1");
        try {
            int remains = account.deduct(9000, "acc2");
            System.out.println(remains);
        } catch (InsufficientAmountException e) {
            System.out.println(e.getMessage());
        }
    }
}
