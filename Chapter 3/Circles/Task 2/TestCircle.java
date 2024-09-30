// TASK 2

public class TestCircle {
   public static void main(String[] args) {
   // Creating object in a circle
      Circle a = new Circle();
      Circle b = new Circle();
      Circle c = new Circle();
   
   // Set radius for first circle
      a.setRadius(3);
      System.out.println("Radius of the first circle: " + a.getRadius());
      System.out.println("Diameter of the first circle: " + a.getDiameter());
      System.out.println("Area of the first circle: " + a.getArea());
   
   // Set radius for second circle and print radius, diameter, and area
      b.setRadius(20);
      System.out.println("Radius of the second circle: " + b.getRadius());
      System.out.println("Diameter of the second circle: " + b.getDiameter());
      System.out.println("Area of the second circle: " + b.getArea());
   }
}