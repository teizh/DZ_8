package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Berserk extends Hero {
    private int blockedDamage;

    public Berserk(int health, int damage, String name) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {



        if (RPG_Game.getRoundNumber() % 3 == 1) {
            blockedDamage = boss.getDamage() - 40;
            this.setHealth(this.getHealth()+blockedDamage);
            boss.setHealth(boss.getHealth()-blockedDamage);


          /*  for (int i = 0; i < heroes.length; i++) {
                if (heroes[i].getHealth() > 0 && this != heroes[i]) {
                    heroes[i].setHealth(heroes[i].getHealth() + blockedDamage);
                }
            }*/
            System.out.println("                                            !!! Berserk blocked the hit!!!");


        }

     /*   public void setBlockedDamage ( int blockedDamage){
            this.blockedDamage = blockedDamage;

        }*/
    }
}
