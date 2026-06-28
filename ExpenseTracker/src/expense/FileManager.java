package expense;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {

    public static void saveExpenses(ArrayList<Expense> expenses) {

        try {

            FileWriter writer = new FileWriter("expenses.txt");

            for (Expense e : expenses) {

                writer.write(e.id + "," +
                             e.title + "," +
                             e.category + "," +
                             e.amount + "\n");
            }

            writer.close();

            System.out.println("Expenses saved successfully.");

        } catch (IOException e) {

            System.out.println("Error saving file.");
        }
    }
}