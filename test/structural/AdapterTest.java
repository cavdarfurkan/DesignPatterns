package structural;

import org.junit.jupiter.api.*;
import structural.adapter.*;

public class AdapterTest {

    static Hunter hunter = null;
    static AfricanLion africanLion = null;
    static AsianLion asianLion = null;
    static WildDog wildDog = null;
    static WildDogAdapter wildDogAdapter = null;

    @BeforeAll
    public static void setUp() {
        hunter = new Hunter();
        africanLion = new AfricanLion();
        asianLion = new AsianLion();
        wildDog = new WildDog();
        wildDogAdapter = new WildDogAdapter(wildDog);
    }

    @Test
    @DisplayName("Test lions")
    public void testLions() {
        Assertions.assertNotNull(hunter);
        Assertions.assertInstanceOf(Hunter.class, hunter);

        Assertions.assertNotNull(africanLion);
        Assertions.assertInstanceOf(Lion.class, africanLion);
        Assertions.assertInstanceOf(AfricanLion.class, africanLion);

        Assertions.assertNotNull(asianLion);
        Assertions.assertInstanceOf(Lion.class, asianLion);
        Assertions.assertInstanceOf(AsianLion.class, asianLion);

        hunter.hunt(africanLion);
        hunter.hunt(asianLion);
    }

    @Test
    @DisplayName("Test WildDogAdapter implementation as Lion")
    public void testWildDogAdapter() {
        Assertions.assertNotNull(hunter);
        Assertions.assertInstanceOf(Hunter.class, hunter);

        Assertions.assertNotNull(wildDog);
        Assertions.assertInstanceOf(WildDog.class, wildDog);
        Assertions.assertFalse(wildDog instanceof Lion);

        Assertions.assertNotNull(wildDogAdapter);
        Assertions.assertInstanceOf(Lion.class, wildDogAdapter);
        Assertions.assertInstanceOf(WildDogAdapter.class, wildDogAdapter);

        hunter.hunt(wildDogAdapter);
    }
}
