package by.itacademy.tatjana.balashevich;

import com.github.javafaker.Faker;

public class Demo {
    public static void main(String[] args) {
        Faker faker = new Faker();

        String email = faker.internet().emailAddress();
        System.out.println("E-mail is: " + email);

        String password = faker.internet().password();
        System.out.println("PWD is: " + password);
        //Generate 10 human names:
        for (int i = 0; i < 10; i++) {
            String name = faker.name().name();
            System.out.println("Name " + i + " is: " + name);
        }
    }
}
