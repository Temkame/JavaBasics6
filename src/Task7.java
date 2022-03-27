import java.util.SplittableRandom;

/*
Создать класс Dog

Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
 */
public class Task7 {

}

class Dog {

    String name;
    int growth;
    String color;

    public void initialize(String name) {
        this.name = name;
    }

    public void initialize(String name, int growth) {
        this.name = name;
        this.growth = growth;

    }

    public void initialize(String name, int growth, String color) {
        this.name = name;
        this.growth = growth;
        this.color = color;

    }
}
