package creational;

import creational.factoryMethod.CommunityExecutive;
import creational.factoryMethod.Developer;
import creational.factoryMethod.DevelopmentManager;
import creational.factoryMethod.MarketingManager;
import creational.simpleFactory.WoodenDoor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FactoryMethodTest {

    @Test
    @DisplayName("Test Developer object making")
    public void testMakeDeveloper() {
        DevelopmentManager developmentManager = new DevelopmentManager();

        Assertions.assertNotNull(developmentManager);
        Assertions.assertTrue(developmentManager.takeInterview() instanceof Developer);
    }

    @Test
    @DisplayName("Test CommunityExecutive object making")
    public void testMakeCommunityExecutive() {
        MarketingManager marketingManager = new MarketingManager();

        Assertions.assertNotNull(marketingManager);
        Assertions.assertTrue(marketingManager.takeInterview() instanceof CommunityExecutive);
    }

}
