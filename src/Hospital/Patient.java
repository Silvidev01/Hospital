package Hospital;

public class Patient extends Person {
    public static String name;
    private int medicalrecordID;
        private String medicalinsurance;

        public Patient(int medicalrecordID) {
        this.medicalrecordID = medicalrecordID;
    }

    public Patient(String name, String lastname, String address, int age, String medicalinsurance) {
        super(name, lastname, address, age);
        this.medicalinsurance = medicalinsurance;
    }

    public int getMedicalrecordID(){
        return medicalrecordID;
    }

    public Patient(String s) {
        this.medicalinsurance = medicalinsurance;
        this.name = name;
    }

    public void setmedicalrecordID(int medicalrecordID) {
            this.medicalrecordID = medicalrecordID;
        }



    @Override
    public String print(){
        return medicalinsurance;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }


}
