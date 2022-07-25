package utils;

import com.github.javafaker.Faker;

public class FakeDataGenerator {

    public static String generateTreeDigitsNumber() {
        Faker faker = new Faker();
        return faker.numerify("###");
    }
}
