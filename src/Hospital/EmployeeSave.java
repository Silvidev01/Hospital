package Hospital;

import Interfaces.Isave;

import java.util.ArrayList;

public class EmployeeSave implements Isave {
    private ArrayList<Employee> employees = new ArrayList<>();

    @Override
    public void save(Employee Employee){
        employees.add(Employee);
}
        public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

   }