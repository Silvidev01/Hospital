package Hospital;

import Interfaces.Isavepatient;

import java.util.LinkedList;
import java.util.List;

public class PatientSave implements Isavepatient {
    private LinkedList<Patient> patients = new LinkedList<>();
    @Override
    public void save(Patient patient) {
       patients.add(patient);
    }
    public List<Patient> getPatient() {
        return patients;
    }
}
