package Hospital;

import java.util.List;

public class Main {
    public static void main (String [] args){

        EmployeeSave EmployeeSave = new EmployeeSave();
        Employee maria = new Employee("Nurse","10010","UTI",true);
        Employee fernando= new Employee("Maintenace operator", "10020", "Instalations", true);
        Employee Juan= new Employee("Doctor", "10005","Operating room",true);

        EmployeeSave.save(maria);
        EmployeeSave.save(fernando);
        EmployeeSave.save(Juan);

        List<Employee> employees=EmployeeSave.findAll();
        System.out.println(employees);

        Patient ricardo=new Patient("Ricardo");
        MedicalAttention.showpatient();
    }
}
