public class Dragon {
    // instance variables
    int health;
    int strength;
    int level;
    int dragonAttackDmg;
    int dragonTotalAttack;
    boolean dead;

    // constructor
    public Dragon() {
        health = 100;
        strength = 1;
        level = 1;
        dragonAttackDmg = 0;
        dragonTotalAttack = 0;
        dead = false;
    }

    // getter methods
    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public int getLevel() {
        return level;
    }

    public int getDragonAttackDmg() {
        return dragonAttackDmg;
    }

    public int getDragonTotalAttack() {
        return dragonTotalAttack;
    }

    public boolean isDead() {
        return dead;
    }

    // public methods
    public void takeDamage(int damage) {
        health -= damage;
        if (health <= 0 && !dead) {
            dead = true;
            health = 0;
            System.out.println("The dragon takes " + damage + " damage and now has " + health + " health!");
            System.out.println("The dragon has been slayed!");
        } else if (dead) {
            health = 0;
            System.out.println("The dragon is already dead!");
        } else {
            System.out.println("The dragon takes " + damage + " damage and now has " + health + " health!");
        }
    }

    public int attack() {
        dragonAttackDmg = strength * level;
        dragonTotalAttack += dragonAttackDmg;
        System.out.println("The dragon attacks for " + dragonAttackDmg + " health points!");
        if (dragonTotalAttack >= 50) {
            level++;
            System.out.println("The dragon has reached level " + level + "!");
            dragonTotalAttack = 0;
        }
        return dragonAttackDmg;
    }

    public void powerUp(int decision) {
        if (decision == 1) {
            health *= 2;
            System.out.println("The dragon's health has increased to " + health + "!");
        } else {
            strength *= 2;
            System.out.println("The dragon's strength has increased to " + strength + "!");
        }
    }

    public String toString() {
        return "Dragon's Current State:\nHealth: " + health + "\nStrength: " + strength + "\nLevel: " + level + "\nDead: " + dead + "\nAttack Damage: " + dragonTotalAttack;
    }
}