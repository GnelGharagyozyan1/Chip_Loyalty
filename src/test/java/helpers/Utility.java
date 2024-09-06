package helpers;

import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Utility {
    public static String generateRandomString(int maxLength) {
        Faker fakerString = new Faker();
        return fakerString.lorem().characters(maxLength);
    }


    public static String generateRandomEmail() {
        Faker fakeEmail = new Faker(new java.util.Locale("en", "CA"));
        return fakeEmail.internet().emailAddress();
    }

    public static String generateRandomSurname() {
        Faker fakeSurname = new Faker(new java.util.Locale("en", "CA"));
        return fakeSurname.name().lastName();
    }

    public static String generateRandomFirstName() {
        Faker fakeFirstName = new Faker(new java.util.Locale("en", "CA"));
        return fakeFirstName.name().firstName();
    }

    public static String generateRandomPassword() {
        Faker fakePassword = new Faker(new java.util.Locale("en", "CA"));
        return fakePassword.internet().password();
    }

    public static String generateRandomBirthDate(){
        Faker faker = new Faker();
        LocalDate birthDate = faker.date().birthday(18, 60).toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return birthDate.format(formatter);
    }
}
