import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class Test {

    @org.junit.jupiter.api.Test
    void deliveryCardTest() {
        open("http://localhost:9999");
        $("[data-test-id=city] input").setValue("Москва");
        $("[data-test-id=date] input").setValue("27.08.2023");
        $("[data-test-id=name] input").setValue("Фамилия Имя");
        $("[data-test-id=phone] input").setValue("+79999999999");
        $("[data-test-id=agreement]").click();
        $("button.button").click();
        $("[data-test-id=notification] .notification__title").shouldBe(visible, Duration.ofSeconds(15));

        $("[data-test-id=notification] .notification__content").shouldBe(visible);
    }
}
