package Hospital;

import Exceptions.PatientNotFoundException;
import Interfaces.Ishowpatient;

import java.util.List;
import java.util.Scanner;

public class Main {



    public static void main (String [] args){

        EmployeeSave EmployeeSave = new EmployeeSave();


        //initializing employees
        Employee maria;
        maria = new Employee ("Nurse",10020,"UTI",true);
        Employee fernando= new Employee("Doctor", 10150, "Clinic", true);
        Employee Juan= new Employee("Receptionist", 10120,"Clinic",true);
        Employee Lucas = new Employee("Nurse", 10500, "Clinic",false);

        EmployeeSave.save(maria);
        EmployeeSave.save(fernando);
        EmployeeSave.save(Juan);
        EmployeeSave.save(Lucas);

        //initializing patients





        List<Employee> employees=EmployeeSave.findAll();
        System.out.println(employees);




    }
}
