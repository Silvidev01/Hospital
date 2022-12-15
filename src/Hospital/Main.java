package Hospital;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Main {



    public static void main (String [] args){

        ArrayList<Employee> employees = new ArrayList<>();
        //initializing employees
        Employee maria;
        maria = new Employee ("Nurse",10020,"UTI",true);
        Employee fernando= new Employee("Doctor", 10150, "Clinic", true);
        Employee Juan= new Employee("Receptionist", 10120,"Clinic",true);
        Employee Lucas = new Employee("Nurse", 10500, "Clinic",false);

        employees.add(0,maria);
        employees.add(1,fernando);
        employees.add(2,Juan);
        employees.add(3,Lucas);

    // Print list of employees

       System.out.println(Collections.unmodifiableList(employees));


        //Create a linked list empty for patients

       LinkedList<String> plist = new LinkedList<>();
        //Add patients

        plist.add(0, "Juan Gomez");
        plist.add(1, "Maria Gonzalez");
        plist.add(2,"Jorge Madera");
        plist.add(3, "Gustavo Luna");
        plist.add(4,"Daiana Machado");

        //Print list of patients
        System.out.println(plist);
    }
}
