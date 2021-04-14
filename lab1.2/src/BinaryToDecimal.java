import java.lang.Character;
public class BinaryToDecimal {
    public int convertToDecimal(String binary) {
        int conversion = 1;
        int result = 0;
        for (int i = 1; i <= binary.length(); i++) {
            if (binary.charAt(binary.length() - i) == '1')
                result += conversion;
            conversion *= 2;
        }
        return result;
    }
    public int convertToDecimalAlt(String binary) {
        int result = 0;
        for (int i = 1; i <= binary.length(); i++) {
            if (binary.charAt(binary.length() - i) == '1')
                result += Math.pow(2, i - 1);
        }
        return result;
    }
    public int convertOctalToDecimal(String octal) {
        int result = 0;
        for (int i = 1; i <= octal.length(); i++) {
            int numericValue = Character.getNumericValue(octal.charAt(octal.length() - i));
            if (numericValue >= 0 && numericValue < 8)
                result += Math.pow(8, i - 1) * numericValue;
        }
        return result;
    }

    public int convertDecimalToBase(String binary, int base) {
        int result = 0;
        if (base < 0 || base > 10) {
            throw new IllegalArgumentException("base is out of range");
        }
        for (int i = 1; i <= binary.length(); i++) {
            int numericValue = Character.getNumericValue(binary.charAt(binary.length() - i));
            if (numericValue >= 0 && numericValue < base) {
                result += Math.pow(base, i - 1) * numericValue;
            } else {
                throw new IllegalArgumentException("Number is not valid");
            }
        }
        return result;
    }
    //public int convertToBinary(String binary, int base) { }
    //public int convertToTen() { }

    public static void main(String args[]) {
        BinaryToDecimal binaryToDecimal = new BinaryToDecimal();
        System.out.println(binaryToDecimal.convertToDecimal("10110"));
        System.out.println(binaryToDecimal.convertToDecimalAlt("10110"));
        System.out.println(binaryToDecimal.convertOctalToDecimal("10110"));
        System.out.println(binaryToDecimal.convertDecimalToBase("10110", 5));
        System.out.println(binaryToDecimal.convertDecimalToBase("10110", 2));
        System.out.println(binaryToDecimal.convertDecimalToBase("10110", 2));
        System.out.println(binaryToDecimal.convertDecimalToBase("37422", 8));
        //ERRORS
        System.out.println(binaryToDecimal.convertDecimalToBase("37422", 25));
        System.out.println(binaryToDecimal.convertDecimalToBase("37922", 8));
    }
}