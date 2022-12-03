package Hospital;
// this class is the medical record that is unique for each patient and has all the medical hsitory of the patient, date, consultation and doctor's notes //

public class medicalrecord {
    private String name;
    private String lastname;
    private int medicalrecordID;
    private String date;
    private String appointmentnotes;

    public medicalrecord(){name="";lastname="";medicalrecordID=0;date="";appointmentnotes="";}

    public String getname() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getMedicalrecordID() {
        return medicalrecordID;
    }
    public void setMedicalrecordID(){
        this.medicalrecordID=medicalrecordID;
    }
    public String getdate(){
        return date;
    }
    public void setDate(){
        this.date=date;
    }
    public String getAppointmentnotes(){
        return appointmentnotes;
    }
    public void setAppointmentnotes(String appointmentnotes){
        this.appointmentnotes=appointmentnotes;
    }

}
