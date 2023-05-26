package by.itacademy.tatjana.balashevich;

public class Main {
    public static void main(String[] args) {
        char[] letter = {'a', 's', 'f', 'b', 'h'};
        String name = "";
        int j = (int) Math.floor(Math.random() * letter.length);
        name = name + Character.toUpperCase(letter[j]);
        for (int i = 0; i < 5; i++) {
            j = (int) Math.floor(Math.random() * letter.length);
            name = name + letter[j];
        }
        System.out.println(name);
    }
}