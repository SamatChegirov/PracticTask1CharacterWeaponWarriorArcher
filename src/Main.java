public class Main {
    public static void main(String[] args) {

        Character warrior1 = new Warrior("Gladiator", 100, 10, 200);
        Character warrior2 = new Warrior("Aсhilles", 100, 5, 190);
        Character archer1 = new Archer("Makedonskiy", 90, 5, 150);
        Character archer2 = new Archer("Timuchin", 100, 10, 200);

        Character[] characters = new Character[]{warrior1, archer1, warrior2, archer2};
        for (Character c : characters) {
            if (warrior1 == c) {
                System.out.println(c + " " + new Weapon(WeaponType.AXE));
                c.attack();
            } else if (warrior2 == c) {
                System.out.println(c + " " + new Weapon(WeaponType.SWORD));
                c.attack();
            } else if (archer1 == c) {
                System.out.println(c + " " + new Weapon(WeaponType.BOW));
                c.attack();
            } else {
                System.out.println(c + " " + new Weapon(WeaponType.BOW));
                c.attack();
            }
        }
    }
}