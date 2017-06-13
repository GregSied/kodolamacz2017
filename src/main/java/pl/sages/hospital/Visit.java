package pl.sages.hospital;

import javax.print.Doc;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Visit {

    Date date;
    Patient patient;
    Doctor doctor;

    public Visit(Patient patient, Doctor doctor) {
        this(new Date(), patient, doctor);
    }

    public Visit(Date date, Patient patient, Doctor doctor) {
        this.date = date;
        this.patient = patient;
        this.doctor = doctor;
    }

    @Override
    public String toString() {
        return "Visit{" +
                "patient=" + patient +
                ", doctor=" + doctor +
                '}';
    }

    //
//    public Visit() {
//        // aktualna data
//        this.date = new Date();
//        GregorianCalendar gregorianCalendar = new GregorianCalendar();
//        gregorianCalendar.set(2017, 06, 03);
//        Date gregorianChange = gregorianCalendar.getGregorianChange();
//    }
}
