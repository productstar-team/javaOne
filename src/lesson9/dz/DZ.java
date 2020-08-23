package lesson9.dz;

import java.util.regex.Pattern;

public class DZ {

    private static final String[] prise = {"10.2", "0", "-33.9", "777.9", "36.2", "100000000.0", "372.9", "100"};
    private static final Integer TAX_10 = 10;
    private static final Integer TAX_20 = 20;
    private static final Integer TAX_30 = 30;
    private static final String PATTERN = "^[+]?[0-9]*[.,]?[0-9]+(?:[eE][-+]?[0-9]+)?$";

    public static void main(String[] args) {

        printTax(prise);
    }

    private static void printTax(String[] prise) {
        for (String s : prise) {
            if (Pattern.matches(PATTERN, s)) {
                Double aDouble = Double.valueOf(s);
                if (0 < aDouble && aDouble <= 100) {
                    System.out.println(calcTax(aDouble, TAX_10));
                    continue;
                }
                if (100 < aDouble && aDouble <= 1000) {
                    System.out.println(calcTax(aDouble, TAX_20));
                    continue;
                }
                if (1000 < aDouble && aDouble <= 10000) {
                    System.out.println(calcTax(aDouble, TAX_30));
                }
            }
        }
    }

    private static Double calcTax(Double aDouble, Integer tax) {
        return aDouble * tax / 100;
    }
}

