public class Character {
    private String name;
    private int speed;
    private int force;
    private int agility;
    private Weapon weapon;

    public Character() {
    }

    public Character(String name, int speed, int force, int agility) {
        this.name = name;
        this.speed = speed;
        this.force = force;
        this.agility = agility;
    }

    public void attack() {
        System.out.println("Персонаж атакует.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Character " + "name: " + name + ", speed " + speed + ", force " + force + ", agility " + agility + ",";
    }
}
