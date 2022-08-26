public class App {
    public static void main(String[] args) {

        // Character Class
        Character Demons = new Character();

        Demons.strength = 10;
        Demons.agility = 5;
        Demons.intelligence = 0;
        Demons.name = "Rodin";
        Demons.sayMyName();

        Character Witch = new Character();

        Witch.strength = 0;
        Witch.agility = 5;
        Witch.intelligence = 10;
        Witch.name = "Bayonetta";
        Witch.sayMyName();

        Character Rogue = new Character();

        Rogue.strength = 5;
        Rogue.agility = 10;
        Rogue.intelligence = 0;
        Rogue.name = "Luka";
        Rogue.sayMyName();

        // Enemy Class
        Enemy Sage = new Enemy();

        Sage.damage = 50;
        Sage.health = 500;
        Sage.armor = 100;
        Sage.hasMagicImmunity = true;
        Sage.name = "Balder";
        Sage.enemyDialogue();

        Enemy Angels = new Enemy();

        Angels.damage = 5;
        Angels.health = 10;
        Angels.armor = 5;
        Angels.hasMagicImmunity = false;
        Angels.name = "Affinity";
        Angels.enemyDialogue();

        Enemy Cardinal = new Enemy();

        Cardinal.damage = 40;
        Cardinal.health = 400;
        Cardinal.armor = 75;
        Cardinal.hasMagicImmunity = false;
        Cardinal.name = "Fortitudo";
        Cardinal.enemyDialogue();

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
