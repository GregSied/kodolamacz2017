package pl.sages.shop;


// wzorzec singleton
public class Elvis {

    static Elvis theKing = new Elvis();

//    List<Car> cars;

    private Elvis(){

    }

    static Elvis getInstance(){
        return theKing;
    }

    public void sing(){
        System.out.println("Jailhouse rock");
    }


    public static void main(String[] args) {
        new Elvis();
        new Elvis();
    }


}
