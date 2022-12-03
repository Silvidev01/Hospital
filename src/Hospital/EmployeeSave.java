package Hospital;

import Interfaces.Isave;

import java.util.ArrayList;
import java.util.List;

public class EmployeeSave implements Isave {
    private List<Employee> employees = new ArrayList<>();
    @Override
    public void save(Employee Employee){
        employees.add(Employee);
}
    public List<Employee> findAll(){
    return employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}