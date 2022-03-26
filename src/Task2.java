/*
Реализовать метод fight

Реализовать метод boolean fight(Cat anotherCat): реализовать механизм драки котов
в зависимости от их веса, возраста и силы. Зависимость придумать самому.
Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие:
если cat1.fight(cat2) == true , то cat2.fight(cat1) == false
 */
public class Task2 {
    public static void main(String[] args) {


        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        cat1.name = "Барсик";
        cat1.age = 3;
        cat1.weight = 25;
        cat1.strength = 15;

        cat2.name = "Мурзик";
        cat2.age = 5;
        cat2.weight = 20;
        cat2.strength = 20;


    }
}

class Cat {

    Cat() {

    }

    public String name;
    public int age;
    public int weight;
    public int strength;

    public boolean fight(Cat anotherCat) {
        int incStr = this.strength > anotherCat.strength ? 1 : 0;
        return (incStr) > 0;
    }
}




