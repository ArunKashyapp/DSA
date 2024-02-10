 

package oddEVEN;



public class Deloitte {
    
    // Binary to Decimal Conversion
    public static int binaryToDecimal(String binary) {
        return Integer.parseInt(binary, 2);
    }
    
    // Decimal to Binary Conversion
    public static String decimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }
    
    // Decimal to Hexadecimal Conversion
    public static String decimalToHexadecimal(int decimal) {
        return Integer.toHexString(decimal).toUpperCase();
    }
    
    // Hexadecimal to Decimal Conversion
    public static int hexadecimalToDecimal(String hex) {
        return Integer.parseInt(hex, 16);
    }
    
    // Main method for testing
    public static void main(String[] args) {
        // Test conversions
        String binary = "1010";
        int decimal = 42;
        String hex = "2A";
        
        System.out.println("Binary to Decimal: " + binaryToDecimal(binary));
        System.out.println("Decimal to Binary: " + decimalToBinary(decimal));
        System.out.println("Decimal to Hexadecimal: " + decimalToHexadecimal(decimal));
        System.out.println("Hexadecimal to Decimal: " + hexadecimalToDecimal(hex));
    }
}
