public class GameCharacters {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Stark");
        Archer archer = new Archer("Ashitaka", 100);
        Mage mage = new Mage("Frieren", 100);

        warrior.attack();
        archer.attack();
        mage.attack();
    }
}

abstract class GameCharacter{
    private String name;

    public GameCharacter(String name){
        this.name = name;
    }

    public abstract void attack();

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
}


class Warrior extends GameCharacter{
    public Warrior(String name){
        super(name);
    }

    @Override
    public void attack(){
        System.out.println("Warrior's name: " + getName());
        System.out.println("Weapon: double-headed axe");
        System.out.println(getName() + " swings double-headed axe.");
        System.out.println("Melee-damage: 25");
        System.out.println(" ");
    }
}

class Archer extends GameCharacter{
    private int arrowCount;

    public Archer(String name, int arrowCount){
        super(name);
        this.arrowCount = arrowCount;
    }

    @Override
    public void attack(){
        System.out.println("Archer Name: " + getName());
        System.out.println("Arrow Count: " + arrowCount);
        System.out.println(getName() + " shoots the enemy.");
        System.out.println("Arrow Count: " + --arrowCount);
        System.out.println(" ");
    }
}

class Mage extends GameCharacter{
    int mana;

    public Mage(String name, int mana){
        super(name);
        this.mana = mana;
    }

    @Override
    public void attack(){
        System.out.println("Mage's Name: " + getName());
        System.out.println("Mana percent: " + mana + "%");
        System.out.println(getName() + " uses magic.");
        System.out.println("Mana percent: " + (mana-10) + "%");
    }
}
