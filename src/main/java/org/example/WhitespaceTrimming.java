package org.example;


public class WhitespaceTrimming {
    public String removeAllSpaces(String input) {
        if (input.isEmpty()) {
            return "Строка пустая или содержит только пробелы!";
        }

        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (!Character.isWhitespace(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
