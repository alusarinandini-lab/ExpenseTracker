package expense;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ExpenseManager manager = new ExpenseManager();

        while (true) {

            System.out.println("\n===== Expense Tracker =====");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Search Expense");
            System.out.println("4. Total Expense");
            System.out.println("5. Delete Expense");
            System.out.println("6. Search By Category");
            System.out.println("7. Update Expense");
            System.out.println("8 Save Expenses");
            System.out.println("9 Exit");
            System.out.println("Enter your choice: ");


            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Expense ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Category: ");
                    String category = sc.nextLine();

                    System.out.print("Enter Amount: ");
                    double amount = sc.nextDouble();

                    manager.addExpense(new Expense(id, title, category, amount));
                    break;

                case 2:
                    manager.viewExpenses();
                    break;

                case 3:
                    System.out.print("Enter Expense ID to search: ");
                    int searchId = sc.nextInt();
                    manager.searchExpense(searchId);
                    break;

                case 4:
                    manager.calculateTotalExpense();
                    break;

                case 5:
                    System.out.print("Enter Expense ID to delete: ");
                    int deleteId = sc.nextInt();
                    manager.deleteExpense(deleteId);
                    break;

                case 6:

                    sc.nextLine();

                    System.out.print("Enter Category: ");
                    String cat = sc.nextLine();

                    manager.searchByCategory(cat);
                    break;

                case 7:

                    System.out.print("Enter Expense ID: ");
                    int updateId = sc.nextInt();

                    System.out.print("Enter New Amount: ");
                    double newAmount = sc.nextDouble();

                    manager.updateExpense(updateId, newAmount);
                    break;

                case 8:

                    FileManager.saveExpenses(manager.getExpenses());
                    break;

                case 9:

                    System.out.println("Thank you for using Expense Tracker!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}