package Hospital;

public class Tomography extends MedicalPractice{
    private double tomographycost
    protected Tomography(double mpcost, String mpname) {
        super(mpcost, mpname);
    }
    @Override
    public void printempCost() {

        System.out.println ("The Tomography cost is"+tomographycost)};
}
