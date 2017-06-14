package pl.sages.collection;

import pl.sages.hospital.Patient;

import java.util.ArrayList;
import java.util.List;

public class BazaDanychLista {

    int counter = 0;
    List<Patient> baza = new ArrayList<>();

    public void zapisz(Patient patient){
        patient.setId(counter);
        counter++;
        baza.add(patient);
    }

    // wyszukiwanie będzie wolniejsze niż w przypadku listy
    public Patient wyszukaj(int id){
        for (Patient patient : baza) {
            if(patient.getId() == id){
                return patient;
            }
        }
        return null;
    }

}
