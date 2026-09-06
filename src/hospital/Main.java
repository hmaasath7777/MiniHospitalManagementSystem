package hospital;

public class Main {
    public static void main(String[] args) {

        // ---------- BST Testing ----------
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

        // ---------- Emergency Queue Testing ----------
        System.out.println("\n\n=== Emergency Queue Testing ===");
        EmergencyQueue queue = new EmergencyQueue();

        Patient p1 = new Patient(201, "Anwar", 25, "0761112222", "Accident Injury");
        Patient p2 = new Patient(202, "Priya", 40, "0763334444", "Chest Pain");
        Patient p3 = new Patient(203, "Ravi", 35, "0765556666", "Burn Injury");

        queue.enqueue(p1);
        queue.enqueue(p2);
        queue.enqueue(p3);

        System.out.println("\n--- Current Waiting Queue ---");
        queue.displayQueue();

        System.out.println("\n--- Dequeue (Next patient for treatment) ---");
        queue.dequeue();

        System.out.println("\n--- Updated Waiting Queue ---");
        queue.displayQueue();

        // ---------- Treatment Stack Testing ----------
        System.out.println("\n\n=== Treatment Stack Testing ===");
        TreatmentStack treatmentStack = new TreatmentStack();

        treatmentStack.push(new TreatmentRecord(201, "Anwar", "Wound Dressing", "2026-09-06"));
        treatmentStack.push(new TreatmentRecord(202, "Priya", "ECG and Medication", "2026-09-06"));
        treatmentStack.push(new TreatmentRecord(203, "Ravi", "Burn Ointment Applied", "2026-09-06"));

        System.out.println("\n--- All Treatment Records ---");
        treatmentStack.displayStack();

        System.out.println("\n--- Pop (Remove most recent treatment) ---");
        treatmentStack.pop();

        System.out.println("\n--- Updated Treatment Records ---");
        treatmentStack.displayStack();
    }
}