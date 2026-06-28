package expense;

import java.util.ArrayList;

public class ExpenseManager {

    ArrayList<Expense> expenses = new ArrayList<>();

    // Add Expense
    public void addExpense(Expense e) {
        expenses.add(e);
        System.out.println("Expense added successfully.");
    }

    // View Expenses
    public void viewExpenses() {

        if (expenses.isEmpty()) {
            System.out.println("No expenses found.");
            return;
        }

        System.out.println("---------------------------------------------------------------------");
        System.out.printf("%-8s %-20s %-20s %-10s%n",
                "ID", "Title", "Category", "Amount");
        System.out.println("---------------------------------------------------------------------");

        for (Expense e : expenses) {
            System.out.printf("%-8d %-20s %-20s ₹%-10.2f%n",
                    e.id, e.title, e.category, e.amount);
        }

        System.out.println("---------------------------------------------------------------------");
    }

    // Search Expense by ID
    public void searchExpense(int id) {

        for (Expense e : expenses) {

            if (e.id == id) {
                System.out.println("\nExpense Found");
                System.out.println("ID       : " + e.id);
                System.out.println("Title    : " + e.title);
                System.out.println("Category : " + e.category);
                System.out.println("Amount   : ₹" + e.amount);
                return;
            }
        }

        System.out.println("Expense not found.");
    }

    // Calculate Total Expense
    public void calculateTotalExpense() {

        double total = 0;

        for (Expense e : expenses) {
            total += e.amount;
        }

        System.out.println("Total Expense = ₹" + total);
    }

    // Delete Expense
    public void deleteExpense(int id) {

        for (int i = 0; i < expenses.size(); i++) {

            if (expenses.get(i).id == id) {

                expenses.remove(i);
                System.out.println("Expense deleted successfully.");
                return;
            }
        }

        System.out.println("Expense not found.");
    }

    // Search by Category
    public void searchByCategory(String category) {

        boolean found = false;

        for (Expense e : expenses) {

            if (e.category.equalsIgnoreCase(category)) {

                if (!found) {
                    System.out.println("\nExpenses in Category: " + category);
                    System.out.println("----------------------------------------");
                    System.out.println("ID\tTitle\tAmount");
                    found = true;
                }

                System.out.println(e.id + "\t" + e.title + "\t₹" + e.amount);
            }
        }

        if (!found) {
            System.out.println("No expenses found in this category.");
        }
    }

    // Update Expense
    public void updateExpense(int id, double newAmount) {

        for (Expense e : expenses) {

            if (e.id == id) {

                e.amount = newAmount;
                System.out.println("Expense updated successfully.");
                return;
            }
        }

        System.out.println("Expense not found.");
    }

    // Return Expense List
    public ArrayList<Expense> getExpenses() {
        return expenses;
    }
}