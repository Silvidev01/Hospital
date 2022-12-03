package Hospital;

public class Doctor extends Person{

    public static String name;
    public static String medicalspecialty;

        private int doctorID;
        public Doctor (){medicalspecialty="";doctorID=0;}
    public Doctor(String name, String lastname, String address, int age, int doctorID) {
        super(name, lastname, address, age);
        this.doctorID = doctorID;
    }
        @Override
        public String print () {
            return medicalspecialty;
        }
        public String getMedicalspecialty () {
            return medicalspecialty;
        }

        public void setMedicalspecialty(String medicalspecialty) {
        this.medicalspecialty = medicalspecialty;
    }
        public int getDoctorID(){
        return doctorID;
    }

}
