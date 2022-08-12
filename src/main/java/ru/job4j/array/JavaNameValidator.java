package ru.job4j.array;

public class JavaNameValidator {

    public static boolean isNameValid(String name) {
        int i = 0;
        if (name.isEmpty() || !isLowerLatinLetter(name.codePointAt(i++))) {
            return false;
        }
        while (i < name.length()) {
            int s = name.codePointAt(i++);
            if (!(isSpecialSymbol(s) || isLowerLatinLetter(s)
                    || isUpperLatinLetter(s) || Character.isDigit(s))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code > 64 && code < 91;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code > 96 && code < 123;
    }
}
