package ru.babushkina.week5.homework.model;

public  abstract class AbstractAnimal {
    abstract void inhabit();
    void rest() {
        System.out.println("Привет! Я животное и очень люблю хорошо отдохнуть.");
    }
}