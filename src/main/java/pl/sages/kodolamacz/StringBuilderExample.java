package pl.sages.kodolamacz;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringBuilderExample {

    StringBuilder sb = new StringBuilder();

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

    public static String test() {

        char[] a = {'1', 13, 'A'};

        String[] texts = {"Ala", "ma", "kota", "i", "psa"};
        if (texts.length > 0) {
            StringBuilder sb = new StringBuilder(texts[0]);
            for (int i = 1; i < texts.length; i++) {
                String text = texts[i];
                sb.append(" ").append(text);
            }
            sb.append('.');
            return sb.toString();
        } else {
            return "";
        }

    }

    public void fun(int[] a){
        if(a.length == 0){
            return;
        }

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
            sb.append(i);
        }
    }

}
