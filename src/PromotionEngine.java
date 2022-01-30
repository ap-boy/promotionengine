public class PromotionEngine {

    private static int UNITPRICE_A = 50;
    private static int UNITPRICE_B = 30;
    private static int UNITPRICE_C = 20;
    private static int UNITPRICE_D = 15;

    private int countActivePromotionA = 0;
    private int countActivePromotionB = 0;
    private int countActivePromotionC = 0;
    private int countActivePromotionD = 0;

    public int calculateTotalPrice(){
        int total = 0;

        if(countActivePromotionA > 0) {
            total = total + (countActivePromotionA * UNITPRICE_A);
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
