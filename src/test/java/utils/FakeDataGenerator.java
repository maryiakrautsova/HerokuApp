package utils;

import com.github.javafaker.Faker;

public class FakeDataGenerator {

    public static String generatePositiveTreeDigitsNumber() {
        Faker faker = new Faker();
        return faker.numerify("###");
    }

    public static String generateNegativeTwoDigitsNumber() {
        Faker faker = new Faker();
        return faker.numerify("-##");
    }

    public static String generatePositiveNonIntegerNumber() {
        Faker faker = new Faker();
        return faker.numerify("##.#");
    }

    public static String generateNegativeNonIntegerNumber() {
        Faker faker = new Faker();
        return faker.numerify("-##.#");
    }
}
