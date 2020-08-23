package lesson8.strings;

public class StringApi {
    public static void main(String[] args) {
        charAt();
        compareTo();
        concat();
        contains(); // *
        copyValueOf();
        equals(); // *
        indexOf();
        isEmpty(); // *
        isBlank(); // *
        join();
        split(); // *
        substring();
        toCharArray();
        length(); // *
        toLowerCase(); // *
        trim(); // *
        replace();
        replaceAll();
    }

    /**
     * Возвращает символ с указанным смещением в этой строке. Отсчёт идёт от 0.
     * Для извлечения нескольких символов используйте getChars()
     */
    public static void charAt() {
        char myChar = "abc".charAt(2);
        System.out.println();
    }

    /**
     * Сравнивает указанную строку, используя значения символов Unicode и вычисляет, какая из строк меньше, равна или больше следующей.
     * Регистр учитывается. Если регистр не должен учитываться используйте метод compareToIgnoreCase (String string).
     * Если строки совпадают, то возвращается 0, если меньше нуля, то вызывающая строка меньше строки string, если больше нуля,
     * то вызывающая строка больше строки string. Слова с большим регистром стоят выше слова с нижним регистром.
     */
    public static void compareTo() {
        String testString = "aaa";
        String testString2 = "zzz";
        int i = testString.compareTo(testString2);
        System.out.println();
    }

    /**
     * Объединяет строку с указанной строкой. Возвращается новая строка, которая содержит объединение двух строк.
     */
    public static void concat() {
        String testString = "aaa";
        String testString2 = "bbb";
        testString.concat(testString2);
        String concat = testString.concat(testString2);
        System.out.println();
    }

    /**
     * Определяет, содержит ли строка последовательность символов в CharSequence
     */
    public static void contains() {
        boolean b = "abc".contains("a");
        boolean b2 = "abc".contains("z");
        System.out.println();
    }

    /**
     * Создаёт новую строку, содержащую указанные символы из массива data начиная с позиции start (нумерация начинается с нуля) длинной length.
     * Если указать индекс вне границ строки, то возникнет исключение StringIndexOutOfBoundsException.
     */
    public static void copyValueOf() {
        char[] textArray = {'H', 'I', ' ', 'w', 'o', 'r', 'l', 'd', '!', 'z', 'z', 'z'};
        String newString = String.copyValueOf(textArray, 2, 7);
        System.out.println();
    }

    /**
     * Сравнивает указанный объект и строку и возвращает true, если сравниваемые строки равны,
     * т.е. содержит те же символы и в том же порядке с учётом регистра.
     * <p>
     * Не путать метод с оператором ==, который сравнивает две ссылки на объекты и определяет, ссылаются ли они на один и тот же экземпляр.
     * <p>
     * public boolean equalsIgnoreCase(String string)
     * Сравнивает указанную строку с исходной строкой без учёта регистра и возвращает true, если они равны.
     * Диапазон A-Z считается равным диапазону a-z.
     */
    public static void equals() {
        boolean b = "abc".equals("ABC");
        System.out.println();
    }

    /**
     * Ищет появление указанного символа и возвращает позицию индекса. Если символа нет, то возвращается -1.
     * <p>
     * public int indexOf (int ch, int fromIndex)
     * Ищет индекс символа сh, начиная с позиции fromIndex
     */
    public static void indexOf() {
        int i = "abc".indexOf('a');
        System.out.println();
    }

    /**
     * Проверяет, является ли строка пустой
     */
    public static void isEmpty() {
        boolean b1 = "abc".isEmpty();
        boolean b2 = "     ".isEmpty();
        boolean b3 = "".isEmpty();
        System.out.println();
    }

    /**
     * разница в проверке пробела
     */
    public static void isBlank() {
        boolean b1 = "abc".isEmpty();
        boolean b2 = "     ".isEmpty();
        boolean b3 = "   ?  ".isEmpty();
        boolean b4 = "".isEmpty();

        boolean b_1 = "abc".isBlank(); // 11 jdk
        boolean b_2 = "     ".isBlank();
        boolean b_3 = "  ?   ".isBlank();
        boolean b_4 = "".isBlank();
        System.out.println();
    }

    /**
     * Склеивает слова указанным разделителем. Если слово является null, то null будет использоваться в качестве слова.
     */
    public static void join() {
        String testString = "abc";
        String testString2 = null;
        String testString3 = " ";
        String total = String.join(testString, testString2, testString3, testString);
        System.out.println();
    }

    /**
     * public String[] split (String regularExpression) и другие перегруженные версии
     * Разбивает строку на массив из слов
     */
    public static void split() {
        String[] strings1 = "asd zx.c dsf. ewr ".split(" ");
        String[] strings2 = "asd zx.c dsf. ewr ".split("d");
        String[] strings3 = "asd zx.c dsf. ewr ".split("\\.");
        System.out.println();
    }

    /**
     * public String substring(int start) и другие перегруженные версии
     * Создаёт новую последовательность/строку с символами из данной строки
     * Если указать индекс вне границ строки, то возникнет исключение StringIndexOutOfBoundsException.
     */
    public static void substring() {
        String s = "abc".substring(0, 1);
        System.out.println();
    }

    /**
     * Копирует символы в этой строке в массив символов.
     */
    public static void toCharArray() {
        char[] chars = "Копирует символы в этой строке в массив символов. ".toCharArray();
        System.out.println();
    }

    /**
     * Возвращает длину строки
     */
    public static void length() {
        int i = "abc".length();
        System.out.println();
    }

    /**
     * public String toLowerCase() и другие перегруженные версии
     * Преобразовывает строку в нижний регистр.
     */
    public static void toLowerCase() {
        String replace = "public String toLowerCase()".toLowerCase();
        System.out.println();
    }

    /**
     * Удаляет пробелы в начале и в конце строки.
     */
    public static void trim() {
        String str = "   Удаляет пробелы в начале и в конце строки.  ".trim();
        System.out.println();
    }



    /**
     * public String replace(CharSequence target, CharSequence replacement) и другие перегруженные версии
     * Меняет символ или последовательность символов target на replacement
     */
    public static void replace() {
        String s = "aaaaaa";
        String replace = s.replace("a", "z");
        System.out.println();
    }

    public static void replaceAll() {
        int i = Integer.parseInt("aaaaaa123".replaceAll("[\\D]", ""));
        int j = Integer.parseInt("123zzzzzz".replaceAll("[\\D]", ""));
        int k = Integer.parseInt("1_2_??_3_q".replaceAll("[\\D]", ""));
        System.out.println();
    }

}
