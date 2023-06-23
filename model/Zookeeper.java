package ru.babushkina.week5.homework.model;

public class Zookeeper {
    public void makeVoid(AbstractAnimal abstractAnimal) {
        System.out.println("Привет, ребята! Меня зовут Семён Семёныч. Я смотритель нашего прекрасного зоопарка и сейчас вам покажу, в каких местах обитают некоторые наши животные!");
        abstractAnimal.inhabit();
    }

    public void letRest(AbstractAnimal abstractAnimal) {
        System.out.println("Идёмте дальше! И сейчас я покажу вам, ребята, как отдыхают наши животные!");
        abstractAnimal.rest();
    }
}
