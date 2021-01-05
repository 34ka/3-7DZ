
package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class YandexTest {

    @Test
    public void yandexSearchString () {
        //open link
        open("https://yandex.com");
        //input text for search
        $(byName("q")).val("Debit card").pressEnter();
        //assert text
        $("html").shouldHave(text("Debit card"));
    }
}
