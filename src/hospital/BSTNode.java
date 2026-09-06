package hospital;

public class BSTNode {
    Patient patient;
    BSTNode left, right;

    public BSTNode(Patient patient) {
        this.patient = patient;
        this.left = null;
        this.right = null;
    }
}
