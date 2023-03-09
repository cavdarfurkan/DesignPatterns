package creational;

import creational.builder.Burger;
import creational.builder.BurgerBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BuilderTest {

    @Test
    @DisplayName("Test Burger object making with BurgerBuilder")
    public void testBurgerBuilder() {
        Burger burger = new BurgerBuilder(11)
                .addCheese()
                .addLettuce()
                .build();

        Assertions.assertAll(
                () -> Assertions.assertNotNull(burger),
                () -> Assertions.assertInstanceOf(Burger.class, burger),
                () -> Assertions.assertEquals(11, burger.getSize()),
                () -> Assertions.assertTrue(burger.isCheese()),
                () -> Assertions.assertFalse(burger.isPepperoni()),
                () -> Assertions.assertTrue(burger.isLettuce()),
                () -> Assertions.assertFalse(burger.isTomato())
        );

        System.out.println(burger);
    }
}
