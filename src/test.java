import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;

public class test {

    @Test
    void getTotalPrice_whenInitialisedWithAPromotion_returnsValueOfPromotionA() {
        PromotionEngine promotionEngine = new PromotionEngine();
        promotionEngine.setCountActivePromotionA(1);
        Assert.assertThat(promotionEngine.calculateTotalPrice(), is(50));
    }

}
