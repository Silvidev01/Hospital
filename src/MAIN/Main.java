package MAIN;

import Exceptions.EmployeeNotFound;
import Exceptions.HealthInsuranceCompanyException;
import FileReader_Countwords.FileReader;
import Hospital.Doctor;
import Hospital.Employee;
import Hospital.Patient;
import Hospital.Receptionist;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.function.Predicate;

public class Main {


    public static void main(String[] args) throws HealthInsuranceCompanyException {

        final Logger LOGGER = LogManager.getLogger(Main.class);

        ArrayList<Employee> employees = new ArrayList<>();

        //initializing employees
         Employee em1;
            em1 = new Employee("Maria", "Fernandez", "Nurse", 10020, "UTI", true);
            Employee em2 = new Employee("Fernando", "Lopez", "Doctor", 10150, "Clinic", true);
            Employee em3 = new Employee("Juan", "Rodriguez", "Receptionist", 10120, "Clinic", true);
            Employee em4 = new Employee("Lucas", "Arteaga", "Nurse", 10500, "Clinic", false);

         employees.add(0, em1);
            employees.add(1, em2);
            employees.add(2, em3);
            employees.add(3, em4);
        // Print list of employees

        System.out.println(employees);


        //Create a linked list empty for patients

        LinkedList<String> plist = new LinkedList<>();
        //Add patients
        Patient patA = new Patient("Juan","Gonzalez", 11190, "OSDE");
        Patient patB = new Patient("Marina","Lopez", 11115, "SANCOR");
        Patient patC = new Patient("Juana","Vidal", 11120, "SANCOR");




        plist.add(0, "Juan Gomez");
        plist.add(1, "Maria Gonzalez");
        plist.add(2, "Jorge Madera");
        plist.add(3, "Gustavo Luna");
        plist.add(4, "Daiana Machado");

        //Print list of patients
        System.out.println(plist);

        Doctor docA = new Doctor ("Marcelo","Acera","TRAUMATOLOGY",120);
        Doctor docB = new Doctor ("Miguel","Cardenas","TRAUMATOLOGY",122);
        Doctor docC = new Doctor ("Ivan","Schultz","TRAUMATOLOGY",123);
        Receptionist recA= new Receptionist(4, "Lucia", "Martinez");

        recA.saveAppointment( LocalDate.of(2022,12,15), LocalTime.of(9,30),docA,patA, BigDecimal.valueOf(500));

        try{
            recA.saveAppointment(LocalDate.of(2022,03,26), LocalTime.of(9,30),docB,patB, BigDecimal.valueOf(500));
            recA.saveAppointment(LocalDate.of(2022,03,30), LocalTime.of(9,30),docB,patC, BigDecimal.valueOf(500));
        }catch (HealthInsuranceCompanyException e){
            LOGGER.error(e);
        }






    }


}
