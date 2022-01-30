public class PromotionEngine {

    private static int UNITPRICE_A = 50;

    private int countActivePromotionA;

    public int calculateTotalPrice(){
        return countActivePromotionA * UNITPRICE_A;
    }

    public void setCountActivePromotionA(int countActivePromotionA) {
        this.countActivePromotionA = countActivePromotionA;
    }

}
