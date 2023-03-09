package creational;

import creational.singleton.President;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SingletonTest {

    @Test
    @DisplayName("Test President objects from singleton instance")
    void getInstance() {
        President president1 = President.getInstance();
        President president2 = President.getInstance();

        Assertions.assertNotNull(president1);
        Assertions.assertNotNull(president2);
        Assertions.assertEquals(president1, president2);
    }
}