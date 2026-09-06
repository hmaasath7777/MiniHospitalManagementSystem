package hospital;

public class EmergencyQueue {
    private QueueNode front, rear;

    public EmergencyQueue() {
        front = null;
        rear = null;
    }

    // 1) Enqueue - waiting queue-ல patient சேர்க்க
    public void enqueue(Patient patient) {
        QueueNode newNode = new QueueNode(patient);
        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println("Patient " + patient.name + " added to emergency queue.");
    }

    // 2) Dequeue - treatment-க்கு அடுத்த patient-ஐ எடுக்க
    public Patient dequeue() {
        if (isEmpty()) {
            System.out.println("Emergency queue is empty. No patients waiting.");
            return null;
        }
        Patient removedPatient = front.patient;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        System.out.println("Patient " + removedPatient.name + " removed for treatment.");
        return removedPatient;
    }

    // 3) Display all patients currently waiting
    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("No patients currently waiting.");
            return;
        }
        System.out.println("--- Patients Waiting ---");
        QueueNode current = front;
        while (current != null) {
            current.patient.display();
            current = current.next;
        }
    }

    // 4) Empty queue check
    public boolean isEmpty() {
        return front == null;
    }
}
