package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Warrior extends Hero {
    private int criticalDamage;
    public void setCriticalDamage(int criticalDamage) {
        this.criticalDamage = criticalDamage;
    }

    public Warrior(int health, int damage, String name) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE, name);
    }
    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int random = RPG_Game.random.nextInt(3) + 1;
        if (RPG_Game.getRoundNumber() % 3 == 0) {
            setCriticalDamage(this.getDamage() * random);
            boss.setHealth(boss.getHealth() - criticalDamage);
            System.out.println("                                            !!!Warrior made Critical Damage to Boss!!!");
        }
    }


}
