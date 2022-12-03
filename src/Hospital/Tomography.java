package Hospital;

public class Tomography extends MedicalPractice{
    private double tomographycost;
    public Tomography(double mpcost, String mpname, double tomographycost) {
        super(mpcost, mpname);
        this.tomographycost = tomographycost;
    }

    @Override
    public double showCost() {
    return tomographycost;
    }
}
