package lesson8.strings;

public class StringCreate {
    public static void main(String[] args) {

        // Создание строк

        String s = "Ex1";
        String[] numbers = {"One", "2", "III"};
        String str = new String();

        char[] chars = { 'c', 'h', 'a', 'r', 's' };
        String charsString = new String(chars);

        char[] range = {'a', 'b', 'c', 'd', 'a', 'a', 'a', 'a', 'a' };
        String rangeString = new String(chars, 0, 3);

        // Операторы + и += для String
        // плюс (+) означает конкатенацию строк (concatenation), - объединение строк

        int digit = 2020;
        String description = " - очень интеренсный год";
        String about2020 = digit + description; // хотя мы складываем число и строку, все равно получим строку


    }
}
