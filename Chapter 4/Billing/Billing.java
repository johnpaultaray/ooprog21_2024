public class Billing
{

   public static void main(String[] args) {
      Billing billing = new Billing();

      billing.computeBill(23.2); 
      billing.computeBill(23.2, 2);
      billing.computeBill(23.2, 4, 10); 
   }

   public void computeBill(double price) {
      double total = price + (price * 0.08); 
      System.out.println("The total price for the bill is: $" + total);
   }


   public void computeBill(double price, int quantity) {
      double total = (price * quantity) + (price * quantity * 0.08); 
      System.out.println("The total price for the bill is: $" + total);
   }


   public void computeBill(double price, int quantity, int coupon) {
      double subtotal = price * quantity;
      double discount = subtotal * (coupon / 100.0);
      double total = (subtotal - discount) + ((subtotal - discount) * 0.08); 
      System.out.println("The total price for the bill is: $" + total);
   }

}
  