package Hospital;

public abstract class MedicalPractice {
    private double mpcost
    private String mpname

    protected MedicalPractice(double mpcost, String mpname) {
        this.mpcost = mpcost;
        this.mpname = mpname;
    }

    public double getMpcost() {
        return mpcost;
    }

    public void setMpcost(double mpcost) {
        this.mpcost = mpcost;
    }
    public String getMpname() {
        String mpname1 = mpname;
        return mpname1;
    }
    public void setMpname(String mpname) {
        this.mpname=mpname;
    }
    public abstract void calculatempCost(){

       }




    }


}
