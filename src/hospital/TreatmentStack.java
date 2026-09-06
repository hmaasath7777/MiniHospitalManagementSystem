package hospital;

import java.util.ArrayList;

public class TreatmentStack {
    private ArrayList<TreatmentRecord> stack;

    public TreatmentStack() {
        stack = new ArrayList<>();
    }

    // 1) Push - completed treatment record சேர்க்க
    public void push(TreatmentRecord record) {
        stack.add(record);
        System.out.println("Treatment record added for " + record.patientName);
    }

    // 2) Pop - அண்மையில முடிந்த treatment record-ஐ நீக்க
    public TreatmentRecord pop() {
        if (isEmpty()) {
            System.out.println("No treatment records available.");
            return null;
        }
        TreatmentRecord removed = stack.remove(stack.size() - 1);
        System.out.println("Removed most recent treatment record for " + removed.patientName);
        return removed;
    }

    // 3) Display treatment records (LIFO order - சமீபத்தியது முதலில்)
    public void displayStack() {
        if (isEmpty()) {
            System.out.println("No treatment records to display.");
            return;
        }
        System.out.println("--- Treatment History (Most Recent First) ---");
        for (int i = stack.size() - 1; i >= 0; i--) {
            stack.get(i).display();
        }
    }

    // 4) Empty stack check
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
