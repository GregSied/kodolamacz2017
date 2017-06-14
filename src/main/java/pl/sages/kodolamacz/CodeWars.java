package pl.sages.kodolamacz;

import java.util.*;
import java.util.stream.Stream;

public class CodeWars {
    public static int findIt(int[] A) {
        Map<Integer, Integer> counter = new HashMap<>();
        for(int a : A){
            if(!counter.containsKey(a)){
                counter.put(a, 0);
            }
            counter.put(a, counter.get(a)+1);
        }
        for(Map.Entry<Integer,Integer> e : counter.entrySet()){
            if(e.getValue() % 2 == 1){
                return e.getKey();
            }
        }
        return 0;
    }

    public static int sortDesc(final int num) {

        String s = String.valueOf(num);
        List<Character> chars = new ArrayList<>();
        for (char c : s.toCharArray()) {
            chars.add(c);
        }
        StringBuilder sb = new StringBuilder();
        Collections.sort(chars, (o1, o2) -> o2.compareTo(o1));
        for (Character c : chars) {
            sb.append(c);
        }
        return Integer.valueOf(sb.toString());
    }

    public static String decode(String morseCode) {

        return Stream.of(morseCode.trim().split(" {1,2}")).map(t -> {
            if("".equals(t)){
                return " ";
            }else{
                return "A";
            }
        }).reduce("", (a,b) -> a+b);

    }

    public static int bowling_score(String frames) {
        int sum = 0;
        String[] split = frames.split(" ");
        for (int i = 0; i < split.length - 1; i++) {
            String s = split[i];
            if(isStrike(s)){
                sum += 10;
                if(isStrike(split[i+1])){
                    if(i == 8){
                        sum += twoScore(split[i+1]);
                    }else{
                        sum += 10 + oneScore(split[i+2]);
                    }
                }else{
                    sum += twoScore(split[i+1]);
                }
            }else{
                if(isSpare(s)){
                    sum += 10 + oneScore(split[i+1]);
                }else{
                    sum += twoScore(s);
                }
            }
        }
        String last = split[9];
        if(isStrike(last)){
            sum += 10 + twoScore(last.substring(1));
        }else if(isSpare(last)){
            sum += 10 + oneScore(last.substring(2));
        }else{
            sum += twoScore(last);
        }
        return sum;
    }

    public static boolean isStrike(String s){
        return s.startsWith("X");
    }

    public static boolean isSpare(String s){
        return '/' == s.charAt(1);
    }

    public static int oneScore(String s){
        if(isStrike(s)){
            return 10;
        }else{
            return Integer.valueOf(""+s.charAt(0));

        }
    }

    public static int twoScore(String s){
        if("XX".equals(s)){
            return 20;
        }
        return s.charAt(1) == '/' ? 10 : (oneScore(""+s.charAt(0)) +  oneScore(""+s.charAt(1)));
    }

    public static String print(int n) {
        if(n % 2 == 0 || n < 0){
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int half = (n+1)/2;
        for (int i = 1; i <= n; i++) {
            int v = Math.abs(half - i);
            for (int k = 0; k < v; k++) {
                sb.append(' ');
            }
            for (int j = 0; j < Math.abs(half - v)*2-1; j++) {
                sb.append('*');
            }
            sb.append('\n');
        }
        return sb.toString();

    }

    public static int persistence(long n) {
        int count = 0;
        while(n >= 10){
            count++;
            n = decrease(n);
        }
        return count;
    }

    public static long decrease(long n){
        long result = 1;
        for (char c : String.valueOf(n).toCharArray()) {
            result *= (c - '0');
        }
        return result;
    }

    static String encode(String word){
        Set<Character> unique = new HashSet<>();
        Set<Character> dup = new HashSet<>();
        for (char c : word.toLowerCase().toCharArray()) {
            if(unique.contains(c)){
                dup.add(c);
            }
            unique.add(c);
        }
        StringBuilder sb = new StringBuilder(word.length());
        for (char c : word.toLowerCase().toCharArray()) {
            sb.append(dup.contains(c) ? ')' : '(');
        }
        return sb.toString();
    }

    public static int zeros(int n) {
        int sum = 0;
        for (int i = 5; i < n; i++) {
            sum += divBy(i, 5);
        }
        return sum;
    }

    public static int divBy(int n, int d){
        int i = 0;
        while(n % d == 0){
            n = n / d;
            i++;
        }
        return i;
    }


    public static String makeReadable(int seconds) {
        int h = seconds / 3600;
        int m = (seconds - h*3600) / 60;
        int s = seconds % 60;
        return format(h)+":"+format(m)+":"+format(s);
    }

    public static String format(int x){
        return x < 10 ? "0" + x : ""+x;
    }

    public static void main(String[] args) {
        System.out.println(encode("Prespecialized"));
        System.out.println(print(3));
        System.out.println(print(5));
        System.out.println(print(7));
        System.out.println(sortDesc(5821));
        System.out.println(bowling_score("X X 9/ 80 X X 90 8/ 7/ 44"));
        System.out.println(bowling_score("11 11 11 11 11 11 11 11 11 11"));
        System.out.println(bowling_score("X X X X X X X X X XXX"));
    }
}