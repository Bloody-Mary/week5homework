package ru.babushkina.week5.homework.model;

public class PolarBear extends AbstractAnimal {

    @Override
    void inhabit() {
        System.out.println("Привет! Меня зовут Умка! Я полярный медведь и обитаю в Арктике, поэтому меня можно найти в Арктической зоне!");
    }

    @Override
    void rest() {
        super.rest();
        System.out.println("Я очень люблю отдыхать, устроившись на льдине.");
    }
}
