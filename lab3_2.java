package lab3;

public class lab3_2 {
    public static void main(String[] args) {
        Double double_obj1 = Double.valueOf(2.7);
        Double double_obj2 = Double.valueOf("2.7");

        System.out.println(double_obj1 + " " + double_obj2);
        // ---------------------------------------------------
        String string_obj = "3.14";
        Double double_obj3 = Double.parseDouble(string_obj);

        System.out.println(double_obj3);
        // ---------------------------------------------------
        Double doubleObj = Double.valueOf(3.14);

        double primitiveDouble = doubleObj.doubleValue();
        float primitiveFloat = doubleObj.floatValue();
        long primitiveLong = doubleObj.longValue();
        int primitiveInt = doubleObj.intValue();
        short primitiveShort = doubleObj.shortValue();
        byte primitiveByte = doubleObj.byteValue();

        System.out.println("double: " + primitiveDouble);
        System.out.println("float: " + primitiveFloat);
        System.out.println("long: " + primitiveLong);
        System.out.println("int: " + primitiveInt);
        System.out.println("short: " + primitiveShort);
        System.out.println("byte: " + primitiveByte);
        // ---------------------------------------------------
        String d = Double.toString(3.14);

        System.out.println(d);
    }
}
