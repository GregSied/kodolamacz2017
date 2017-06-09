package pl.sages.kodolamacz;

import java.util.*;

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

    public static void main(String[] args) {
        System.out.println(sortDesc(5821));
    }
}