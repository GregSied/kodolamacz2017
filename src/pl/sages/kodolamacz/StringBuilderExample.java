package pl.sages.kodolamacz;

public class StringBuilderExample {

    StringBuilder sb;

    StringBuilderExample dopiszPrzecinek(){
        sb.append(',');
        return this;
    }

    StringBuilderExample dopiszSpacje(){
        sb.append(' ');
        return this;
    }

    StringBuilderExample dopisz(String s){
        sb.append(s);
        return this;
    }

    public static void main(String[] args) {
        StringBuilderExample sbe = new StringBuilderExample();
        sbe.dopisz("123").dopiszPrzecinek().dopisz("36").dopiszSpacje();

        StringBuilder sb = new StringBuilder("Abc");
        sb.append("Abc");
        sb.append("123").append("1231231").append("afadf34");
        String zmienna = "123";
        sb.append("123" + zmienna);
        String s = "Abc" + "123";
        s = s + "1233343";
        s = "dfhsdfa" + s;
        for (int i = 0; i < 10; i++) {
            s = s + i;
        }
    }

}
