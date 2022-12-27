package Hospital;
import Exceptions.HealthInsuranceCompanyException;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
public interface IAppointment {
      Appointment saveAppointment (LocalDate date, LocalTime time, Doctor doctor, Patient patient, BigDecimal cost) throws HealthInsuranceCompanyException;
}

