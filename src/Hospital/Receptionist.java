package Hospital;

import Exceptions.HealthInsuranceCompanyException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Receptionist extends Person implements IAppointment {
    private static Logger LOGGER = LogManager.getLogger(Receptionist.class);
    int id;

    public Receptionist() {
        super();
    }

    public Receptionist(int id, String name, String lastName) {
        super();
        super.setName(name);
        super.setLastname(lastName);


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public Appointment saveAppointment(LocalDate date, LocalTime time, Doctor doctor, Patient patient, BigDecimal cost) throws HealthInsuranceCompanyException {
        if (patient.getMedicalinsurance().isEmpty()) {
            throw new HealthInsuranceCompanyException("Patient can't be appointment without a Health Insurance Company");
        }
        Appointment appointment = new Appointment(date, time, doctor, patient, cost);
        LOGGER.info("Appointment registered successfully");
        return appointment;
    }

    @Override
    public String showPersonLastname() {
        return lastname;
    }

    @Override
    public String showPerson() {
        return name;
    }

    @Override
    public String print() {
        return name;
    }
}