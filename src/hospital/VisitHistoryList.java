package hospital;

public class VisitHistoryList {

    // 1) Add a new visit - Patient-ஓட history-ல புது visit சேர்க்க
    public void addVisit(Patient patient, VisitNode newVisit) {
        if (patient.visitHistoryHead == null) {
            patient.visitHistoryHead = newVisit;
        } else {
            VisitNode current = patient.visitHistoryHead;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newVisit;
        }
        System.out.println("Visit added for " + patient.name);
    }

    // 2) Remove a visit - Visit ID வெச்சு நீக்க
    public void removeVisit(Patient patient, int visitId) {
        VisitNode current = patient.visitHistoryHead;
        VisitNode previous = null;

        if (current == null) {
            System.out.println("No visit history found for " + patient.name);
            return;
        }

        // முதல் node-ஏ remove பண்ணனும்னா
        if (current.visitId == visitId) {
            patient.visitHistoryHead = current.next;
            System.out.println("Visit ID " + visitId + " removed for " + patient.name);
            return;
        }

        while (current != null && current.visitId != visitId) {
            previous = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("Visit ID " + visitId + " not found.");
            return;
        }

        previous.next = current.next;
        System.out.println("Visit ID " + visitId + " removed for " + patient.name);
    }

    // 3) Search a visit - Visit ID வெச்சு தேட
    public VisitNode searchVisit(Patient patient, int visitId) {
        VisitNode current = patient.visitHistoryHead;
        while (current != null) {
            if (current.visitId == visitId) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    // 4) Display visit history
    public void displayHistory(Patient patient) {
        if (patient.visitHistoryHead == null) {
            System.out.println("No visit history for " + patient.name);
            return;
        }
        System.out.println("--- Visit History for " + patient.name + " ---");
        VisitNode current = patient.visitHistoryHead;
        while (current != null) {
            current.display();
            current = current.next;
        }
    }
}
