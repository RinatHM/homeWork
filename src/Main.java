import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        FamilyTree familyTree = new FamilyTree();

        // Создаем членов семьи
        Human rinat = new Human("Rinat", Gender.MALE, LocalDate.of(1967, 1, 1));
        Human railya = new Human("Railya", Gender.FEMALE, LocalDate.of(1980, 1, 1));
        Human halim = new Human("Halim", Gender.MALE, LocalDate.of(1937, 1, 1), LocalDate.of(2019, 1, 1));
        Human gulsum = new Human("Gulsum", Gender.FEMALE, LocalDate.of(1940, 1, 1));
        Human shamgiyamal = new Human("Shamgiyamal", Gender.FEMALE, LocalDate.of(1917, 1, 1), LocalDate.of(1987, 1, 1));
        Human sharafey = new Human("Sharafey", Gender.MALE, LocalDate.of(1913, 1, 1), LocalDate.of(1992, 1, 1));
        Human fatima = new Human("Fatima", Gender.FEMALE, LocalDate.of(1915, 1, 1), LocalDate.of(1983, 1, 1));
        Human salim = new Human("Salim", Gender.MALE, LocalDate.of(1910, 1, 1), LocalDate.of(1943, 1, 1));
        Human timur = new Human("Timur", Gender.MALE, LocalDate.of(1994, 1, 1));
        Human artyom = new Human("Artyom", Gender.MALE, LocalDate.of(2005, 1, 1));
        Human karim = new Human("Karim", Gender.MALE, LocalDate.of(2017, 1, 1));
        Human yasmina = new Human("Yasmina", Gender.FEMALE, LocalDate.of(2017, 1, 1));
        Human azaliya = new Human("Azaliya", Gender.FEMALE, LocalDate.of(2019, 1, 1));
        Human khalida = new Human("Khalida", Gender.FEMALE, LocalDate.of(1962, 1, 1));
        Human larisa = new Human("Larisa", Gender.FEMALE, LocalDate.of(1966, 1, 1));

        // Устанавливаем родителей
        rinat.setFather(halim);
        rinat.setMother(gulsum);

        timur.setFather(rinat);
        timur.setMother(railya);

        artyom.setFather(rinat);
        artyom.setMother(railya);

        karim.setFather(rinat);
        karim.setMother(railya);

        yasmina.setFather(rinat);
        yasmina.setMother(railya);

        azaliya.setFather(rinat);
        azaliya.setMother(railya);

        // Устанавливаем бабушек и дедушек
        gulsum.setFather(sharafey);
        gulsum.setMother(shamgiyamal);

        halim.setFather(salim);
        halim.setMother(fatima);

        // Добавляем детей
        halim.addChild(rinat);
        gulsum.addChild(rinat);
        gulsum.addChild(khalida);
        gulsum.addChild(larisa);

        rinat.addChild(timur);
        rinat.addChild(artyom);
        rinat.addChild(karim);
        rinat.addChild(yasmina);
        rinat.addChild(azaliya);

        railya.addChild(timur);
        railya.addChild(artyom);
        railya.addChild(karim);
        railya.addChild(yasmina);
        railya.addChild(azaliya);

        // Добавляем членов семьи в FamilyTree
        familyTree.addMember(rinat);
        familyTree.addMember(railya);
        familyTree.addMember(halim);
        familyTree.addMember(gulsum);
        familyTree.addMember(shamgiyamal);
        familyTree.addMember(sharafey);
        familyTree.addMember(fatima);
        familyTree.addMember(salim);
        familyTree.addMember(timur);
        familyTree.addMember(artyom);
        familyTree.addMember(karim);
        familyTree.addMember(yasmina);
        familyTree.addMember(azaliya);
        familyTree.addMember(khalida);
        familyTree.addMember(larisa);

        // Печатаем генеалогическое древо
        familyTree.printFamilyTree();
    }
}