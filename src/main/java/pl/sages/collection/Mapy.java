package pl.sages.collection;

import java.util.HashMap;
import java.util.Map;

public class Mapy {

    public static void main(String[] args) {
        // klucz to napis a wartość to liczba
        // klucz jest zawsze unikatowy
        Map<String, Integer> mapa = new HashMap<>();
        // mapę zliczającą
        mapa.put("Ala", 2);
        mapa.put("ma", 4);
        mapa.put("kota", 1);

        // wypisane jest w formacie klucz=wartość
        // Ala=2
        System.out.println(mapa);
        // drugi raz wkładając wartość o danych kluczu
        // nadpisuję poprzednią
        mapa.put("kota", 5);
        System.out.println(mapa);

        Integer licznośćKota = mapa.get("kota");
        System.out.println("Jest "+licznośćKota + " kotów");
    }

}
