package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class AddStorePage {

        private final SelenideElement accountSection = $x("//a[@href='/account']"),
            statusMessage = $x("//div[@role='status' and @aria-live='polite']"),
            addStoreButton = $x("//button[text()[normalize-space() = 'Add Store']]"),
            storeNameInputField = $x("//input[@placeholder='Store Name']"),
            submitButton = $x("//button[text()[normalize-space() = 'Submit']]");


        public void openAccountSection(){
            accountSection.click();
        }

        public void chooseAddStore(){
            addStoreButton.click();
        }

        public void setStorename(String storeName){
            storeNameInputField.setValue(storeName);
        }

        public void submitStore(){
            submitButton.click();
        }

        public SelenideElement statusMessage(){
            return statusMessage;
        }
}
