public class App {
    public static void main(String[] args) {

        // Character Class
        Character Witch = new Character();

        Witch.strength = 0;
        Witch.agility = 5;
        Witch.intelligence = 10;
        Witch.name = "Bayonetta";
        Witch.quotes = "Don't fuck with a witch!";
        Witch.sayMyName();
        
        Character Demon = new Character();

        Demon.strength = 5;
        Demon.agility = 10;
        Demon.intelligence = 0;
        Demon.name = "Rodin";
        Demon.quotes = "No matter how much you ask, I'm not puttin' a chainsaw on your arm. Now, what do you want?";
        Demon.sayMyName();
       
        Character Human = new Character();

        Human.strength = 10;
        Human.agility = 5;
        Human.intelligence = 0;
        Human.name = "Luka";
        Human.quotes = "Do you believe in fate?";
        Human.sayMyName();

        // Enemy Class
        Enemy LumenSage = new Enemy();

        LumenSage.damage = 50;
        LumenSage.health = 500;
        LumenSage.armor = 100;
        LumenSage.hasMagicImmunity = true;
        LumenSage.name = "Balder";
        LumenSage.quotes = "The time has come to awaken the Eyes of the World.";
        LumenSage.enemyDialogue();

        Enemy Angels = new Enemy();

        Angels.damage = 5;
        Angels.health = 10;
        Angels.armor = 5;
        Angels.hasMagicImmunity = false;
        Angels.name = "Affinity";
        Angels.quotes = "Ethar(Peace)";
        Angels.enemyDialogue();

        Enemy Cardinal = new Enemy();

        Cardinal.damage = 40;
        Cardinal.health = 400;
        Cardinal.armor = 75;
        Cardinal.hasMagicImmunity = false;
        Cardinal.name = "Temperantia";
        Cardinal.quotes = "We have but one goal: resurrecting the Creator and reunifying the Trinity of Realities. That shall be the purpose of your sacrifice!";
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
