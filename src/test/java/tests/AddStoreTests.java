package tests;

import com.codeborne.selenide.Condition;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.AddStorePage;
import pages.SignUpPage;

import static com.codeborne.selenide.Selenide.open;
import static helpers.Utility.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;
import static pages.SignUpPage.*;

@Feature("Add store")
@Story("Check Add store functionality")
@Owner("Gnel_Gharagyozyan")
public class AddStoreTests extends TestBase {

    private final SignUpPage signUpPage = new SignUpPage();

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Signing up and checking the Add store functionality")
    void SignUpandAddStoreTest() {

        step("Navigate to the Sign up page", signUpPage::openPage);
        step("Select 'Brand' option ", SignUpPage::chooseSignUPAsBrand);
        step("Filling in the personal info in the form",
                () -> fillPersonalInfo(generateRandomFirstName(), generateRandomSurname(), generateRandomBirthDate()));
        step("Filling in the brand info in the form",
                () -> fillBrandInfo(generateRandomString(12), generateRandomString(14),
                                                                        generateRandomString(25)));
        step("Filling in the security info in the form",
                () -> fillSecurityInfo(generateRandomEmail(), generateRandomPassword()));
        step("Accepting the terms and conditions", SignUpPage::acceptTerms);
        step("Choosing brand category", () -> selectCategory("Shop"));
        step("Choosing brand category", () -> selectCategory("Shop"));
        AddStorePage addStorePage = step("Clicking Sign Up button", SignUpPage::clickSignUp);
        step("Clicking 'Account section' ", addStorePage::openAccountSection);
        step("Clicking 'Add store' button", addStorePage::chooseAddStore);
        String storeName = generateRandomString(10);
        step("Typing a name for Store", () -> addStorePage.setStorename(storeName));
        step("Submitting the store", addStorePage::submitStore);
        step("Checking if we get the success message", () -> addStorePage.statusMessage()
                                                                    .shouldBe(Condition.visible)
                                                .shouldHave(Condition.text("Redeemer Dashboard added successfully")));
    }
}


