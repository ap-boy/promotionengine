public class PromotionEngine {

    private static int UNITPRICE_A = 50;
    private static int UNITPRICE_B = 30;
    private static int UNITPRICE_C = 20;
    private static int UNITPRICE_D = 15;

    private static int PROMOTION_PRICE_A = 130;

    private int countActivePromotionA = 0;
    private int countActivePromotionB = 0;
    private int countActivePromotionC = 0;
    private int countActivePromotionD = 0;

    private int numberActivePromotionA = 3;

    public int calculateTotalPrice(){
        int total = 0;

        if(countActivePromotionA > 0) {
            int additionalPromotionA = (countActivePromotionA % numberActivePromotionA);
            if(additionalPromotionA > 0) {
                total = total + (additionalPromotionA * UNITPRICE_A);
                countActivePromotionA = countActivePromotionA - additionalPromotionA;
            }
            total = total + ((countActivePromotionA / numberActivePromotionA) * PROMOTION_PRICE_A);
        }
        if(countActivePromotionB > 0) {
            total = total + (countActivePromotionB * UNITPRICE_B);
        }
        if(countActivePromotionC > 0) {
            total = total + (countActivePromotionC * UNITPRICE_C);
        }
        if(countActivePromotionD > 0) {
            total = total + (countActivePromotionD * UNITPRICE_D);
        }

        return total;
    }

    public void setCountActivePromotionA(int countActivePromotionA) {
        this.countActivePromotionA = countActivePromotionA;
    }

    public void setCountActivePromotionB(int countActivePromotionB) {
        this.countActivePromotionB = countActivePromotionB;
    }

    public void setCountActivePromotionC(int countActivePromotionC) {
        this.countActivePromotionC = countActivePromotionC;
    }

    public void setCountActivePromotionD(int countActivePromotionD) {
        this.countActivePromotionD = countActivePromotionD;
    }

}
