package pl.sages.kodolamacz;

public class InstrukcjeWarunkowe {

    public static void main(String[] args) {
        Person ania = new Person(false);

        if(ania.isAdult()){
            System.out.println("Możesz kupić piwo.");
        }else{
            System.out.println("Niestety nie możesz kupić piwa");
        }

        int a = 4;

        // trzy warunki zostaną sprawdzone
        if(a == 0){
            System.out.println("zero");
        }
        if(a > 0){
            System.out.println("wieksze");
        }
        if(a < 0){
            System.out.println("mniejsze");
        }

        int b = 0;
        if(b == 0){
            System.out.println("zero");
        }else if(b > 0){
            System.out.println("wieksze");
        }else if(b < 0){
            System.out.println("mniejsze");
        }
        b = -2;

        // problem wiszącego else'a
        // lepiej stosować nawiasy klamrowe, wtedy nie ma niejednoznaczości
        if(b > 0)
            if(b > 5)
                System.out.println("większe od zera");
            else // zwiazany z wewnętrznym if'em
                System.out.println("???");


        // kod rownowazny, ale mniej czytelny
        /*
        if(ania.isAdult()){
            System.out.println("Możesz kupić piwo.");
        }

        if(!ania.isAdult()){
            System.out.println("Niestety nie możesz kupić piwa");
        }
        */
    }

}
