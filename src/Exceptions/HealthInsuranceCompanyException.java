package Exceptions;

public class HealthInsuranceCompanyException extends Exception {
    private String desc;

    public HealthInsuranceCompanyException(String desc) {

        super(desc);
        this.desc = desc;
    }
}