package lesson8.reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionExamples {
    public static void main(String[] args) {
        // телефонный номер
        boolean mobile1 = testMobile("555-1234567");
        boolean mobile2 = testMobile("666-88888888");
        boolean mobile3 = testMobile("777-000111A");
        boolean mobile4 = testMobile("7770001112");

        // email
        boolean email1 = testEmail("word@yandex.ru");
        boolean email2 = testEmail("word-0@mail.ru");
        boolean email5 = testEmail("word+0@gmail.com");
        boolean email6 = testEmail("word+0@gmail.0");
        boolean email7 = testEmail("word+0@gmail0");

        // url
        boolean url1 = testUrl("https://yandex.ru/maps/2/saint-petersburg/?ll=30.315635%2C59.938951&z=11");
        boolean url2 = testUrl("https://yandex.ru/maps/2/saint-petersburg/search/%D0%93%D0%B4%D0%B5%20%D0%BF%D0%BE%D0%B5%D1%81%D1%82%D1%8C/?ll=30.347887%2C59.940203&z=12.94");
        boolean url3 = testUrl("ftp://test");
        boolean url4 = testUrl("ftp:/test");
        boolean url5 = testUrl("https://yandex.ru/maps/2/saint petersburg/?ll=30.315635%2C59.938951&z=11");
        System.out.println();
    }

    /**
     * Все телефонные номера должны быть в формате «xxx-xxxxxxx».
     * Например,
     * 1) 012-6677889 - пройдено
     * 2) 01216677889 - не выполнено, «-» отсутствует
     * 3) A12-6677889 - не выполнено, разрешена только цифра
     * 4) 012-66778899 - не выполнено, только 7 цифр в конце
     */

    public static boolean testMobile(String number) {
        Pattern pattern = Pattern.compile("\\d{3}-\\d{7}");
        Matcher matcher = pattern.matcher(number);
        return matcher.matches();
    }

    /*
     * В данном регулярном выражении указанно, что строка может состоять с _A-Za-z0-9 допускаемых символов,
     * после чего идет символ @ и опять допускаемые символы.
     */

    public static boolean testEmail(String email) {
        String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" +
                "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    /*
     * url
     */

    public static boolean testUrl(String url) {
        String URL_PATTERN = "^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
        Pattern pattern = Pattern.compile(URL_PATTERN);
        Matcher matcher = pattern.matcher(url);
        return matcher.matches();
    }

}
