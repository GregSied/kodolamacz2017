package pl.sages.hospital;

public class Patient extends Person {

    private int id;

    public Patient(String name, int age) {
        super(name, age);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
