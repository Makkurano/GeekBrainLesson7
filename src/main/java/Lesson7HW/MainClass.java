package Lesson7HW;

public class MainClass {

    public static void main(String[] args) {

        Cat[] cats = new Cat[4];
        cats[0] = new Cat("Вася", 15);
        cats[1] = new Cat("Барсик", 5);
        cats[2] = new Cat("Рыжик", 20);
        cats[3] = new Cat("Фараон", 30);
        Plate plate = new Plate("кормушка большая", 100);
        Plate plate2 = new Plate("кормушка малая", 50); // Не пригодилось. Было блюдцем для тестов.
        plate.info();
        cats[0].eat(plate);
        plate.info();
        cats[1].eat(plate);
        plate.info();
        cats[2].eat(plate);
        plate.info();
        cats[3].eat(plate); // Покормили всех которв
        plate.info(); // Вывод остатков в тарелке
        plate.setAddFood(30); // Добавление еды в тарелку
        plate.info(); // Вывод сколько после добавления
        cats[3].eat(plate);
        cats[3].eat(plate);
        cats[1].eat(plate); // Долеи котами оставшуюся еду, что бы какому-нибудь не хватило
        cats[0].isSatiety();
        cats[1].isSatiety();
        cats[2].isSatiety();
        cats[3].isSatiety(); // Выводим голодность котов
        plate.info(); // Выводим остаток в тарелке
    }
}
