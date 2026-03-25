package org.example;

public class AgeChecking {
    private final int age;

    public AgeChecking(int age) {
        this.age = age;
    }
    public String ageChecker() {
        String validity;
        if(age <= 0) {
            validity = "Возраст не может быть отрицательным или равным нулю, введите корректное значение.";
        } else if (age < 18) {
            validity = "Вы еще несовершеннолетний и Вам нельзя смотреть фильмы для взрослых.";
        } else {
            validity = "Access is granted! Вы определенно совершеннолетний человек!";
        }
        return validity;
    }
}
