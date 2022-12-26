package Hospital;

import java.time.LocalDate;

import static java.lang.System.out;

public class Patient extends Person {
//fields
    private int medicalrecordID;
    String medicalinsurance;

    //Constructors

    public Patient(){};

     public Patient(String name, String lastname, String address, LocalDate birthDate, int medicalrecordID, String medicalinsurance) {
        super(name, lastname);
        this.medicalrecordID = medicalrecordID;
        this.medicalinsurance = medicalinsurance;
    }
//getters and setters
    public int getMedicalrecordID(){
        return medicalrecordID;
    }

      public void setmedicalrecordID(int medicalrecordID) {
            this.medicalrecordID = medicalrecordID;
        }

    public String getMedicalinsurance() {
        return medicalinsurance;
    }

    public void setMedicalinsurance(String medicalinsurance) {
        this.medicalinsurance = medicalinsurance;
    }
//methods
    @Override
    public String print(){
        return getMedicalinsurance();
    }
    @Override
    public String showPerson() {
        return getName();
    }

    @Override
    public String showPersonLastname() {
        return getLastname();
    }

    public void showPatientMeIn() {
        out.println("The patient  "+ getName() + "has" + getMedicalinsurance() + "medical insurance");
    }
    public String getPatient(){
        String fullname = getName() + "  " + lastname;
        return fullname;
    }

    @Override
    public String toString() {
        return "Patient information:\n" + "Name:"+ getName() + "\nLast Name:" + getLastname() + "\nDate of Birth:" + getBirthDate();}

}

