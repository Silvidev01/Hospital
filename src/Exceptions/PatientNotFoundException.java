package Exceptions;

public class PatientNotFoundException extends Exception {
        private String desc;

        public PatientNotFoundException(String desc, String message){
            super(message);
        }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
