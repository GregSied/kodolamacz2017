package pl.sages.klasy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Person implements Comparable<Person> {

    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Ala"));
        list.add(new Person("Franek"));
        list.add(new Person("Bożena"));
        list.add(new Person("Grażyna"));

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return -o1.name.compareTo(o2.name);
            }
        });
        System.out.println(list);
    }
}
