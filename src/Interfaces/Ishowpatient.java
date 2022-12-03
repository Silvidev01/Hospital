package Interfaces;

import Hospital.Patient;

public interface Ishowpatient {
    static void showpatient() {
        System.out.println("El paciente  "+ Patient.name);
    }
}
