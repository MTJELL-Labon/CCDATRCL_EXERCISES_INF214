public class App {
    public static void main(String[] args) {

        // Character Class
        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();

        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();

        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Gondar";
        thief.sayMyName();

        // Enemy Class
        Enemy boss = new Enemy();

        boss.damage = 50;
        boss.health = 500;
        boss.armor = 100;
        boss.hasMagicImmunity = true;
        boss.name = "Roshan";
        boss.enemyDialogue();

        Enemy skeleton = new Enemy();

        skeleton.damage = 5;
        skeleton.health = 10;
        skeleton.armor = 5;
        skeleton.hasMagicImmunity = false;
        skeleton.name = "Common Skeleton Warrior";
        skeleton.enemyDialogue();

        Enemy dragon = new Enemy();

        dragon.damage = 40;
        dragon.health = 400;
        dragon.armor = 75;
        dragon.hasMagicImmunity = false;
        dragon.name = "Ancient Wyvern";
        dragon.enemyDialogue();

        Weapon Kulshedra = new Weapon();
        Kulshedra.WeaponType = "Whip";
        Kulshedra.name = "Kulshedra";
        Kulshedra.damage = 75;
        Kulshedra.weight = 5;
        Kulshedra.rarity = "Rare";
        Kulshedra.description = "A possessed whip, sealing away the soul of the ancient serpentine demon Kulshedra. Summoning the power of the demon from a portal on the weapon's hilt, it can be used in the same manner as a normal whip.";
        Kulshedra.weaponDecription();

        Weapon ScarboroughFair = new Weapon("Guns", "Scarborough Fair", 50, 10, "Uncommon", "Crafted by the famed demon-smith Rodin, these four guns have been crowned with the names Parsley, Sage, Rosemary, and Thyme. Pushing the owners magic to its limits, these guns' rate of fire and stopping power are incredible.");
        ScarboroughFair.weaponDecription();

        Weapon Shuraba = new Weapon ("Katana", "Shuraba", 100, 15, "Legendary", "A living katana, pulsing with the heart of Ashura, the demon god of war. Always seeking blood, the blade will even suck the very souls out of its victims.");
        Shuraba.weaponDecription();


    }
}
