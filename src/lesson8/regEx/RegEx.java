package lesson8.regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    public static void main(String[] args) {

        ex1();
        ex2();
        ex3();

    }

    private static void ex3() {



    }

    private static void ex2() {



    }

    private static void ex1() {




        String greedy = "А.+а";
        String greediest = "А.++а"; // После захвата всей строки матчер добавляет остаток шаблона и сравнивает с захваченной строкой
        String lazy = "А.+?а";
        String text = "Дыня Арбуз Ананас";

        System.out.println("========================");
        Pattern pattern = Pattern.compile(greedy);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
        System.out.println("========================");
    }
}
