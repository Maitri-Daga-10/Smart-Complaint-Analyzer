import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ComplaintManager manager = new ComplaintManager();

        while (true) {
            System.out.println("\n===== Smart Complaint Analyzer =====");
            System.out.println("1. Add Complaint");
            System.out.println("2. View All Complaints");
            System.out.println("3. Search Complaint");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter complaint: ");
                    String text = sc.nextLine();
                    manager.addComplaint(text);
                    break;

                case 2:
                    manager.showComplaints();
                    break;

                case 3:
                    System.out.print("Enter keyword to search: ");
                    String keyword = sc.nextLine();
                    manager.searchComplaints(keyword);
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}