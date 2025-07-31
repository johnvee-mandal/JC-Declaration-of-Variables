package org.example;
import java.lang.String;

public class Main {

    // static variables
    int staticHex = 0x1A2B;
    static byte staticByte = 0b00000001;
    static String staticString = "Progress, not perfection";

    // instance variables
    int instanceBinary = 0b101101;
    int instanceOctal = 072;
    double instanceDouble = 1_234.95;

    public static void main(String[] args) {

    }

    }
public void displayInstanceVariables() {
    System.out.println("\nInstance Variables:");
    System.out.println(" instanceBinary = " + instanceBinary);
    System.out.println(" instanceOctal = " + instanceOctal);
    System.out.println(" instanceDouble = " + instanceDouble);
}

public void displayStaticVariables() {
        System.out.println("\nStatic Variables:");
        System.out.println(" staticHex = " + staticHex);
        System.out.println(" staticByte = " + staticByte);
        System.out.println(" staticString = " + staticString);
    }

public void displayLocalVariables() {
    int localDecimal = 100;
    int localHex = 0xFF;
    int localBinary = 0b1101;
    int localOctal = 014;
    int localLong = 10_000_000L;
    String localString = "Every step I take gets me closer to my goal";
    System.out.println("LocalVariables:");
    System.out.println(" localDecimal = " + localDecimal);
    System.out.println(" localHex = " + localHex);
    System.out.println(" localBinary = " + localBinary);
    System.out.println(" localOctal = " + localOctal);
    System.out.println(" localLong = " + localLong);
    System.out.println(" localString = " + localString);
}
