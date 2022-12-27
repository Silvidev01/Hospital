package Hospital;

import java.util.Objects;

public class Employee extends Person {
    //fields
    private String title;
    private int employeeID;
    private String sector;
    private boolean status;

//constructors
   public Employee(String name, String lastname, String title, int employeeID, String sector, boolean status) {
       super.setName(name);
       super.setLastname(lastname);
       this.title = title;
       this.employeeID = employeeID;
       this.sector = sector;
       this.status = status;;
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

    public boolean isStatus() {
        return status;
    }

    public void setEstado(boolean status) {
        this.status = status;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    @Override
    public String showPerson() {
        return name;
    }
    @Override
    public String showPersonLastname() {
        return lastname;
    }
    @Override
    public String toString() {
        return "Employee:" + "\n" + getName() +" " + getLastname()  +
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




