import java.io.*;
import java.util.*;

public class FileHandler {
    private static final String FILE_NAME = "complaints.txt";

    public static void saveComplaint(Complaint c) {
        try {
            FileWriter fw = new FileWriter(FILE_NAME, true);
            fw.write(c.toFileString() + "\n");
            fw.close();
        } catch (IOException e) {
            System.out.println("Error saving complaint.");
        }
    }

    public static List<Complaint> loadComplaints() {
        List<Complaint> list = new ArrayList<>();

        try {
            File file = new File(FILE_NAME);
            if (!file.exists()) return list;

            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                list.add(Complaint.fromFileString(line));
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("Error loading complaints.");
        }

        return list;
    }
}