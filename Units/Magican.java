package Units;

public class Magican extends Shooter {
    protected float mana;

    Magican(String name, float hp, float luck, int speed, int damage,
            int distance, int maxCountBullet, float accuracy, float armor, float mana) {
        super(name, hp, luck, speed, damage, distance, maxCountBullet, accuracy, armor);
        this.mana = mana;
    }

    void addMana() {

    }
}