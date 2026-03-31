public class Complaint {
    String text;
    String category;
    String priority;

    public Complaint(String text, String category, String priority) {
        this.text = text;
        this.category = category;
        this.priority = priority;
    }

    public String toFileString() {
        return text + "|" + category + "|" + priority;
    }

    public static Complaint fromFileString(String line) {
        String[] parts = line.split("\\|");
        return new Complaint(parts[0], parts[1], parts[2]);
    }

    public void display() {
        System.out.println("Complaint: " + text);
        System.out.println("Category: " + category);
        System.out.println("Priority: " + priority);
        System.out.println("---------------------------");
    }
}
