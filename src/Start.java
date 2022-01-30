import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        char[] products = new char[]{'A', 'B', 'C', 'D'};
        Scanner scan = new Scanner(System.in);
        PromotionEngine promotionEngine = new PromotionEngine();
        int[] productQty = new int[products.length];
        int qty = 0;

        System.out.println("Promotion Checkout: " +
                "\n 3 of A's for 130" +
                "\n 2 of B's for 45" +
                "\n C & D for 30");
        for(int i = 0; i<products.length; i++) {
            System.out.print("Enter quantity of product ID " + products[i] + " : ");
               qty = scan.nextInt();
               productQty[i] = qty;
        }

        promotionEngine.setCountActivePromotionA(productQty[0]);
        promotionEngine.setCountActivePromotionB(productQty[1]);
        promotionEngine.setCountActivePromotionC(productQty[2]);
        promotionEngine.setCountActivePromotionD(productQty[3]);

       System.out.println("Total Price: " + promotionEngine.calculateTotalPrice());
    }
}
