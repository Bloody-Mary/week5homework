package ru.babushkina.week5.homework._main;

import ru.babushkina.week5.homework.model.PolarBear;
import ru.babushkina.week5.homework.model.RedPanda;
import ru.babushkina.week5.homework.model.Whale;
import ru.babushkina.week5.homework.model.Zookeeper;

public class Zoo {
    public static void main(String[] args) {
        Zookeeper zookeeper = new Zookeeper();
        RedPanda roo = new RedPanda();
        Whale jinora = new Whale();
        PolarBear umka = new PolarBear();

        System.out.println("Сейчас смотритель зоопарка покажет некоторых животных.");
        System.out.println("");
        zookeeper.makeVoid(roo);
        System.out.println("");
        zookeeper.makeVoid(jinora);
        System.out.println("");
        zookeeper.makeVoid(umka);

        System.out.println("");

        System.out.println("Сейчас смотритель зоопарка покажет, как отдыхают животные.");
        zookeeper.letRest(roo);
        System.out.println("");
        zookeeper.letRest(jinora);
        System.out.println("");
        zookeeper.letRest(umka);
    }
}
