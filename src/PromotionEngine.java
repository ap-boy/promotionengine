public class PromotionEngine {

    private static int UNITPRICE_A = 50;
    private static int UNITPRICE_B = 30;

    private int countActivePromotionA;
    private int countActivePromotionB;

    public int calculateTotalPrice(){
        return countActivePromotionA * UNITPRICE_A;
    }

    public void setCountActivePromotionA(int countActivePromotionA) {
        this.countActivePromotionA = countActivePromotionA;
    }

    public void setCountActivePromotionB(int countActivePromotionB) {
        this.countActivePromotionB = countActivePromotionB;
    }

}
