package Exceptions;

public class EmployeeNotFound extends Exception{

    private String desc;

    public EmployeeNotFound(String desc, String message){
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
