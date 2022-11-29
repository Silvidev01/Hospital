package Hospital;

public class Doctor extends Person{
        private String medicalspecialty;
        private int doctorID;
        public Doctor (){medicalspecialty="";doctorID=0}

    @Override
    public String print() {
            System.out.println("Hola");

    }
        public String getMedicalspecialty() {
        return medicalspecialty;
    }

        public void setMedicalspecialty(String medicalspecialty) {
        this.medicalspecialty = medicalspecialty;
    }
        public int getDoctorID(){
        return doctorID;
}

}
