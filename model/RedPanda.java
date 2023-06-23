package ru.babushkina.week5.homework.model;

public class RedPanda extends AbstractAnimal {
    @Override
    void inhabit() {
        System.out.println("Привет! Меня зовут Ру. Я красная панда и обитаю в горных лесах, поэтому меня можно найти в Азиатском саду нашего зоопарка!");
    }

    @Override
    void rest() {
        System.out.println("Я та самая красная панда Ру и очень люблю отдыхать, уютно устроившись на ветке дерева.");
    }
}
