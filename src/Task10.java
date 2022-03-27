/*
Создать класс Friend

Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол
 */
public class Task10 {

}
class Friend {
    String name;
    int age;
    String gender;

    public Friend(String name) {
        this.name = name;
    }

    public Friend(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Friend(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
