// Класс Героя
class Hero {
    private int health;
    private int damage;
    private String superAbility;

    // Конструктор, задающий все поля
    public Hero(int health, int damage, String superAbility) {
        this.health = health;
        this.damage = damage;
        this.superAbility = superAbility;
    }

    // Конструктор, задающий только здоровье и урон
    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
        this.superAbility = "Нет"; // По умолчанию, если не задана суперспособность
    }

    // Геттеры
    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperAbility() {
        return superAbility;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "health=" + health +
                ", damage=" + damage +
                ", superAbility='" + superAbility + '\'' +
                '}';
    }
}

// Класс Босса
class Boss {
    private int health;
    private int damage;
    private String defenseType;

    // Геттеры
    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getDefenseType() {
        return defenseType;
    }

    // Сеттеры
    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setDefenseType(String defenseType) {
        this.defenseType = defenseType;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "health=" + health +
                ", damage=" + damage +
                ", defenseType='" + defenseType + '\'' +
                '}';
    }
}

// Класс Main
public class Main {
    public static void main(String[] args) {
        // Создание экземпляра босса и задание ему свойств
        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(50);
        boss.setDefenseType("Shield");

        // Печать информации о боссе
        System.out.println(boss);

        // Вызов метода createHeroes и печать информации о героях
        Hero[] heroes = createHeroes();
        for (Hero hero : heroes) {
            System.out.println(hero);
        }
    }

    // Метод для создания героев
    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(100, 30, "Fireball");
        Hero hero2 = new Hero(80, 25);
        Hero hero3 = new Hero(120, 20, "Lightning Strike");

        return new Hero[]{hero1, hero2, hero3};
    }
}