package expense;

public class Expense {

    int id;
    String title;
    String category;
    double amount;

    public Expense(int id, String title, String category, double amount) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.amount = amount;
    }
}