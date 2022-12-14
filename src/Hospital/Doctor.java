package Hospital;

import Interfaces.Iattend;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

public class Doctor extends Person implements Iattend {

    //fields
    private String specialty;
    private int doctorID;


    //constructors
    public Doctor() {
    }

    public Doctor(String name, String lastname, String address, LocalDate birthDate, String specialty, int doctorID) {
        super(name, lastname);
        this.specialty = specialty;
        this.doctorID = doctorID;
    }
    public Doctor(String name, String lastname, String specialty, int doctorID) {
        super(name, lastname);
        this.specialty = specialty;
        this.doctorID = doctorID;
    }
    //setters and getters

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getDoctorID() {
        return doctorID;
    }

    @Override
    public String print() {
        return specialty;
    }
    @Override
    public String showPerson() {
        return getName();
    }

    @Override
    public String showPersonLastname() {
        return getLastname();
    }

    private List<Doctor> doctors = new ArrayList<Doctor>();
    public List<Doctor> getDoctors() {
        return doctors;
    }
    public void showdoctor() {
        out.println("Doctor"+ getName() + getLastname() + "is from" + getSpecialty());
    }

    @Override
    public void attendPatient(Patient patient ) {

        out.println("You have an appointment with doctor" + getName() );
    }
}
