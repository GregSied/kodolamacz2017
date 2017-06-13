package pl.sages.hospital;

public class DoctorSchedule {

    Doctor doctor;

    Visit[][] visits = new Visit[Weekday.values().length][8];

    public DoctorSchedule(Doctor doctor) {
        this.doctor = doctor;
    }

    public void addVisit(Visit visit, Weekday weekday, int hour){
        if(visits[weekday.ordinal()][hour-8] == null){
            visits[weekday.ordinal()][hour-8] = visit;
        }else{
            System.out.println("Już jest wizyta tego dnia o tej godzinie!");
        }
    }

    public void printSchedule(){
        System.out.println("Grafik dla" + doctor.toString());
        for (Weekday weekday : Weekday.values()) {
            System.out.println("Dzień " + weekday.name());
            for (int i = 0; i < 8; i++) {
                if(visits[weekday.ordinal()][i] != null){
                    System.out.println("Godzina:"+(i+8)+" "+visits[weekday.ordinal()][i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        Doctor kowalski = new Doctor("Kowalski", 35);
        DoctorSchedule schedule = new DoctorSchedule(kowalski);

        Visit visit1 = new Visit(new Patient("Nowak",18), kowalski);
        Visit visit2 = new Visit(new Patient("Nowak",18), kowalski);

        schedule.addVisit(visit1, Weekday.MONDAY, 10);
        schedule.addVisit(visit2, Weekday.MONDAY, 10);
        schedule.addVisit(visit2, Weekday.MONDAY, 11);

        schedule.printSchedule();
    }
}
