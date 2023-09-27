import javax.swing.JOptionPane;

public class Binary_decimal {
    public static void main(String args[]) {
        String binaryStr = JOptionPane.showInputDialog(null, "Enter a binary number to transform it into a decimal number:",
                        "Conversion of binary numbers", JOptionPane.PLAIN_MESSAGE);
        int len = binaryStr.length();
        int result = 0;
        for (int i = len-1; i >= 0; i--) {
            char digit = binaryStr.charAt(i);
            int digitValue = Character.getNumericValue(digit);
            result += digitValue * Math.pow(2, len - 1 - i);
        }
        JOptionPane.showMessageDialog(null, "The binary number in decimal is: " + result, "Result",
                JOptionPane.PLAIN_MESSAGE);
    }
}
