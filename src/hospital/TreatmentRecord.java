package hospital;

public class TreatmentRecord {
    int patientId;
    String patientName;
    String treatmentGiven;
    String treatmentDate;

    public TreatmentRecord(int patientId, String patientName, String treatmentGiven, String treatmentDate) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.treatmentGiven = treatmentGiven;
        this.treatmentDate = treatmentDate;
    }

    public void display() {
        System.out.println("Patient ID: " + patientId + " | Name: " + patientName +
                " | Treatment: " + treatmentGiven + " | Date: " + treatmentDate);
    }
}
