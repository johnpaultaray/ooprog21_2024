public class FirstAddressExercise {
    
    public static void main(String[] args) {
        System.out.println("First Java application");  
        displayAddress(); 
    }
    
    public static void displayAddress() {
        String companyName = "Xiaomi Corporation"; 
        String addressLine1 = "Xiaomi Campus, No. 68 Qinghe Middle Street"; 
        String addressLine2 = "Haidian District, Beijing, China"; 
        String brand = "Xiaomi"; 

        System.out.println(companyName);
        System.out.println(addressLine1);
        System.out.println(addressLine2);
        System.out.println("Company: " + brand);
    }
}
