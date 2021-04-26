package com.company;

public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setAttack("magic");
        boss.setHealth(700);
        boss.setDamage(50);

        System.out.println("Суперспособность " + boss.getAttack() + boss.getDamage() + boss.getHealth());

        /*
        Различия между конструктором и сеттером
        сеттер это метод, который находится в классе и присваивает значение полям
        конструктор - это тоже метод, который присваивает значения при создания Класса
         */
    }
}
