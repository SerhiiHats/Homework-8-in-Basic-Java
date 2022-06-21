package models;

/**Домашнее задание 8
 Задание 5
 Используя Intelij IDEA создать проект, пакет.
 Создать класс Animal с именем String, возрастом int, хвостом Boolean.
 В классе переопределить метод toString, что бы вывод был сдедующим «Имя: Васька, возраст: 45, хвост: нет».
 В классе Animal переопределить методы equals & hashCode.
 * */

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Васька", 45, true);
        Animal animal2 = new Animal("Мурка", 9, false);

        System.out.println(animal1);
        System.out.println(animal1.equals(animal2));
        System.out.println(animal2);
    }
}
