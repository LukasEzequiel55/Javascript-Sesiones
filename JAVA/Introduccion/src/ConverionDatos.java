public class ConverionDatos {
    public static void main(String[] args) {
        //Conversión implicita de menos a más
        //byte ->short -> int -> float -> double

        byte valorByte = 24;
        short valorShort = valorByte; // 24
        int valorInteger = valorShort; // 24
        long valorLong = valorInteger; // 24
        float valorFloat = valorLong; // 24.0
        double valorDouble = valorFloat; // 24

        //Conversión explicita (de mayor a menor)
        //double -> float -> long -> int -> short -> byte

        double valorDouble2 = 123.456;
        float valorFloat2 = (float) valorDouble2;
        long valorLong2 = (long) valorFloat2;
        int valorInteger2 = (int) valorLong2;
        short valorShort2 = (short) valorInteger2;
        byte valorByte2 = (byte) valorShort2;
/*
        System.out.println("Valor en byte: " + valorByte);
        System.out.println("Short: "+ valorShort);
        System.out.println("Integer: " + valorInteger);
        System.out.println("Float: " + valorFloat);
        System.out.println("Double: " + valorDouble);

 */
        System.out.println("Valor en byte: " + valorByte2);
        System.out.println("Short: "+ valorShort2);
        System.out.println("Integer: " + valorInteger2);
        System.out.println("Long: " + valorLong2);
        System.out.println("Float: " + valorFloat2);
        System.out.println("Double: " + valorDouble2);
    }//main

}//clase
