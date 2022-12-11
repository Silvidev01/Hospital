package Hospital;

import java.time.LocalDate;
import java.util.Objects;

public class Employee extends Person {
    //fields
    private String title;
    private int employeeID;
    private String sector;
    private boolean status;

//constructors
    public Employee(String title, int employeeID, String sector, boolean estado) {
        this.title = title;
        this.employeeID = employeeID;
        this.sector = sector;
        this.status = estado;
    }

    public Employee(String name, String lastname, String address, LocalDate birthDate) {
        super(name, lastname, address, birthDate);
        this.name=name;
        this.lastname=lastname;
    }

    @Override
    public String print() {
        return title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public boolean isEstado() {
        return status;
    }

    public void setEstado(boolean estado) {
        this.status = status;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    @Override
    public String showperson() {
        return getName();
    }

    @Override
    public String toString() {
        return "Employee:" + "\nname" + getName() + "lastname" + getLastname() +
                "   " + title + ",  employeeID:" + employeeID +
                ",  sector: " + sector + "\nActive:" + status + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return getEmployeeID() == employee.getEmployeeID() && status == employee.status && getTitle().equals(employee.getTitle()) && getSector().equals(employee.getSector());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getTitle(), getEmployeeID(), getSector(), status);
    }
}




