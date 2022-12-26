package MAIN;

import Hospital.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.function.Predicate;
import java.util.logging.Logger;

public class Main {


    public static void main(String[] args) {





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

        System.out.println(Collections.unmodifiableList(employees));


        //Create a linked list empty for patients

        LinkedList<String> plist = new LinkedList<>();
        //Add patients

        plist.add(0, "Juan Gom" +
                "ez");
        plist.add(1, "Maria Gonzalez");
        plist.add(2, "Jorge Madera");
        plist.add(3, "Gustavo Luna");
        plist.add(4, "Daiana Machado");

        //Print list of patients
        System.out.println(plist);
    }
}
