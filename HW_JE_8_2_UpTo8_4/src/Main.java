
/**Домашнее задание 8
 * Задание 2
 * Создать классы: 1) Основной класс Device (manufacturer(String), price(float), serialNumber(String));
 * 2) Сабкалсс Monitor (resolutionX(int), resolutionY(int)) and EthernetAdapter (speed (int), mac (String));
 * Добавить методы доступа. Конструктор.
 *
 * Задание 3  *
 * Смотреть задание 2. В обоих классах переопределить метод toString, что бы вывод был следующим:
 * Device: manufacturer =Samsung, price=120, serialNumber=AB1234567CD
 * Monitor: manufacturer =Samsung, price=120, serialNumber=AB1234567CD, X=1280,Y=1024
 *
 * Задание 4
 *
 * Смотреть задание 2. Переопределить методы equals & hashCode в каждом классе.
 * Создать класс Main, в котором создать объекты классов и продемонстрировать переопределенные методы.
 * */


public class Main {
    public static void main(String[] args) {
        Device device1 = new Device("Samsung", 120, "AB1234567CD");
        Monitor monitor1 = new Monitor(device1, 1280, 1024);
        Monitor monitor2 = new Monitor("Samsung", 120, "AB1234567CD", 1280, 1024);
        EthernetAdapter ethernetAdapter1 = new EthernetAdapter("TP-Link Archer C54", 35, "TPUE25Q25873672021", 100, "40-61-86-CF-1C-E6");
        EthernetAdapter ethernetAdapter2 = new EthernetAdapter("Zyxel tornado V78", 27, "ZLQ1544YR72512021UE", 100, "64-EF-41-WQ-1Z-76");
        System.out.println(device1);
        System.out.println(monitor1);
        System.out.println(ethernetAdapter1);
        System.out.println(device1.hashCode());
        System.out.println(monitor1.hashCode());
        System.out.println(monitor2.hashCode());
        System.out.println(monitor1.equals(monitor2));  //monitor1 и monitor2 созданы через new в разных ячейках памяти у них разные ссылки
        System.out.println(ethernetAdapter1.equals(ethernetAdapter2));  //ethernetAdapter1 и ethernetAdapter2 совершенно разные обекты
    }
}
