package hospital;

public class Patient {
    int patientId;
    String name;
    int age;
    String contactNumber;
    String medicalCondition;

    VisitNode visitHistoryHead; // patient-ஓட visit history-ஓட start point (Linked List)

    public Patient(int patientId, String name, int age, String contactNumber, String medicalCondition) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.contactNumber = contactNumber;
        this.medicalCondition = medicalCondition;
        this.visitHistoryHead = null; // ஆரம்பத்துல எந்த visit-உம் இல்ல
    }

    public void display() {
        System.out.println("ID: " + patientId + " | Name: " + name + " | Age: " + age +
                " | Contact: " + contactNumber + " | Condition: " + medicalCondition);
    }
}