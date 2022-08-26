public class Weapon {
    
    String WeaponType;
    String name;
    int damage;
    int weight;
    String rarity;
    String description;

    public void weaponDecription(){

        System.out.println("\nWeapon Type: " + WeaponType + "\nWeapon Name: " + name + "\nDamage: " + damage + "\nWeight: " + weight + "\nRarity: " + rarity);
        System.out.println("Description: " + description);
    }
     public Weapon(){

    }
    
    public Weapon (String type, String weaponName, int dmg, int wgt, String rar, String desc) {
        WeaponType = type;
        name = weaponName; 
        damage = dmg;
        weight = wgt;
        rarity = rar;
        description = desc;
    }
    
}
