public class Archer extends Character {
        private Weapon weapon;

        public Archer(String name, int speed, int force, int agility) {
                super(name, speed, force, agility);
        }

        @Override
        public Weapon getWeapon() {
                return weapon;
        }

        @Override
        public void setWeapon(Weapon weapon) {
                this.weapon = weapon;
        }

}
