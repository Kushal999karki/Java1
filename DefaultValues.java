public class DefaultValues {
    byte byteValue;
    short shortValue;
    int intValue;
    long longValue;
    float floatValue;
    double doubleValue;
    char charValue;
    boolean booleanValue;
    public static void main(String[] args) {
        DefaultValues obj = new DefaultValues();
        System.out.println("Default Values of Primitive Data Types:");
        System.out.println("byte:\t\t" + obj.byteValue);
        System.out.println("short:\t\t" + obj.shortValue);
        System.out.println("int:\t\t" + obj.intValue);
        System.out.println("long:\t\t" + obj.longValue);
        System.out.println("float:\t\t" + obj.floatValue);
        System.out.println("double:\t\t" + obj.doubleValue);
        System.out.println("char:\t\t'" + obj.charValue + "'"); 
        System.out.println("boolean:\t" + obj.booleanValue);
    }
}