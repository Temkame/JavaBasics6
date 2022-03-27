/*
Man and Woman

1. Внутри класса Task12 создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными, используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
 */
public class Task12 {
    public static void main(String[] args) {
        Man man1 = new Man("Артем", 38, "Москва");
        System.out.println(man1);
        Man man2 = new Man("Сергей", 35, "Москва");
        System.out.println(man2);

        Woman woman1 = new Woman("Эльмира", 25, "Москва");
        System.out.println(woman1);
        Woman woman2 = new Woman("Евгения", 42, "Москва");
        System.out.println(woman2);

    }

    public static class Man {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString() {
            return name + " " + age + " " + address;
        }

    }

    public static class Woman {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString() {
            return name + " " + age + " " + address;

        }
    }
}
