public class FirstAddressExercise {
    
    
    public static void main(String[] args) {
        System.out.println("First Java application");  
        displayAddress();  
    }

    
    public static void displayAddress() {
        String companyName = "Samsung Electronics";
        String addressLine1 = "129 Samsung-Ro";  
        String addressLine2 = "Yeongtong District, Suwon, South Korea";  
        String brand = "Samsung";

        System.out.println(companyName);
        System.out.println(addressLine1);
        System.out.println(addressLine2);
        System.out.println("Company: " + brand);
    }
}