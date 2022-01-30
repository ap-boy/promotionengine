public class PromotionEngine {

    private static int UNITPRICE_A = 50;
    private static int UNITPRICE_B = 30;
    private static int UNITPRICE_C = 20;
    private static int UNITPRICE_D = 15;

    private static int PROMOTION_PRICE_A = 130;
    private static int PROMOTION_PRICE_B = 45;
    private static int PROMOTION_PRICE_C_AND_D = 30;

    private int countActivePromotionA = 0;
    private int countActivePromotionB = 0;
    private int countActivePromotionC = 0;
    private int countActivePromotionD = 0;

    private int numberActivePromotionA = 3;
    private int numberActivePromotionB = 2;

    public int calculateTotalPrice(){
        int total = 0;

        if(countActivePromotionA > 0) {
            total = calculateTotalPromotionA(total);
        }
        if(countActivePromotionB > 0) {
            total = calculateTotalPromotionB(total);
        }

        if(countActivePromotionC > 0 && countActivePromotionD > 0) {
            //C & D for 30
            if(countActivePromotionC == countActivePromotionD) {
                total = total + (countActivePromotionC * 30);
            } else if(countActivePromotionC > countActivePromotionD) { //5 - 2
                //then calculate the total and use the modulus to add the extra
                int numberAdditionalC = countActivePromotionC - countActivePromotionD; //3%2 5%2
                total = total + (numberAdditionalC * UNITPRICE_C);

                total = total + (countActivePromotionD * PROMOTION_PRICE_C_AND_D);
            } else if(countActivePromotionD > countActivePromotionC){
                int numberAdditionalD = countActivePromotionD - countActivePromotionC; //3%2 5%2
                total = total + (numberAdditionalD * UNITPRICE_D);

                total = total + (countActivePromotionC * PROMOTION_PRICE_C_AND_D);
            }

        } else if(countActivePromotionC > 0) {
            total = total + (countActivePromotionC * UNITPRICE_C);
        } else if(countActivePromotionD > 0) {
            total = total + (countActivePromotionD * UNITPRICE_D);
        }

        return total;
    }

    private int calculateTotalPromotionB(int total) {
        int nonPromotionItemsPromotionB = getNonPromotionItemsPromotion(countActivePromotionB, numberActivePromotionB);
        if(isNonPromotionItemsForSKU(nonPromotionItemsPromotionB)) {
           total = getTotalForNonPromotionItems(total, nonPromotionItemsPromotionB, UNITPRICE_B);
           countActivePromotionB = countActivePromotionB - nonPromotionItemsPromotionB;
        }
        total = total + ((countActivePromotionB / numberActivePromotionB) * PROMOTION_PRICE_B);
        return total;
    }

    private int calculateTotalPromotionA(int total) {
        int nonPromotionItemsPromotionA = getNonPromotionItemsPromotion(countActivePromotionA, numberActivePromotionA);
        if(isNonPromotionItemsForSKU(nonPromotionItemsPromotionA)) {
            total = getTotalForNonPromotionItems(total, nonPromotionItemsPromotionA, UNITPRICE_A);
            countActivePromotionA = countActivePromotionA - nonPromotionItemsPromotionA;
        }
        total = total + ((countActivePromotionA / numberActivePromotionA) * PROMOTION_PRICE_A);
        return total;
    }

    private int getTotalForNonPromotionItems(int total, int additionalPromotion, int unitPrice) {
        total = total + (additionalPromotion * unitPrice);
        //countActivePromotionA = countActivePromotionA - additionalPromotion;
        return total;
    }

    private boolean isNonPromotionItemsForSKU(int additionalPromotion) {
        return additionalPromotion > 0;
    }

    private int getNonPromotionItemsPromotion(int countActivePromotion, int numberActivePromotion ) {
        int nonPromotionItemsPromotion = (countActivePromotion % numberActivePromotion);
        return nonPromotionItemsPromotion;
    }

    private int getNonPromotionItemsPromotionB() {
        int nonPromotionItemsPromotionA = (countActivePromotionA % numberActivePromotionA);
        return nonPromotionItemsPromotionA;
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
