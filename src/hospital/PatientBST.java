package hospital;

public class PatientBST {
    private BSTNode root;

    public PatientBST() {
        root = null;
    }

    // 1) Insert - புதிய patient சேர்க்க
    public void insert(Patient patient) {
        root = insertRec(root, patient);
    }

    private BSTNode insertRec(BSTNode node, Patient patient) {
        if (node == null) {
            return new BSTNode(patient);
        }
        if (patient.patientId < node.patient.patientId) {
            node.left = insertRec(node.left, patient);
        } else if (patient.patientId > node.patient.patientId) {
            node.right = insertRec(node.right, patient);
        } else {
            System.out.println("Patient ID already exists!");
        }
        return node;
    }

    // 2) Search - Patient ID வெச்சு தேட
    public Patient search(int id) {
        BSTNode result = searchRec(root, id);
        return (result != null) ? result.patient : null;
    }

    private BSTNode searchRec(BSTNode node, int id) {
        if (node == null || node.patient.patientId == id) {
            return node;
        }
        if (id < node.patient.patientId) {
            return searchRec(node.left, id);
        }
        return searchRec(node.right, id);
    }

    // 3) Delete - patient-ஐ நீக்க
    public void delete(int id) {
        root = deleteRec(root, id);
    }

    private BSTNode deleteRec(BSTNode node, int id) {
        if (node == null) return null;

        if (id < node.patient.patientId) {
            node.left = deleteRec(node.left, id);
        } else if (id > node.patient.patientId) {
            node.right = deleteRec(node.right, id);
        } else {
            // இது தான் delete பண்ணனும்ன்ற node

            // Case 1: children இல்லாத node (leaf)
            if (node.left == null && node.right == null) {
                return null;
            }
            // Case 2: ஒரே ஒரு child மட்டும் இருந்தா
            if (node.left == null) return node.right;
            if (node.right == null) return node.left;

            // Case 3: இரண்டு children-உம் இருந்தா
            // right subtree-ல இருக்கிற மிகச் சின்ன (minimum) patient-ஐ எடுத்து
            Patient minPatient = findMin(node.right);
            node.patient = minPatient;
            node.right = deleteRec(node.right, minPatient.patientId);
        }
        return node;
    }

    private Patient findMin(BSTNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node.patient;
    }

    // 4) In-order Traversal - Patient ID ascending order-ல காட்ட
    public void inorderTraversal() {
        inorderRec(root);
    }

    private void inorderRec(BSTNode node) {
        if (node != null) {
            inorderRec(node.left);
            node.patient.display();
            inorderRec(node.right);
        }
    }
}