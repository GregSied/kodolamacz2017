package pl.sages.kodolamacz;

public class Boxing {

    public static void main(String[] args) {
        int prymityw = 1;
        Integer klasowy = 1;
        Integer druga = new Integer(1);

        // czy moze być null?
        Integer pusty = null;
        // int maly = null;

        // porównywanie obiektów
        int a = 2;
        int b = 2;

        if(a == b){
            System.out.println("równe int");
        }

        b = new Integer(5); // unboxing - odpakuje obiekt i wstawi prymityw
        // nawet Idea podpowiada że to opakowywanie jest bez sensu

        Integer c = 2; // new Integer(2); autoboxing
        Integer d = 2;

        if (c == d){
            System.out.println(c);
            System.out.println("równe Integer");
        }
        d = 3; // new Integer(3); i przypiszę tą wartość

        Integer e = new Integer(2); //tworzy nową instancję
        Integer f = new Integer(2); // tutaj też

        if(e == f){
            System.out.println("równe Integer 2");
        }

        // nie porównujemy klas za pomocą == tylko przy użyciu equals
        if(e.equals(f)){
            System.out.println("equals Integer 2");
        }
    }

}
