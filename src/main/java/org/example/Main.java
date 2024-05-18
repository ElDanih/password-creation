package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String s1 = "cat";
        String s2 = "rabbit";
        solutions(s1, s2);
    }

    private static void solutions(String s1, String s2) {

        char[] charsS1 = s1.toCharArray();
        char[] charsS2 = s2.toCharArray();

        int ix = s1.length() - s2.length() >= 0 ? s1.length() : s2.length();

        StringBuilder password = new StringBuilder();
        for (int i = 0; i < ix; i++) {
            String m1 = charsS1.length-1 < i ? "" : Character.toString(charsS1[i]);
            String m2 = charsS2.length-1 < i ? "" : Character.toString(charsS2[i]);
            password.append(m1).append(m2);
        }
        System.out.println(password);



    }


}