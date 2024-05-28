import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
    private List<Human> members;

    // Конструктор класса FamilyTree
    public FamilyTree() {
        this.members = new ArrayList<>();
    }

    // Добавление члена семьи
    public void addMember(Human human) {
        this.members.add(human);
    }

    // Поиск члена семьи по имени
    public Human findMember(String name) {
        for (Human member : members) {
            if (member.getName().equals(name)) {
                return member;
            }
        }
        return null;
    }

    // Печать всех членов семьи
    public void printFamilyTree() {
        for (Human member : members) {
            System.out.println(member);
        }
    }
}
