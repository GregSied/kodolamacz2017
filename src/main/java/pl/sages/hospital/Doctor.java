package pl.sages.hospital;

public class Doctor extends Person {
    public Doctor(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Doctor{} " + super.toString();
    }
}
