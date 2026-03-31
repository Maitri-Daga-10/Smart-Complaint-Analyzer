import java.util.*;

public class ComplaintManager {
    List<Complaint> complaints;

    public ComplaintManager() {
        complaints = FileHandler.loadComplaints();
    }

    public void addComplaint(String text) {
        String category = categorize(text.toLowerCase());
        String priority = assignPriority(text.toLowerCase());

        Complaint c = new Complaint(text, category, priority);
        complaints.add(c);

        FileHandler.saveComplaint(c);
        System.out.println("Complaint added successfully!");
    }

    private String categorize(String text) {
        if (text.contains("road") || text.contains("pothole"))
            return "Road";
        if (text.contains("water") || text.contains("tap"))
            return "Water";
        if (text.contains("electricity") || text.contains("power"))
            return "Electricity";
        return "Other";
    }

    private String assignPriority(String text) {
        if (text.contains("urgent") || text.contains("danger"))
            return "HIGH";
        return "LOW";
    }

    public void showComplaints() {
        if (complaints.isEmpty()) {
            System.out.println("No complaints found.");
            return;
        }

        for (Complaint c : complaints) {
            c.display();
        }
    }

    public void searchComplaints(String keyword) {
        boolean found = false;

        for (Complaint c : complaints) {
            if (c.text.toLowerCase().contains(keyword.toLowerCase())) {
                c.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching complaints found.");
        }
    }
}
