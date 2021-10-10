package org.example.untitled;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class OpenTwitterPage {

    private SelenideElement usernameInput = $(byXpath("/html/body/div/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div/div[2]/label/div/div[2]/div/input"));

    private SelenideElement passwordInput = $(byXpath("/html/body/div/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div/div[2]/div/label/div/div[2]/div/input"));

    private SelenideElement tweetBox = $(byXpath("/html/body/div/div/div/div[2]/main/div/div/div/div[1]/div/div[2]/div/div[2]/div[1]/div/div/div/div[2]/div[1]/div/div/div/div/div/div/div/div/div/label/div[1]/div/div/div/div/div[2]/div"));

    private SelenideElement tweetBtn = $(byXpath("/html/body/div/div/div/div[2]/main/div/div/div/div[1]/div/div[2]/div/div[2]/div[1]/div/div/div/div[2]/div[3]/div/div/div[2]/div/div/span/span"));

    private SelenideElement profile = $(byXpath("/html/body/div/div/div/div[2]/main/div/div/div/div[1]/div/div[2]/div/div[2]/div[1]/div/div/div/div[1]/a"));

    private SelenideElement openTweet = $(byXpath("/html/body/div/div/div/div[2]/main/div/div/div/div[1]/div/div[2]/div/div/div[2]/section/div/div/div[1]/div/div/article/div/div/div/div[2]/div[2]/div[1]/div/div/div[1]/a/time"));

    void userNameInput(){
        usernameInput.sendKeys("sahanlakmal13@gmail.com");
        usernameInput.pressEnter();
    }

    public void passwordInput() {
        passwordInput.sendKeys("Sahan13Lakmal");
        passwordInput.pressEnter();
    }

    public void tweet() {
        tweetBox.sendKeys("Testing Automation");
        tweetBtn.click();
    }

    public void openProfile() {
        profile.click();
    }

    public void openTweet() {
        openTweet.click();
    }

}
