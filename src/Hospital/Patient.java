package Hospital;

public class Patient extends Person {
        private medicalrecord medicalrecordID;
        public Patient (){medicalrecordID=0};

        public medicalrecord getMedicalrecordID {
            return medicalrecordID;
        }

        public void setmedicalrecordID(int medicalrecordID) {
            this.medicalrecordID = medicalrecordID;
        }
    }
    @Override
    public String print(){
        System.out.println("Hola");

}

}
