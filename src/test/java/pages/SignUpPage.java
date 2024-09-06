package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class SignUpPage {

    public void openPage() {
        open("/");
    }

        private final static SelenideElement signUpButton = $x("//button[text()[normalize-space() = 'Sign Up']]"),
            brandOption = $x("//a[text()[normalize-space() = 'as Brand']]"),
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            dateOfBirthInput = $("#dob"),
            brandNameInput = $("#brandName"),
            entityNameInput = $("#entityName"),
            descriptionInput = $("#description"),
            selectCategoryDropdown = $("#brandCategory"),
            categoryChoice = $("#brandCategory"),
            emailInput = $("#email"),
            passwordInput = $("#password"),
            acceptTermsCheckbox = $("#acceptTerms"),
            finalSignUpButton = $x("//button[text()[normalize-space() = 'Sign Up']]"), // Same as signUpButton
            phoneInput = $("#phone"),
            zipCodeInput = $("#zipCode");

    public static void chooseSignUPAsBrand() {
        signUpButton.hover();
        brandOption.click();
    }

    public static void typeFirstName(String name) {
        firstNameInput.setValue(name);
    }

    public static void typeLastName(String name) {
        lastNameInput.setValue(name);
    }

    public static void typeMobileNumber(String phone) {
        phoneInput.setValue(phone);
    }

    public static void typeZipCode(String zipCode) {
        zipCodeInput.setValue(zipCode);
    }

    public static void typeBirthDate(String date) {
        dateOfBirthInput.setValue(date);
    }


    public static void fillPersonalInfo(String firstName, String lastName, String date) {
        typeFirstName(firstName);
        typeLastName(lastName);
        typeBirthDate(date);
    }

    public static void typeBrandName(String name) {
        brandNameInput.setValue(name);
    }

    public static void typeEntityName(String name) {
        entityNameInput.setValue(name);
    }
    public static void typeDescription(String description) {
        descriptionInput.setValue(description);
    }

    public static void selectCategory(String category) {
        categoryChoice.selectOption(category);
    }

    public static AddStorePage clickSignUp() {
        finalSignUpButton.click();
        Selenide.sleep(9000);
        return new AddStorePage();
    }


    public static void fillBrandInfo(String brandName, String entityName, String description) {
        typeBrandName(brandName);
        typeEntityName(entityName);
        typeDescription(description);
    }

    public static void typeEmail(String email) {
        emailInput.setValue(email);
    }
    public static void typePassword(String password) {
        passwordInput.setValue(password);
    }

    public static void fillSecurityInfo(String email, String password){
        typeEmail(email);
        typePassword(password);
    }

    public static void acceptTerms() {
        Selenide.executeJavaScript("document.getElementById('acceptTerms').click();");
    }
}
