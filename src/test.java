import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;

public class test {

    @Test
    void test() {
        PromotionEngine promotionEngine = new PromotionEngine();
        Assert.assertThat(promotionEngine.calculateTotalPrice(), is("50"));
    }

}
