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

    @Test
    void getTotalPrice_whenInitialisedWithBPromotion_returnsValueOfPromotionB() {
        PromotionEngine promotionEngine = new PromotionEngine();
        promotionEngine.setCountActivePromotionB(1);
        Assert.assertThat(promotionEngine.calculateTotalPrice(), is(30));
    }

    @Test
    void getTotalPrice_whenInitialisedWithCPromotion_returnsValueOfPromotionC() {
        PromotionEngine promotionEngine = new PromotionEngine();
        promotionEngine.setCountActivePromotionC(1);
        Assert.assertThat(promotionEngine.calculateTotalPrice(), is(20));
    }

    @Test
    void getTotalPrice_whenInitialisedWithDPromotion_returnsValueOfPromotionD() {
        PromotionEngine promotionEngine = new PromotionEngine();
        promotionEngine.setCountActivePromotionD(1);
        Assert.assertThat(promotionEngine.calculateTotalPrice(), is(15));
    }

    @Test
    void getTotalPrice_whenPromotionA_IsInitialisedWithCountOf3_returnsValueOf_PROMOTION_PRICE_A() {
        PromotionEngine promotionEngine = new PromotionEngine();
        promotionEngine.setCountActivePromotionA(3);
        Assert.assertThat(promotionEngine.calculateTotalPrice(), is(130));
    }

    @Test
    void getTotalPrice_whenPromotionA_IsInitialisedWithCountOf8_returnsValueOf_PROMOTION_PRICE_A() {
        PromotionEngine promotionEngine = new PromotionEngine();
        promotionEngine.setCountActivePromotionA(8);
        Assert.assertThat(promotionEngine.calculateTotalPrice(), is(360));
    }

    @Test
    void getTotalPrice_whenPromotionB_IsInitialisedWithCountOf2_returnsValueOf_PROMOTION_PRICE_B() {
        PromotionEngine promotionEngine = new PromotionEngine();
        promotionEngine.setCountActivePromotionB(2);
        Assert.assertThat(promotionEngine.calculateTotalPrice(), is(45));
    }

    @Test
    void getTotalPrice_whenPromotionCAndD_AreInitialisedWithCountOf1_returnValueOf_PROMOTION_PRICE_C_AND_D() {
        PromotionEngine promotionEngine = new PromotionEngine();
        promotionEngine.setCountActivePromotionC(1);
        promotionEngine.setCountActivePromotionD(1);
        Assert.assertThat(promotionEngine.calculateTotalPrice(), is(30));
    }

}