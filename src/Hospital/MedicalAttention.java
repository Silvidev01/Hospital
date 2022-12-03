package Hospital;

import Interfaces.Ishowdoctor;
import Interfaces.Ishowmedicalspecialty;
import Interfaces.Ishowpatient;

public class MedicalAttention implements Ishowmedicalspecialty, Ishowdoctor, Ishowpatient {


   public static void showpatient() {
        System.out.println("El paciente"+ Patient.name);

    }

    @Override
    public void showdoctor() {
        System.out.println("El doctor"+ Doctor.name);
    }

    @Override
    public void showMedicalSpecialty() {
        Ishowmedicalspecialty.super.showMedicalSpecialty();
    }
}
