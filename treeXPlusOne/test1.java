package treeXPlusOne;

import java.math.BigInteger;
import java.util.Scanner;


public class test1 {
    public static void main(String[] args) {
        //3x+1

        BigInteger number = new BigInteger("5");
        BigInteger currentnumber = number;
        for (; !number.equals(new BigInteger("-1")); number = number.add(BigInteger.ONE)) {
            currentnumber = number;
            while (!currentnumber.equals(BigInteger.valueOf(1))) {
                if (currentnumber.mod(BigInteger.TWO).equals(BigInteger.ZERO)) {
                    currentnumber = currentnumber.divide(BigInteger.TWO);
                } else {
                    currentnumber = currentnumber.multiply(new BigInteger("3"));
                    currentnumber = currentnumber.add(BigInteger.ONE);
                }
            }
        }
        System.out.println(number);
    }
}
