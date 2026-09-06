package hospital;

public class Main {
    public static void main(String[] args) {
        PatientBST bst = new PatientBST();

        bst.insert(new Patient(101, "Kumar", 45, "0771234567", "Fracture"));
        bst.insert(new Patient(105, "Nisha", 30, "0779876543", "Fever"));
        bst.insert(new Patient(102, "Saman", 60, "0712345678", "Heart Pain"));

        System.out.println("--- All Patients (In-order) ---");
        bst.inorderTraversal();

        System.out.println("\n--- Search ID 102 ---");
        Patient p = bst.search(102);
        if (p != null) p.display();

        System.out.println("\n--- Delete ID 101 ---");
        bst.delete(101);
        bst.inorderTraversal();
    }
}