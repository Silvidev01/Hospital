package Hospital;

public class Nurse extends Employee{
    private int nurseID;
    public Nurse (){nurseID=0}

    @Override
    public String print() {
        System.out.println("Hola");
    }

    public int getNurseID(){
        return nurseID;
    }
    public void setNurseID(int nurseID) {
        this.nurseID=nurseID
    }
}
