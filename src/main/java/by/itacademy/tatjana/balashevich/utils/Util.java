package by.itacademy.tatjana.balashevich.utils;

import com.github.javafaker.Faker;

public class Util {

    public static String generateEmail() {
        Faker faker = new Faker();
        String email = faker.internet().emailAddress();
        return email;
    }

    public static String generatePWD() {
        Faker faker = new Faker();
        String password = faker.internet().password();
        return password;
    }
}
