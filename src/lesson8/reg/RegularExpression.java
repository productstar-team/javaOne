package lesson8.reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    // регулярное выражение (RegEx) – это шаблон для поиска строки в тексте. <([{\^-=$!|]})?*+.>

    /*
     * Чтобы создать RegEx в Java, нужно сделать два простых шага:
     * Написать его в виде строки с учётом синтаксиса регулярных выражений;
     * Скомпилировать эту строку в регулярное выражение;
     */

    //поиск совпадений с шаблоном будет производиться без учета регистра символов.
    Pattern pattern = Pattern.compile("java", Pattern.CASE_INSENSITIVE);

    public static void main(String[] args) {
        greedyMode();
        superGreedyMode();
        lazyMode();
    }

    /*
     * Жадный режим квантификатора
     * Особенностью квантификаторов является возможность использования их в разных режимах: жадном, сверхжадном и ленивом.
     * Сверхжадный режим включается добавлением символа «+» после квантификатора, а ленивый – символа «?». Например:
     *
     * "А.+а" // жадный режим по сути, Matcher, захватывает все строку до конца – в этом как раз и проявляется его «жадность».
     * "А.++а" // сверхжадный режим. При захватывании текста до конца строки поиск в обратном направлении не происходит.
     * "А.+?а" // ленивый режим. В ленивом ищется самое короткое совпадение в тексте
     */

    /**
     * По умолчанию квантификатор работает в жадном режиме. Это означает, что он ищет максимально длинное совпадение в строке.
     */
    public static void greedyMode() {
        System.out.println("greedyMode:");

        String text = "Дыня Алла Ананас";
        Pattern pattern = Pattern.compile("А.+а");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
    }

    /**
     * После захвата всей строки матчер добавляет остаток шаблона и сравнивает с захваченной строкой.
     * Совпадений не будет найдено.
     */
    private static void superGreedyMode() {
        System.out.println("superGreedyMode:");

        String text = "Дыня Алла Ананас";
        Pattern pattern = Pattern.compile("А.++а");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
    }

    /**
     * При ленивом режиме работы ищется самое короткое совпадение в тексте.
     */
    private static void lazyMode() {
        System.out.println("lazyMode:");

        String text = "Дыня Алла Ананас";
        Pattern pattern = Pattern.compile("А.+?а");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
    }

}
