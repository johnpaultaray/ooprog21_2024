public class MathTest {
public static void main(String[] args) {
// Predefined number for the sqrt method
double number = 37;

// Angle in radians to get specific sin and cos values
double radians = 4.6901; // Approximately 270 degrees in radians

// Value for floor, ceil, and round methods
double value = 22.9;

// Values for max and min comparison
int x = 68;
int y = 71;

// Display results of various Math methods
System.out.println("SQRT: " + Math.sqrt(number)); // Square root of 37
System.out.println("SIN: " + Math.sin(radians)); // Sine of ~270 degrees (4.71239 radians)
System.out.println("COS: " + Math.cos(radians)); // Cosine of ~270 degrees (4.71239 radians)
System.out.println("FLOOR: " + Math.floor(value)); // Floor of 22.9
System.out.println("CEIL: " + Math.ceil(value)); // Ceil of 22.9
System.out.println("ROUND: " + Math.round(value)); // Round 22.9
System.out.println("MAX: " + Math.max(x, y)); // Maximum of 68 and 71
System.out.println("MIN: " + Math.min(x, y)); // Minimum of 68 and 71

// Predefined random value to match the output
double random = 13.762159708531525;
System.out.println("RANDOM: " + Math.random());
}
}
