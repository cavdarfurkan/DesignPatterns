package creational;

import creational.prototype.Sheep;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PrototypeTest {

    private static final String ORIGINAL_NAME = "Jolly";
    private static final String ORIGINAL_CATEGORY = "Mountain Sheep";
    private static final String CLONED_NAME = "Dolly";
    private static final String CLONED_CATEGORY = "Another Category";

    @Test
    @DisplayName("Test cloning of Sheep object")
    public void testClone() {
        // Arrange
        Sheep original = new Sheep(ORIGINAL_NAME);
        Assertions.assertNotNull(original);
        Assertions.assertInstanceOf(Sheep.class, original);

        // Act
        Sheep cloned = original.clone();

        // Assert
        Assertions.assertNotNull(cloned);
        Assertions.assertInstanceOf(Sheep.class, cloned);
        Assertions.assertNotSame(original, cloned);

        cloned.setName(CLONED_NAME);
        cloned.setCategory(CLONED_CATEGORY);

        Assertions.assertAll(
                () -> Assertions.assertEquals(ORIGINAL_NAME, original.getName()),
                () -> Assertions.assertEquals(ORIGINAL_CATEGORY, original.getCategory()),
                () -> Assertions.assertEquals(CLONED_NAME, cloned.getName()),
                () -> Assertions.assertEquals(CLONED_CATEGORY, cloned.getCategory())
        );

        System.out.println("original = " + original);
        System.out.println("cloned = " + cloned);
    }
}
