package Interfaces;

import Hospital.Doctor;

public interface Ishowmedicalspecialty {
    default void showMedicalSpecialty() {
        System.out.println("Tiene la especialidad"+ Doctor.medicalspecialty);
    }
}
