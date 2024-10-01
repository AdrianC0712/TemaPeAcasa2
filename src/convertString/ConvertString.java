package convertString;

public class ConvertString {
    public static void main(String[] args) {

        String booleanString = "tRue";
        boolean boolValue = Boolean.parseBoolean(booleanString);
        System.out.println("String in boolean: " + boolValue);

        String byteString = "120";
        byte byteValue = Byte.parseByte(byteString);
        System.out.println("String in byte: " + byteValue);

        String shortString = "32000";
        short shortValue = Short.parseShort(shortString);
        System.out.println("String in short: " + shortValue);

        String intString = "147895632";
        int intValue = Integer.parseInt(intString);
        System.out.println("String in int: " + intValue);

        String longString = "987654321987654321";
        long longValue = Long.parseLong(longString);
        System.out.println("String in long: " + longValue);

        String doubleString = "4444.5d";
        double doubleValue = Double.parseDouble(doubleString);
        System.out.println("String in double: " + doubleValue);

        String floatString = "2354.56f";
        float floatValue = Float.parseFloat(floatString);
        System.out.println("String in float: " + floatValue);

    }
}
