package lesson8.dz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DZ {


    public static void main(String[] args) {
        dz1();
        dz2();
        dz3();

    }

    /**
     * Напишите регулярное выражение для обнаружения повторяющихся символов
     */

    private static void dz3() {

        System.out.println("Напишите регулярное выражение для обнаружения повторяющихся символов");

        String[] samples = {"dgbvawq", "m,kl;po", "cbcbcbc", "z_qwertyuiop_z"}; // false, false, true, true

        String reg = "(.).*\\1";

        Pattern p = Pattern.compile(reg);

        for (String s : samples) {
            Matcher m = p.matcher(s);
            System.out.println(m.matches());
        }

    }

    /**
     * Напишите регулярное выражение для проверки ip адреса формата IPv4 на валидность
     */

    private static void dz2() {

        System.out.println("Напишите регулярное выражение для проверки ip адреса формата IPv4 на валидность");

        String[] samples = {"0.0.0.0", "08.76.222.1", "192.168.0.1"};

        String reg = "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";

        Pattern p = Pattern.compile(reg);

        for (String s : samples) {
            Matcher m = p.matcher(s);
            System.out.println(m.matches());
        }

    }

    /**
     * 1. Санкт-Петербург
     */
    private static void dz1() {

        System.out.println("Санкт-Петербург...");

        Integer I = 1703;
        String a = "Петром Первым";
        String[] arrayNames = {"Санкт-Петербург", "Петроград", "Ленинград"};
        String b = "Питер";

        String result = String.format("Санкт-Петербург был основан в %d году %s . За свою историю он носил имена: %s, %s, %s. Сейчас многие зовут его просто “%s”."
                , I, a, arrayNames[0], arrayNames[1], arrayNames[2], b);

        System.out.println(result);
    }

}
