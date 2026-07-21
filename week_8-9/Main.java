import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> tasks = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("====== ADD TASKS ======");

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter Task " + (i + 1) + ": ");
            String task = input.nextLine();
            tasks.add(task);
        }

        System.out.println("\n====== TASK LIST ======");

        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }

        try {
            FileWriter writer = new FileWriter("task.txt");

            for (String task : tasks) {
                writer.write(task + "\n");
            }

            writer.close();
            System.out.println("Tasks saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving file.");
        }
try {
    BufferedReader reader = new BufferedReader(new FileReader("task.txt"));

    String line;

    System.out.println("\n====== TASKS LOADED FROM FILE ======");

    while ((line = reader.readLine()) != null) {
        System.out.println(line);
    }

    reader.close();
} catch (IOException e) {
    System.out.println("Error reading file.");
}
    
        
    }
}
