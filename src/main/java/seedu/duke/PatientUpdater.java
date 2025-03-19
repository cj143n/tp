package seedu.duke;

public class PatientUpdater {
    public static void updatePatient(String patientDetails) {
        String[] details = patientDetails.split(" ", 3);
        if (details.length < 3) {
            System.out.println("Invalid format. Use: update patient <NAME> <TREATMENT STATUS> <DOCTOR ASSIGNED>");
            return;
        }
        Patient patient = PatientListManager.getPatientList()
                .stream()
                .filter(p -> p.getName().equalsIgnoreCase(details[0]))
                .findFirst()
                .orElse(null);
        if (patient == null) {
            System.out.println("Patient not found.");
            return;
        }
        patient.setTreatmentStatus(details[1]);
        patient.setDoctorAssigned(details[2]);
        System.out.println("Patient information updated successfully.");
    }
}
