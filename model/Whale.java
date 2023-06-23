package ru.babushkina.week5.homework.model;

public class Whale extends AbstractAnimal {
    @Override
    void inhabit() {
        System.out.println("Привет! Меня зовут Джинора. Я кит и обитаю в океане, поэтому меня можно найти в океанариуме нашего зоопарка!");
    }

    @Override
    void rest() {
        System.out.println("Я тот самый кит Джинора, очень люблю отдыхать и делаю это весьма необычно: медленно и спокойно плаваю на поверхности океана.");
    }
}
