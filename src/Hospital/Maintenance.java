package Hospital;

public class Maintenance extends Employee {
    private String category

    public Maintenance(String name, String lastname, String address, int age, String title) {
        super(name, lastname, address, age, title);
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    @Override
    public void abstract calculateSalary(); {
        return=1000}
    }

}
