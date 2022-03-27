/*
Создай public static классы Dog, Cat.

Добавь по три поля в каждый класс, на твой выбор.
Создай объекты для героев мультика Том и Джерри. Так много, как только вспомнишь.

Пример:
Mouse jerryMouse = new Mouse(“Jerry”, 12 (высота, см) , 5 (длина хвоста, см))
 */
public class Task13 {
    public static void main(String[] args) {
        Mouse jerryJerry = new Mouse("Джерри", 15, "Мультик");
        Dog bulDog = new Dog("Буль", 25, "Мультик");
        Cat tomCat = new Cat("Том", 20, "Мультик");
        System.out.println(jerryJerry);
    }

    public static class Mouse {
        String name;
        int age;
        String address;

        public Mouse(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString() {
            return name + " " + age + " " + address;
        }
    }

    public static class Dog {
        String name;
        int age;
        String address;

        public Dog(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static class Cat {
        String name;
        int age;
        String address;

        public Cat(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}
