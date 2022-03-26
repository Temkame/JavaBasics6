/*
Создать три объекта типа Cat

В методе main создать три объекта типа Cat и заполнить их данными.
Использовать класс Cat из первой задачи. Класс Cat создавать не надо.
 */
public class Task4 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();

        cat1.name = "Мурзик";
        cat1.age = 45;

        cat2.name = "Барсик";
        cat2.age = 55;

        cat3.name = "Боб";
        cat3.age = 15;
    }
}
