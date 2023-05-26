package by.itacademy.tatjana.balashevich;

public class Main3 {
    public static void main(String[] args) {
        String str = "agfrtyiopmsw";
        char ch = str.charAt(0);
        System.out.println(ch);
        int j = (int) Math.floor(Math.random() * str.length());
        ch = str.charAt(j);
        System.out.println(ch);
    }
}
