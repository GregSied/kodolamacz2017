package pl.sages.collection;

import pl.sages.hospital.Patient;

import java.util.HashMap;
import java.util.Map;

// prosta baza danych, która na podstawie automatycznie generowane ID
// przechowuje pacjentów - pozwala ich zapisać a następnie odczytać
public class BazaDanych {

    int counter = 0;
    Map<Integer, Patient> baza = new HashMap<>();

    public void zapisz(Patient patient){
        patient.setId(counter);
        counter++;
        baza.put(patient.getId(), patient);
    }

    public Patient wyszukaj(int id){
        return baza.get(id);
    }


}
