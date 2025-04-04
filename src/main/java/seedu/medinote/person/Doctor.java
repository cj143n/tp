package seedu.medinote.person;

public class Doctor {
    private String name;
    private String specialisation;
    private String availability;
    private String patientsBeingTreated;
    private Integer numPatientsTreated; // includes patients currently treating

    public Doctor(String name, String specialisation, String availability, String patientsBeingTreated) {
        this.name = name;
        this.specialisation = specialisation;
        this.availability = availability;
        this.patientsBeingTreated = patientsBeingTreated;
        if(patientsBeingTreated.trim().isEmpty() || patientsBeingTreated.equalsIgnoreCase("na")) {
            this.numPatientsTreated = 0;
        } else {
            this.numPatientsTreated = 1;
        }
    }

    public String getName() {
        return name;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public String getAvailability() {
        return availability;
    }

    public String getPatientsBeingTreated() {
        return patientsBeingTreated;
    }

    public Integer getNumPatientsTreated() {
        return numPatientsTreated;
    }
    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public void setCurrentPatient(String patientName) {
        patientsBeingTreated = patientName.trim();
        if(!(patientName.trim().isEmpty() || patientName.equalsIgnoreCase("na"))) {
            numPatientsTreated++;
        }

    }

}
