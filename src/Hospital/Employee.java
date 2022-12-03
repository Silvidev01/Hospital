package Hospital;

public class Employee extends Person {
    private String title;
    private int employeeID;
    private String sector;
    private boolean estado;


    public Employee(String title, int employeeID, String sector, boolean estado) {
        this.title = title;
        this.employeeID = employeeID;
        this.sector = sector;
        this.estado = estado;
    }

    public Employee(String name, String lastname, String address, int age, String title, int employeeID, String sector, boolean estado) {
        super(name, lastname, address, age);
        this.title = title;
        this.employeeID = employeeID;
        this.sector = sector;
        this.estado = estado;
    }

    public Employee(String name, String lastname, String address, int age, String title) {
        super(name, lastname, address, age);
        this.title = title;

    }

    public Employee(String title, String s, String uti, boolean estado) {
    }

    @Override
    public String print() {
        return title;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "title='" + title + '\'' +
                ", employeeID=" + employeeID +
                ", sector='" + sector + '\'' +
                ", Active=" + estado +
                '}';
    }
}



