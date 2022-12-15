package Exceptions;

public class DoctorNotFoundException extends Exception{
    private String desc;

    public DoctorNotFoundException(String desc, String message){
        super(message);
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
