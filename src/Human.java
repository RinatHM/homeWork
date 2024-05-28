import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Human {
    private String name;
    private Gender gender;
    private LocalDate birthDate;
    private LocalDate deathDate;
    private Human father;
    private Human mother;
    private List<Human> children;

    // Конструктор для живых людей
    public Human(String name, Gender gender, LocalDate birthDate) {
        this(name, gender, birthDate, null);
    }

    // Конструктор для умерших людей
    public Human(String name, Gender gender, LocalDate birthDate, LocalDate deathDate) {
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.deathDate = deathDate;
        this.children = new ArrayList<>();
    }

    // Получение имени
    public String getName() {
        return name;
    }

    // Получение пола
    public Gender getGender() {
        return gender;
    }

    // Получение даты рождения
    public LocalDate getBirthDate() {
        return birthDate;
    }

    // Получение даты смерти
    public LocalDate getDeathDate() {
        return deathDate;
    }

    // Получение отца
    public Human getFather() {
        return father;
    }

    // Установка отца
    public void setFather(Human father) {
        this.father = father;
    }

    // Получение матери
    public Human getMother() {
        return mother;
    }

    // Установка матери
    public void setMother(Human mother) {
        this.mother = mother;
    }

    // Добавление ребенка
    public void addChild(Human child) {
        this.children.add(child);
    }

    // Получение списка детей
    public List<Human> getChildren() {
        return children;
    }

    // Переопределение метода toString для удобного вывода информации о человеке
    @Override
    public String toString() {
        return "Name: " + name + ", Gender: " + gender + ", Birth Date: " + birthDate + (deathDate != null ? ", Death Date: " + deathDate : "");
    }
}
