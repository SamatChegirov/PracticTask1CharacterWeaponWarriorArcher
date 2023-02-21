public class Weapon {
    private WeaponType weaponType;

    public Weapon(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public void attack(){
        System.out.println("Оружие атакует.");
    }

    @Override
    public String toString() {
        return "weapon " + weaponType;
    }
}
