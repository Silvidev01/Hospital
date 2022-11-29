package Hospital;

public abstract class Employee extends Person {
    private String title;
    private int employeeID;
    private String sector

    public Employee(String name, String lastname, String address, int age, String title) {
        super(name, lastname, address, age);
        this.title = title;

    }

    @Override
    public String print() {
        return title;
    }

    public abstract String print();
}
    public void abstract calculateSalary();

}


