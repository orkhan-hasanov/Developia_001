package Pom;

import org.openqa.selenium.By;
import lombok.Data;

@Data
public final class LoginPom {


    private LoginPom() {

    }

    private static LoginPom INSTANCE;

    public static LoginPom getINSTANCE() {
        if (INSTANCE != null) {
            INSTANCE = new LoginPom();
        }
            return INSTANCE;

    }



    private final By usernameInput = By.id("user-name");

    private final By passwordInput = By.id("password");

    private final By loginBtn = By.id("login-button");

    private final By loginInputError = By.xpath("//*[@data-test = 'error']");

    private final By homePageLogo = By.className("app_logo");

    private final By errorBtn = By.className("error-button");

    private final By loginBtn2 = By.cssSelector(".k-form-submit");



}
